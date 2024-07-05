package com.aiims.antenatalcare.portal.rest.service;


import java.util.List;

import com.aiims.antenatalcare.portal.dto.InvestigationsDto;
import com.aiims.antenatalcare.portal.dto.PastHistoryDto;
import com.aiims.antenatalcare.portal.dto.PatientDto;
import com.aiims.antenatalcare.portal.dto.PatientVisitDto;
import com.aiims.antenatalcare.portal.dto.RequestDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.dto.SignificantHistoryDto;



public interface PatientService {

	
	ResponseDto createPatient(PatientDto patient);
	ResponseDto updatePatientOtherInfo(PatientDto patient);
	
	
	ResponseDto createPatientPastHistory(PastHistoryDto patient);
	
	ResponseDto createPatientInvestigation(InvestigationsDto dto);

	ResponseDto getPatient(long id);
	ResponseDto getPatients();
	ResponseDto getMyPatients(int page,int pageSize);

	ResponseDto getMyPendingPatientList(int page,int pageSize);
	ResponseDto getMyTodayPatientList(int page,int pageSize);

	ResponseDto createPatientVisit(SignificantHistoryDto dto);

	ResponseDto createPatientVisits(PatientVisitDto dto);



	

}
