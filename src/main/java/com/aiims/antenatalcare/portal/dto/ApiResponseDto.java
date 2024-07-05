package com.aiims.antenatalcare.portal.dto;

import java.util.List;

public class ApiResponseDto {

	List<PatientDto> patientDtos;

	List<PastHistoryDto> pastHistoryDtos;

	List<DiabetesscreeningDto> diabetesscreeningDtos;

	List<InvestigationsDto> investigationsDtos;

	public List<PatientDto> getPatientDtos() {
		return patientDtos;
	}

	public void setPatientDtos(List<PatientDto> patientDtos) {
		this.patientDtos = patientDtos;
	}

	public List<PastHistoryDto> getPastHistoryDtos() {
		return pastHistoryDtos;
	}

	public void setPastHistoryDtos(List<PastHistoryDto> pastHistoryDtos) {
		this.pastHistoryDtos = pastHistoryDtos;
	}

	public List<DiabetesscreeningDto> getDiabetesscreeningDtos() {
		return diabetesscreeningDtos;
	}

	public void setDiabetesscreeningDtos(List<DiabetesscreeningDto> diabetesscreeningDtos) {
		this.diabetesscreeningDtos = diabetesscreeningDtos;
	}

	public List<InvestigationsDto> getInvestigationsDtos() {
		return investigationsDtos;
	}

	public void setInvestigationsDtos(List<InvestigationsDto> investigationsDtos) {
		this.investigationsDtos = investigationsDtos;
	}

	public ApiResponseDto(List<PatientDto> patientDtos, List<PastHistoryDto> pastHistoryDtos,
			List<InvestigationsDto> investigationsDtos, List<DiabetesscreeningDto> diabetesscreeningDtos) {
		super();
		this.patientDtos = patientDtos;
		this.pastHistoryDtos = pastHistoryDtos;
		this.diabetesscreeningDtos = diabetesscreeningDtos;
		this.investigationsDtos = investigationsDtos;
	}

}
