package com.aiims.antenatalcare.portal.service;

import com.aiims.antenatalcare.portal.dto.AppointmentDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.dto.SignificantHistoryDto;
import org.springframework.data.domain.Page;

import com.aiims.antenatalcare.portal.dto.HospitalAshaDto;

public interface AshaService {

	HospitalAshaDto createHealthProvider(HospitalAshaDto ashaDto);

	Page<HospitalAshaDto> getAllProviders(String searchKeyword,int page,int size);
	
	 void delete(Long id);
	 
	 HospitalAshaDto getProviderById(Long providerId);

	HospitalAshaDto updateProvider(Long id, HospitalAshaDto hospitalAshaDto);
	
	long getHealthProviderCount();

	long getActiveHealthProviderCount();

	ResponseDto createDoctorAppointment(AppointmentDto dto);

 }
