package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "investigations")
public class Investigations {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "woman_blood_group")
	private String womanBloodGroup;

	@Column(name = "w_b_group")
	private String wBGroup;

	@Column(name = "abo_rh")
	private String aboRh;

	@Column(name = "hus_bld_group")
	private String husbandBloodGroup;

	@Column(name = "hus_b_group")
	private String husbandBGroup;

	@Column(name = "ict")
	private String ict;

	@Column(name = "ict_value")
	private String ictValue;

	@Column(name = "hemogram")
	private String hemogram;

	@Column(name = "hb")
	private Integer hb;

	@Column(name = "hb_value")
	private String hbValue;

	public Long getId() {
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

	public void setId(Long id) {
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

}