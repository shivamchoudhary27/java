package com.aiims.antenatalcare.portal.dto;

public class InvestigationsDto {

	private Integer id;
	private Long patientId;
	private String womanBloodGroup;
	private String wBGroup;
	private String aboRh;
	private String husbandBloodGroup;
	private String husbandBGroup;
	private String ict;
	private String ictValue;
	private String hemogram;
	private Integer hb;
	private String hbValue;

	public Integer getId() {
		return id;
	}

	public String getWomanBloodGroup() {
		return womanBloodGroup;
	}

	public String getwBGroup() {
		return wBGroup;
	}

	public String getAboRh() {
		return aboRh;
	}

	public String getHusbandBloodGroup() {
		return husbandBloodGroup;
	}

	public String getHusbandBGroup() {
		return husbandBGroup;
	}

	public String getIct() {
		return ict;
	}

	public String getIctValue() {
		return ictValue;
	}

	public String getHemogram() {
		return hemogram;
	}

	public Integer getHb() {
		return hb;
	}

	public String getHbValue() {
		return hbValue;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setWomanBloodGroup(String womanBloodGroup) {
		this.womanBloodGroup = womanBloodGroup;
	}

	public void setwBGroup(String wBGroup) {
		this.wBGroup = wBGroup;
	}

	public void setAboRh(String aboRh) {
		this.aboRh = aboRh;
	}

	public void setHusbandBloodGroup(String husbandBloodGroup) {
		this.husbandBloodGroup = husbandBloodGroup;
	}

	public void setHusbandBGroup(String husbandBGroup) {
		this.husbandBGroup = husbandBGroup;
	}

	public void setIct(String ict) {
		this.ict = ict;
	}

	public void setIctValue(String ictValue) {
		this.ictValue = ictValue;
	}

	public void setHemogram(String hemogram) {
		this.hemogram = hemogram;
	}

	public void setHb(Integer hb) {
		this.hb = hb;
	}

	public void setHbValue(String hbValue) {
		this.hbValue = hbValue;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

}