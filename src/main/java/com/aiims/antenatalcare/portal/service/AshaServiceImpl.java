package com.aiims.antenatalcare.portal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.aiims.antenatalcare.portal.assembler.AppointmentAssembler;
import com.aiims.antenatalcare.portal.dto.AppointmentDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.entity.Docpatientappointments;
import com.aiims.antenatalcare.portal.entity.Patients;
import com.aiims.antenatalcare.portal.repository.DocpatientappointmentsRepository;
import com.aiims.antenatalcare.portal.repository.PatientRepository;
import jakarta.transaction.Transactional;
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

import com.aiims.antenatalcare.portal.assembler.HospitalAshaAssembler;
import com.aiims.antenatalcare.portal.dto.HospitalAshaDto;
import com.aiims.antenatalcare.portal.entity.HospitalAsha;
import com.aiims.antenatalcare.portal.repository.AdminRepository;
import com.aiims.antenatalcare.portal.repository.HospitalAshaRepository;

@Service
public class AshaServiceImpl implements AshaService {

	@Autowired
	private HospitalAshaRepository hospitalAshaRepository;
	@Autowired
	private HospitalAshaAssembler hospitalAshaAssembler;

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private AppointmentAssembler appointmentAssembler;

	@Autowired
	private DocpatientappointmentsRepository appointmentsRepository;
	@Autowired
	private PatientRepository patientRepository;
	Logger logger = LoggerFactory.getLogger(AshaServiceImpl.class);

	@Override
	public HospitalAshaDto createHealthProvider(HospitalAshaDto ashaDto) {

		HospitalAsha hospitalAsha = hospitalAshaAssembler.toEntity(ashaDto);
		hospitalAsha.setPassword(passwordEncoder.encode(ashaDto.getPassword()));
		HospitalAshaDto responseDto = null;
		try {
			HospitalAsha saveAsha = hospitalAshaRepository.save(hospitalAsha);
			responseDto = hospitalAshaAssembler.toDto(saveAsha);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}

		return responseDto;
	}

	@Override
	public Page<HospitalAshaDto> getAllProviders(String searchKeyword, int page, int size) {

		Pageable pageable = PageRequest.of(page, size, Sort.by("ashaId").descending());

		Page<HospitalAsha> hospitalAshasPage;

		if (searchKeyword != null && !searchKeyword.isEmpty()) {
			hospitalAshasPage = hospitalAshaRepository.searchProviders(searchKeyword, pageable);
		} else {
			hospitalAshasPage = hospitalAshaRepository.findAll(pageable);
		}

		List<HospitalAsha> hospitalAshas = hospitalAshasPage.getContent();

		List<HospitalAshaDto> hospitalAshaDtos = new ArrayList<>();
		for (HospitalAsha hospitalAsha : hospitalAshas) {
			HospitalAshaDto hospitalAshaDto = hospitalAshaAssembler.toDto(hospitalAsha);
			hospitalAshaDtos.add(hospitalAshaDto);
		}

		return new PageImpl<>(hospitalAshaDtos, pageable, hospitalAshasPage.getTotalElements());
	}

	@Override
	public void delete(Long id) {

		Optional<HospitalAsha> asha = this.hospitalAshaRepository.findById(id);
		HospitalAsha hospitalasha = asha.get();

	

		hospitalAshaRepository.deleteById(id);
	}

	@Override
	public HospitalAshaDto getProviderById(Long id) {
		HospitalAsha provider = hospitalAshaRepository.findById(id).orElse(null);

		return hospitalAshaAssembler.toDto(provider);
	}

	@Override
	public HospitalAshaDto updateProvider(Long id, HospitalAshaDto hospitalAshaDto) {
		HospitalAsha provider = hospitalAshaRepository.findById(id).orElse(null);
		 HospitalAsha updateprovider = this.hospitalAshaAssembler.toEntity(hospitalAshaDto);
		 updateprovider.setAshaId(provider.getAshaId());
		 String updatedPassword = passwordEncoder.encode(hospitalAshaDto.getPassword());
		 updateprovider.setPassword(updatedPassword);
		 HospitalAsha saveAsha = this.hospitalAshaRepository.save(updateprovider);
		 
		 return this.hospitalAshaAssembler.toDto(saveAsha);
	}

	// Dashboard apis
	@Override
	public long getHealthProviderCount() {
		return hospitalAshaRepository.count();
	}

	@Override
	public long getActiveHealthProviderCount() {
		return hospitalAshaRepository.countActiveProviders();
	}

	@Override
	@Transactional
	public ResponseDto createDoctorAppointment(AppointmentDto dto) {
		Patients patient = patientRepository.findById(dto.getPatientId()).orElseThrow();
		Docpatientappointments appointment = appointmentAssembler.toEntity(dto);
		try{
			appointmentsRepository.save(appointment);
			patient.setNextVisit(appointment.getAppointmentDate());
			patient.setDoctorId(appointment.getDoctorId().toString());
			patientRepository.save(patient);
		}catch (Exception e){

		}
		dto = appointmentAssembler.toDto(appointment);
		return new ResponseDto(dto, "Patient appointment got created", HttpStatus.OK);

	}

}
