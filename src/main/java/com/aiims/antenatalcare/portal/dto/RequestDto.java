package com.aiims.antenatalcare.portal.dto;

public class RequestDto {

	private Boolean success;

	private String message;

	private String username;

	private String password;

	private PatientDto patient;

	private PastHistoryDto patientHistory;

	private DiabetesscreeningDto diabetesscreening;

	private InvestigationsDto investigations;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PatientDto getPatient() {
		return patient;
	}

	public void setPatient(PatientDto patient) {
		this.patient = patient;
	}

	public PastHistoryDto getPatientHistory() {
		return patientHistory;
	}

	public void setPatientHistory(PastHistoryDto patientHistory) {
		this.patientHistory = patientHistory;
	}

	public DiabetesscreeningDto getDiabetesscreening() {
		return diabetesscreening;
	}

	public void setDiabetesscreening(DiabetesscreeningDto diabetesscreening) {
		this.diabetesscreening = diabetesscreening;
	}

	public InvestigationsDto getInvestigations() {
		return investigations;
	}

	public void setInvestigations(InvestigationsDto investigations) {
		this.investigations = investigations;
	}

}
