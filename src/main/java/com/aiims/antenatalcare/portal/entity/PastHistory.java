package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pasthistory")
public class PastHistory {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "diabetes")
	private Integer diabetes;

	@Column(name = "dia_type", length = 255)
	private String diabetesType;

	@Column(name = "hypertension")
	private Integer hypertension;

	@Column(name = "hypothyroidism")
	private Integer hypothyroidism;

	@Column(name = "hypothyroidism_value", length = 255)
	private String hypothyroidismValue;

	@Column(name = "heart_disease")
	private Integer heartDisease;

	@Column(name = "rheu_heart")
	private Integer rheumaticHeart;

	@Column(name = "acya_heart")
	private Integer acyanoticHeart;

	@Column(name = "cya_heart")
	private Integer cyanoticHeart;

	@Column(name = "others")
	private Integer others;

	@Column(name = "asthma")
	private Integer asthma;

	@Column(name = "tuberculosis")
	private Integer tuberculosis;

	@Column(name = "epilepsy")
	private Integer epilepsy;

	@Column(name = "lever_dis")
	private Integer liverDisease;

	@Column(name = "itp")
	private Integer itp;

	@Column(name = "sle")
	private Integer sle;

	@Column(name = "kidney_dis")
	private Integer kidneyDisease;

	@Column(name = "h_sursery")
	private Integer historyOfSurgery;

	@Column(name = "h_sursery_value", length = 255)
	private String historyOfSurgeryValue;

	@Column(name = "h_past")
	private Integer historyOfPastPregnancies;

	@Column(name = "h_past_value", length = 255)
	private String historyOfPastPregnanciesValue;

	@Column(name = "h_blood")
	private Integer historyOfBloodTransfusions;

	@Column(name = "h_blood_value", length = 255)
	private String historyOfBloodTransfusionsValue;

	@Column(name = "obs_history", length = 255)
	private String obstetricHistory;

	@Column(name = "gravida")
	private Integer gravida;

	@Column(name = "parity")
	private Integer parity;

	@Column(name = "abortions")
	private Integer abortions;

	@Column(name = "livingissues")
	private Integer livingIssues;

	@Column(name = "p_abort", length = 255)
	private String previousAbortions;

	@Column(name = "pp_value", length = 255)
	private String previousPregnancyValue;

	@Column(name = "f_value", length = 255)
	private String familyValue;

	@Column(name = "no_abort")
	private Integer noAbort;

	@Column(name = "p_aabort", length = 255)
	private String previousAbortion;

	@Column(name = "o_heart", length = 255)
	private String otherHeartConditions;

	@Column(name = "o_chronic", length = 255)
	private String otherChronicConditions;

	@Column(name = "no_abort_fd")
	private Integer noAbortFD;

	@Column(name = "no_abort_iud")
	private Integer noAbortIUD;

	@Column(name = "o_chronic_value", length = 255)
	private String otherChronicConditionsValue;

	@Column(name = "rheu_heart_value", length = 255)
	private String rheumaticHeartValue;

	@Column(name = "acya_heart_value", length = 255)
	private String acyanoticHeartValue;

	@Column(name = "cya_heart_value", length = 255)
	private String cyanoticHeartValue;

	public Integer getId() {
		return id;
	}

	public Integer getDiabetes() {
		return diabetes;
	}

	public String getDiabetesType() {
		return diabetesType;
	}

	public Integer getHypertension() {
		return hypertension;
	}

	public Integer getHypothyroidism() {
		return hypothyroidism;
	}

	public String getHypothyroidismValue() {
		return hypothyroidismValue;
	}

	public Integer getHeartDisease() {
		return heartDisease;
	}

	public Integer getRheumaticHeart() {
		return rheumaticHeart;
	}

	public Integer getAcyanoticHeart() {
		return acyanoticHeart;
	}

	public Integer getCyanoticHeart() {
		return cyanoticHeart;
	}

	public Integer getOthers() {
		return others;
	}

	public Integer getAsthma() {
		return asthma;
	}

	public Integer getTuberculosis() {
		return tuberculosis;
	}

	public Integer getEpilepsy() {
		return epilepsy;
	}

	public Integer getLiverDisease() {
		return liverDisease;
	}

	public Integer getItp() {
		return itp;
	}

	public Integer getSle() {
		return sle;
	}

	public Integer getKidneyDisease() {
		return kidneyDisease;
	}

	public Integer getHistoryOfSurgery() {
		return historyOfSurgery;
	}

	public String getHistoryOfSurgeryValue() {
		return historyOfSurgeryValue;
	}

	public Integer getHistoryOfPastPregnancies() {
		return historyOfPastPregnancies;
	}

	public String getHistoryOfPastPregnanciesValue() {
		return historyOfPastPregnanciesValue;
	}

	public Integer getHistoryOfBloodTransfusions() {
		return historyOfBloodTransfusions;
	}

	public String getHistoryOfBloodTransfusionsValue() {
		return historyOfBloodTransfusionsValue;
	}

	public String getObstetricHistory() {
		return obstetricHistory;
	}

	public Integer getGravida() {
		return gravida;
	}

	public Integer getParity() {
		return parity;
	}

	public Integer getAbortions() {
		return abortions;
	}

	public Integer getLivingIssues() {
		return livingIssues;
	}

	public String getPreviousAbortions() {
		return previousAbortions;
	}

	public String getPreviousPregnancyValue() {
		return previousPregnancyValue;
	}

	public String getFamilyValue() {
		return familyValue;
	}

	public Integer getNoAbort() {
		return noAbort;
	}

	public String getPreviousAbortion() {
		return previousAbortion;
	}

	public String getOtherHeartConditions() {
		return otherHeartConditions;
	}

	public String getOtherChronicConditions() {
		return otherChronicConditions;
	}

	public Integer getNoAbortFD() {
		return noAbortFD;
	}

	public Integer getNoAbortIUD() {
		return noAbortIUD;
	}

	public String getOtherChronicConditionsValue() {
		return otherChronicConditionsValue;
	}

	public String getRheumaticHeartValue() {
		return rheumaticHeartValue;
	}

	public String getAcyanoticHeartValue() {
		return acyanoticHeartValue;
	}

	public String getCyanoticHeartValue() {
		return cyanoticHeartValue;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setDiabetes(Integer diabetes) {
		this.diabetes = diabetes;
	}

	public void setDiabetesType(String diabetesType) {
		this.diabetesType = diabetesType;
	}

	public void setHypertension(Integer hypertension) {
		this.hypertension = hypertension;
	}

	public void setHypothyroidism(Integer hypothyroidism) {
		this.hypothyroidism = hypothyroidism;
	}

	public void setHypothyroidismValue(String hypothyroidismValue) {
		this.hypothyroidismValue = hypothyroidismValue;
	}

	public void setHeartDisease(Integer heartDisease) {
		this.heartDisease = heartDisease;
	}

	public void setRheumaticHeart(Integer rheumaticHeart) {
		this.rheumaticHeart = rheumaticHeart;
	}

	public void setAcyanoticHeart(Integer acyanoticHeart) {
		this.acyanoticHeart = acyanoticHeart;
	}

	public void setCyanoticHeart(Integer cyanoticHeart) {
		this.cyanoticHeart = cyanoticHeart;
	}

	public void setOthers(Integer others) {
		this.others = others;
	}

	public void setAsthma(Integer asthma) {
		this.asthma = asthma;
	}

	public void setTuberculosis(Integer tuberculosis) {
		this.tuberculosis = tuberculosis;
	}

	public void setEpilepsy(Integer epilepsy) {
		this.epilepsy = epilepsy;
	}

	public void setLiverDisease(Integer liverDisease) {
		this.liverDisease = liverDisease;
	}

	public void setItp(Integer itp) {
		this.itp = itp;
	}

	public void setSle(Integer sle) {
		this.sle = sle;
	}

	public void setKidneyDisease(Integer kidneyDisease) {
		this.kidneyDisease = kidneyDisease;
	}

	public void setHistoryOfSurgery(Integer historyOfSurgery) {
		this.historyOfSurgery = historyOfSurgery;
	}

	public void setHistoryOfSurgeryValue(String historyOfSurgeryValue) {
		this.historyOfSurgeryValue = historyOfSurgeryValue;
	}

	public void setHistoryOfPastPregnancies(Integer historyOfPastPregnancies) {
		this.historyOfPastPregnancies = historyOfPastPregnancies;
	}

	public void setHistoryOfPastPregnanciesValue(String historyOfPastPregnanciesValue) {
		this.historyOfPastPregnanciesValue = historyOfPastPregnanciesValue;
	}

	public void setHistoryOfBloodTransfusions(Integer historyOfBloodTransfusions) {
		this.historyOfBloodTransfusions = historyOfBloodTransfusions;
	}

	public void setHistoryOfBloodTransfusionsValue(String historyOfBloodTransfusionsValue) {
		this.historyOfBloodTransfusionsValue = historyOfBloodTransfusionsValue;
	}

	public void setObstetricHistory(String obstetricHistory) {
		this.obstetricHistory = obstetricHistory;
	}

	public void setGravida(Integer gravida) {
		this.gravida = gravida;
	}

	public void setParity(Integer parity) {
		this.parity = parity;
	}

	public void setAbortions(Integer abortions) {
		this.abortions = abortions;
	}

	public void setLivingIssues(Integer livingIssues) {
		this.livingIssues = livingIssues;
	}

	public void setPreviousAbortions(String previousAbortions) {
		this.previousAbortions = previousAbortions;
	}

	public void setPreviousPregnancyValue(String previousPregnancyValue) {
		this.previousPregnancyValue = previousPregnancyValue;
	}

	public void setFamilyValue(String familyValue) {
		this.familyValue = familyValue;
	}

	public void setNoAbort(Integer noAbort) {
		this.noAbort = noAbort;
	}

	public void setPreviousAbortion(String previousAbortion) {
		this.previousAbortion = previousAbortion;
	}

	public void setOtherHeartConditions(String otherHeartConditions) {
		this.otherHeartConditions = otherHeartConditions;
	}

	public void setOtherChronicConditions(String otherChronicConditions) {
		this.otherChronicConditions = otherChronicConditions;
	}

	public void setNoAbortFD(Integer noAbortFD) {
		this.noAbortFD = noAbortFD;
	}

	public void setNoAbortIUD(Integer noAbortIUD) {
		this.noAbortIUD = noAbortIUD;
	}

	public void setOtherChronicConditionsValue(String otherChronicConditionsValue) {
		this.otherChronicConditionsValue = otherChronicConditionsValue;
	}

	public void setRheumaticHeartValue(String rheumaticHeartValue) {
		this.rheumaticHeartValue = rheumaticHeartValue;
	}

	public void setAcyanoticHeartValue(String acyanoticHeartValue) {
		this.acyanoticHeartValue = acyanoticHeartValue;
	}

	public void setCyanoticHeartValue(String cyanoticHeartValue) {
		this.cyanoticHeartValue = cyanoticHeartValue;
	}

	

}
