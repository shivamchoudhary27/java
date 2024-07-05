package com.aiims.antenatalcare.portal.service;

import org.springframework.data.domain.Page;

import com.aiims.antenatalcare.portal.dto.HospitalDoctorsDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;

public interface DoctorsService {

	HospitalDoctorsDto createDoctor(HospitalDoctorsDto doctorDto);

	HospitalDoctorsDto editDoctor(HospitalDoctorsDto doctorDto);

	HospitalDoctorsDto getDoctor(Long doctorId);

	HospitalDoctorsDto updateDoctor(Long doctorId, HospitalDoctorsDto doctorDto);

	Page<HospitalDoctorsDto> getAllDoctors(String searchKeyword, int page, int size);

	void delete(Long doctorId);

	long getDoctorsCount();

	long countActiveDoctors();

	ResponseDto getDoctorDetails(Long doctorId);

}
