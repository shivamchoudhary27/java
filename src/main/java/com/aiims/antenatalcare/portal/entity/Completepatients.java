package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "completepatients")
public class Completepatients {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "patientname")
	private String patientName;

	@Column(name = "husbandname")
	private String husbandName;

	@Column(name = "age")
	private String age;

	@Column(name = "uhid")
	private String uhid;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "education")
	private String education;

	@Column(name = "sestatus")
	private String seStatus;

	@Column(name = "lmp")
	@Temporal(TemporalType.DATE)
	private Date lmp;

	@Column(name = "edd")
	@Temporal(TemporalType.DATE)
	private Date edd;

	@Column(name = "pog")
	private String pog;

	@Column(name = "status")
	private String status;

	@Column(name = "next_visit")
	@Temporal(TemporalType.DATE)
	private Date nextVisit;

	@Column(name = "today")
	@Temporal(TemporalType.DATE)
	private Date today;

	@Column(name = "count")
	private Integer count;

	@Column(name = "doctorid")
	private Integer doctorId;

	@Column(name = "ashaid")
	private Integer ashaId;

	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	public String getPatientName() {
		return patientName;
	}

	public Integer getId() {
		return id;
	}

	public String getHusbandName() {
		return husbandName;
	}

	public String getAge() {
		return age;
	}

	public String getUhid() {
		return uhid;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEducation() {
		return education;
	}

	public String getSeStatus() {
		return seStatus;
	}

	public Date getLmp() {
		return lmp;
	}

	public Date getEdd() {
		return edd;
	}

	public String getPog() {
		return pog;
	}

	public String getStatus() {
		return status;
	}

	public Date getNextVisit() {
		return nextVisit;
	}

	public Date getToday() {
		return today;
	}

	public Integer getCount() {
		return count;
	}

	public Integer getDoctorId() {
		return doctorId;
	}

	public Integer getAshaId() {
		return ashaId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setUhid(String uhid) {
		this.uhid = uhid;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setSeStatus(String seStatus) {
		this.seStatus = seStatus;
	}

	public void setLmp(Date lmp) {
		this.lmp = lmp;
	}

	public void setEdd(Date edd) {
		this.edd = edd;
	}

	public void setPog(String pog) {
		this.pog = pog;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setNextVisit(Date nextVisit) {
		this.nextVisit = nextVisit;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public void setAshaId(Integer ashaId) {
		this.ashaId = ashaId;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Completepatients(String patientName, Integer id, String husbandName, String age, String uhid,
			String phoneNumber, String education, String seStatus, Date lmp, Date edd, String pog, String status,
			Date nextVisit, Date today, Integer count, Integer doctorId, Integer ashaId, Date createdAt,
			Date updatedAt) {
		super();
		this.patientName = patientName;
		this.id = id;
		this.husbandName = husbandName;
		this.age = age;
		this.uhid = uhid;
		this.phoneNumber = phoneNumber;
		this.education = education;
		this.seStatus = seStatus;
		this.lmp = lmp;
		this.edd = edd;
		this.pog = pog;
		this.status = status;
		this.nextVisit = nextVisit;
		this.today = today;
		this.count = count;
		this.doctorId = doctorId;
		this.ashaId = ashaId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Completepatients() {
		super();
		// TODO Auto-generated constructor stub

	}
}
