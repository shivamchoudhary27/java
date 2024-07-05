package com.aiims.antenatalcare.portal.assembler;

import com.aiims.antenatalcare.portal.util.DateUtil;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.HospitalDoctorsDto;
import com.aiims.antenatalcare.portal.entity.HospitalDoctors;

import java.time.LocalDate;
import java.util.Date;

@Component
public class HospitalDoctorsAssembler implements BaseAssembler<HospitalDoctors, HospitalDoctorsDto> {

	@Override
	public HospitalDoctorsDto toDto(HospitalDoctors e) {
		HospitalDoctorsDto dto = new HospitalDoctorsDto();
		dto.setDoctorId(e.getDoctorId());
		dto.setFirstName(e.getFirstName());
		dto.setLastName(e.getLastName());
		dto.setEmailId(e.getEmailId());
		dto.setMobileNo(e.getMobileNumber());
		if(null != e.getDateOfBirth() ){
			dto.setDateOfBirth(DateUtil.dateToString(e.getDateOfBirth()));
		}

		dto.setStatus(e.getStatus());
		dto.setAddress(e.getAddress());
		dto.setGender(e.getGender());
		dto.setFee(e.getFee());

		dto.setHospitalId(e.getHospitalId());
		dto.setExpInYears(e.getExpInYears());
		dto.setAboutYourSelf(e.getAboutYourSelf());
		dto.setMciRegdNumber(e.getMciRegdNumber());
		dto.setEmailVerified(e.getEmailVerified());
		dto.setPhoneNumVerified(e.getPhoneNumVerified());
        if(null != e.getActiveDate()){
			dto.setActiveDate(DateUtil.dateTimeToString(e.getActiveDate()));
		}
		dto.setDoctorType(e.getDoctorType());

		dto.setCounselorType(e.getCounselorType());

		dto.setInternationalFee(e.getInternationalFee());
		dto.setDoctorCode(e.getDoctorCode());

		dto.setFeeComFirst(e.getFeeComFirst());
		dto.setFeeComSecond(e.getFeeComSecond());
		dto.setHospitalId(e.getHospitalId());
		dto.setSkypeId(e.getSkypeId());
		dto.setFee(e.getFee());
		dto.setHospitalDepartment(e.getHospitalDepartment());
		dto.setHospitalDepartmentId(e.getHospitalDepartmentId());

		if(null != e.getLastLogin()){
			dto.setLastLogin(DateUtil.dateTimeToString(e.getLastLogin()));
		}

		if(null != e.getCreatedDate()){
			dto.setCreatedDateTime(DateUtil.dateTimeToString(e.getCreatedDate()));
		}
		if(null != e.getUpdatedDate()){
			dto.setUpdatedDateTime(DateUtil.dateTimeToString(e.getUpdatedDate()));
		}



		return dto;
	}

	@Override
	public HospitalDoctors toEntity(HospitalDoctorsDto d) {
		HospitalDoctors entity = new HospitalDoctors();
		entity.setDoctorId(d.getDoctorId());
		entity.setFirstName(d.getFirstName());
		entity.setLastName(d.getLastName());
		entity.setEmailId(d.getEmailId());
		entity.setMobileNumber(d.getMobileNo());
		if (null != d.getDateOfBirth() && !d.getDateOfBirth().isBlank()
				&& !d.getDateOfBirth().isEmpty()) {
			entity.setDateOfBirth(DateUtil.stringToDate(d.getDateOfBirth()));
		}

		entity.setStatus(d.getStatus());
		entity.setAddress(d.getAddress());

		return entity;
	}

}
