package com.aiims.antenatalcare.portal.assembler;

import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.HospitalAshaDto;
import com.aiims.antenatalcare.portal.entity.HospitalAsha;

@Component
public class HospitalAshaAssembler implements BaseAssembler<HospitalAsha, HospitalAshaDto> {

	@Override
	public HospitalAshaDto toDto(HospitalAsha e) {
		HospitalAshaDto hospitalAshaDto = new HospitalAshaDto();
		hospitalAshaDto.setId(e.getAshaId());
		hospitalAshaDto.setFirstName(e.getFirstName());
		hospitalAshaDto.setLastName(e.getLastName());
		hospitalAshaDto.setEmailId(e.getEmailId());
		hospitalAshaDto.setMobileNumber(e.getMobileNumber());
		hospitalAshaDto.setDateOfBirth(e.getDateOfBirth());
		hospitalAshaDto.setStatus(e.getStatus());
		hospitalAshaDto.setAddress(e.getAddress());

		return hospitalAshaDto;
	}

	@Override
	public HospitalAsha toEntity(HospitalAshaDto d) {
		HospitalAsha entity = new HospitalAsha();
		entity.setAshaId(d.getId());
		entity.setFirstName(d.getFirstName());
		entity.setLastName(d.getLastName());
		entity.setEmailId(d.getEmailId());
		entity.setMobileNumber(d.getMobileNumber());
		entity.setDateOfBirth(d.getDateOfBirth());
		entity.setStatus(d.getStatus());
		entity.setAddress(d.getAddress());

		return entity;
	}

}