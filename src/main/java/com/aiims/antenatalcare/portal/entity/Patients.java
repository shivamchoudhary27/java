package com.aiims.antenatalcare.portal.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.aiims.antenatalcare.portal.enums.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "patients")
public class Patients {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "patientname")
	private String patientName;

	@Column(name = "husbandname")
	private String husbandName;

	@Column(name = "age")
	private String age;

	@Column(name = "uhid")
	private String uhid;

	@Column(name = "pat_uhid")
	private String patUhid;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "education")
	private String education;

	@Column(name = "sestatus")
	private String seStatus;

	@Column(name = "lmp")
	private LocalDate lmp;

	@Column(name = "edd")
	private LocalDate edd;

	@Column(name = "pog")
	private String pog;

	@Column(name = "status")
	private String status;

	@Column(name = "next_visit")
	private LocalDate nextVisit;

	@Column(name = "email")
	private String email;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "address")
	private String address;

	@Column(name = "country")
	private String country;

	@Column(name = "state")
	private String state;

	@Column(name = "city")
	private String city;

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name = "password")
	private String password;

	@Column(name = "count")
	private Integer count;

	@Column(name = "doctorid")
	private String doctorId;

	@Column(name = "ashaid")
	private String ashaId;

	@Column(name = "appointmentid")
	private Integer appointmentId;

	@Column(name = "appointer")
	private String appointer;

	@Column(name = "height")
	private Integer height;

	@Column(name = "loginstatus")
	private String loginStatus;

	@Column(name = "updated_at")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	@Column(name = "created_at")
	@CreationTimestamp
	private LocalDateTime createdAt;

	public Long getId() {
		return id;
	}

	public String getPatientName() {
		return patientName;
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

	public String getPatUhid() {
		return patUhid;
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

	public LocalDate getLmp() {
		return lmp;
	}

	public LocalDate getEdd() {
		return edd;
	}

	public String getPog() {
		return pog;
	}

	public String getStatus() {
		return status;
	}

	public LocalDate getNextVisit() {
		return nextVisit;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getAddress() {
		return address;
	}

	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public Gender getGender() {
		return gender;
	}

	public String getPassword() {
		return password;
	}

	public Integer getCount() {
		return count;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public String getAshaId() {
		return ashaId;
	}

	public Integer getAppointmentId() {
		return appointmentId;
	}

	public String getAppointer() {
		return appointer;
	}

	public Integer getHeight() {
		return height;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public void setPatUhid(String patUhid) {
		this.patUhid = patUhid;
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

	public void setLmp(LocalDate lmp) {
		this.lmp = lmp;
	}

	public void setEdd(LocalDate edd) {
		this.edd = edd;
	}

	public void setPog(String pog) {
		this.pog = pog;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setNextVisit(LocalDate nextVisit) {
		this.nextVisit = nextVisit;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setGender(String gender) {
		this.gender = Gender.valueOf(gender);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public void setAshaId(String ashaId) {
		this.ashaId = ashaId;
	}

	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}

	public void setAppointer(String appointer) {
		this.appointer = appointer;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
