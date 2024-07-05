package com.aiims.antenatalcare.portal.assembler;

import com.aiims.antenatalcare.portal.dto.PatientListDto;
import org.springframework.stereotype.Component;

import com.aiims.antenatalcare.portal.dto.PatientDto;
import com.aiims.antenatalcare.portal.entity.Patients;
import com.aiims.antenatalcare.portal.util.DateUtil;

@Component
public class PatientAssembler implements BaseAssembler<Patients, PatientDto> {

	@Override
	public PatientDto toDto(Patients patients) {
		PatientDto responseDTO = new PatientDto();
		responseDTO.setId(patients.getId());
		responseDTO.setPatientName(patients.getPatientName());
		responseDTO.setHusbandName(patients.getHusbandName());
		responseDTO.setAge(patients.getAge());
		responseDTO.setUhid(patients.getUhid());
		responseDTO.setPatUhid(patients.getPatUhid());
		responseDTO.setPhoneNumber(patients.getPhoneNumber());
		responseDTO.setEducation(patients.getEducation());
		responseDTO.setSeStatus(patients.getSeStatus());
		
		if (null != patients.getLmp()) {
			responseDTO.setLmp(DateUtil.dateToString(patients.getLmp()));
		}
		
		if (null != patients.getEdd()) {
			responseDTO.setEdd(DateUtil.dateToString(patients.getEdd()));
		}
		responseDTO.setPog(patients.getPog());
		responseDTO.setStatus(patients.getStatus());
		if (null != patients.getNextVisit()) {
			responseDTO.setNextVisit(DateUtil.dateToString(patients.getNextVisit()));
		}
		
		responseDTO.setEmail(patients.getEmail());
		if (null != patients.getDob()) {
			responseDTO.setDob(DateUtil.dateToString(patients.getDob()));
		}

		responseDTO.setAddress(patients.getAddress());
		responseDTO.setCountry(patients.getCountry());
		responseDTO.setCity(patients.getCity());
		if (null != patients.getGender()) {
			responseDTO.setGender(patients.getGender().toString());
		}

		responseDTO.setCount(patients.getCount());
		responseDTO.setDoctorId(patients.getDoctorId());
		responseDTO.setAppointmentId(patients.getAppointmentId());
		responseDTO.setHeight(patients.getHeight());
		responseDTO.setLoginStatus(patients.getLoginStatus());
		if(null != patients.getCreatedAt()){
			responseDTO.setCreatedAt(patients.getCreatedAt().toString());
		}
		if(null != patients.getUpdatedAt()){
			responseDTO.setUpdatedAt(patients.getUpdatedAt().toString());
		}

		return responseDTO;

	}

	@Override
	public Patients toEntity(PatientDto patientsRequestDTO) {
		Patients patients = new Patients();

		patients.setPatientName(patientsRequestDTO.getPatientName());
		patients.setHusbandName(patientsRequestDTO.getHusbandName());
		patients.setAge(patientsRequestDTO.getAge());
		patients.setUhid(patientsRequestDTO.getUhid());
		patients.setPatUhid(patientsRequestDTO.getPatUhid());
		patients.setPhoneNumber(patientsRequestDTO.getPhoneNumber());
		patients.setEducation(patientsRequestDTO.getEducation());
		patients.setSeStatus(patientsRequestDTO.getSeStatus());
		if (null != patientsRequestDTO.getLmp() && !patientsRequestDTO.getLmp().isBlank()
				&& !patientsRequestDTO.getLmp().isEmpty()) {
			patients.setLmp(DateUtil.stringToDate(patientsRequestDTO.getLmp()));
		}
		if (null != patientsRequestDTO.getEdd() && !patientsRequestDTO.getEdd().isBlank()
				&& !patientsRequestDTO.getEdd().isEmpty()) {
			patients.setEdd(DateUtil.stringToDate(patientsRequestDTO.getEdd()));
		}

		patients.setPog(patientsRequestDTO.getPog());
		patients.setStatus(patientsRequestDTO.getStatus());

		patients.setEmail(patientsRequestDTO.getEmail());
		if (null != patientsRequestDTO.getDob() && !patientsRequestDTO.getDob().isBlank()
				&& !patientsRequestDTO.getDob().isEmpty()) {
			patients.setDob(DateUtil.stringToDate(patientsRequestDTO.getDob()));
		}

		patients.setAddress(patientsRequestDTO.getAddress());
		patients.setCountry(patientsRequestDTO.getCountry());
		patients.setState(patientsRequestDTO.getState());
		patients.setCity(patientsRequestDTO.getCity());
		if (null != patients.getGender()) {
			patients.setGender(patients.getGender().toString());
		}


		patients.setPassword(patientsRequestDTO.getPassword());
		patients.setCount(1);
		patients.setDoctorId(patientsRequestDTO.getDoctorId());
		patients.setAppointmentId(patientsRequestDTO.getAppointmentId());
		patients.setHeight(patientsRequestDTO.getHeight());
		patients.setLoginStatus(patientsRequestDTO.getLoginStatus());
		return patients;
	}

	public PatientListDto toDtoList(Patients patient){
		PatientListDto patientList = new PatientListDto();
		patientList.setName(patient.getPatientName());
		patientList.setAddress(patient.getAddress());
		patientList.setId(patient.getId());
		patientList.setMobileNo(patientList.getMobileNo());
		patientList.setAge(patientList.getAge());
		if (null != patient.getNextVisit()) {
			patientList.setNextVisit(DateUtil.dateToString(patient.getNextVisit()));
		}


		return patientList;
	}
}