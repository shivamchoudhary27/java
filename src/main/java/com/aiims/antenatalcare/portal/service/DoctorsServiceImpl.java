package com.aiims.antenatalcare.portal.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aiims.antenatalcare.portal.assembler.HospitalDoctorsAssembler;
import com.aiims.antenatalcare.portal.dto.HospitalDoctorsDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.entity.HospitalDoctors;
import com.aiims.antenatalcare.portal.exception.DateException;
import com.aiims.antenatalcare.portal.exception.EmailAlreadyExists;
import com.aiims.antenatalcare.portal.exception.ResourceNotFoundException;
import com.aiims.antenatalcare.portal.repository.DoctorsRepository;

@Service
public class DoctorsServiceImpl implements DoctorsService {

	@Autowired
	private DoctorsRepository doctorsRepository;

	@Autowired
	public HospitalDoctorsAssembler hospitalDoctorsAssembler;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	Logger logger = LoggerFactory.getLogger(DoctorsServiceImpl.class);

	@Override
	public HospitalDoctorsDto createDoctor(HospitalDoctorsDto doctorDto) {

		HospitalDoctors hospitalDoctors = hospitalDoctorsAssembler.toEntity(doctorDto);
		hospitalDoctors.setPassword(passwordEncoder.encode(doctorDto.getPassword()));
		try {
			HospitalDoctors saveDoctors = doctorsRepository.save(hospitalDoctors);
			doctorDto = hospitalDoctorsAssembler.toDto(saveDoctors);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		return doctorDto;
	}

	@Override
	public HospitalDoctorsDto getDoctor(Long doctorId) {
		HospitalDoctorsDto dto = new HospitalDoctorsDto();
		if (null == doctorId) {
			dto.setDoctorId(-1L);
			return dto;
		}
		Optional<HospitalDoctors> optionalDoctor = doctorsRepository.findById(doctorId);
		if (optionalDoctor.isPresent()) {
			HospitalDoctors doctor = optionalDoctor.get();
			return hospitalDoctorsAssembler.toDto(doctor);
		} else {
			throw new ResourceNotFoundException("Doctor not found ");
		}
	}

	@Override
	public HospitalDoctorsDto updateDoctor(Long doctorId, HospitalDoctorsDto doctorDto) {
		HospitalDoctors doctor = doctorsRepository.findById(doctorId).orElseThrow(null);
		HospitalDoctors updateDoctor = this.hospitalDoctorsAssembler.toEntity(doctorDto);

		if(!doctorDto.getPassword().isBlank())
		{
			
			String updatedPassword = passwordEncoder.encode(doctorDto.getPassword());
			updateDoctor.setPassword(updatedPassword);
		}
		

		HospitalDoctors saveDoctors = this.doctorsRepository.save(updateDoctor);

		return this.hospitalDoctorsAssembler.toDto(saveDoctors);
	}

	@Override
	public Page<HospitalDoctorsDto> getAllDoctors(String searchKeyword, int page, int size) {

		Pageable pageable = PageRequest.of(page, size, Sort.by("doctorid").descending());

		Page<HospitalDoctors> hospitalDoctorsPage;

		if (searchKeyword != null && !searchKeyword.isEmpty()) {
			hospitalDoctorsPage = doctorsRepository.searchProviders(searchKeyword, pageable);
		} else {
			hospitalDoctorsPage = doctorsRepository.findAll(pageable);
		}

		List<HospitalDoctors> doctorsList = doctorsRepository.findAll();

		List<HospitalDoctors> hospitalDoc = hospitalDoctorsPage.getContent();

		List<HospitalDoctorsDto> hospitalDoctorDtos = new ArrayList<>();

		for (HospitalDoctors hospitaldoctor : hospitalDoc) {
			HospitalDoctorsDto hospitalDoctorDto = hospitalDoctorsAssembler.toDto(hospitaldoctor);
			hospitalDoctorDtos.add(hospitalDoctorDto);
		}

		return new PageImpl<>(hospitalDoctorDtos, pageable, hospitalDoctorsPage.getTotalElements());
	}

	@Override
	public void delete(Long doctorId) {
		HospitalDoctors hospitalDoctors = this.doctorsRepository.findById(doctorId)
	            .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with ID " + doctorId ));
		
		this.doctorsRepository.delete(hospitalDoctors);
	}

	// dashboard service apis

	@Override
	public long getDoctorsCount() {
		return doctorsRepository.count();
	}

	@Override
	public long countActiveDoctors() {

		return this.doctorsRepository.countByStatus(true);
	}

	@Override
	public ResponseDto getDoctorDetails(Long doctorId) {
		HospitalDoctors doctor = doctorsRepository.findById(doctorId).orElseThrow();
		hospitalDoctorsAssembler.toDto(doctor);
		return new ResponseDto(doctor,"Patient detail", HttpStatus.OK);
	}

	@Override
	public HospitalDoctorsDto editDoctor(HospitalDoctorsDto doctorDto) {

		HospitalDoctors hospitalDoctor = hospitalDoctorsAssembler.toEntity(doctorDto);

		LocalDate eighteenYearsAgo = LocalDate.now().minusYears(21);

		if (!doctorDto.getEmailId().isBlank()) {
			Boolean status = this.doctorsRepository.existsByEmailId(doctorDto.getEmailId());
			if (status) {
				throw new EmailAlreadyExists("user already exists with this email");
			}
		}

		if (hospitalDoctor.getDateOfBirth().isAfter(eighteenYearsAgo)) {
			throw new DateException("Doctor  must be 21 years old");
		}

		if (null != doctorDto.getPassword() && !doctorDto.getPassword().isEmpty()) {
			hospitalDoctor.setPassword(passwordEncoder.encode(doctorDto.getPassword()));
		}

		try {
			HospitalDoctors saveDoctors = doctorsRepository.save(hospitalDoctor);
			doctorDto = hospitalDoctorsAssembler.toDto(saveDoctors);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		return doctorDto;

	}

}
