package com.aiims.antenatalcare.portal.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospitaldoctors")
public class HospitalDoctors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DoctorId")
	private Long doctorid;

	@Column(name = "createdby")
	private Long createdBy;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "emailid")
	private String emailId;

	@Column(name = "mobilenumber")
	private String mobileNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "gender")
	private String gender;

	@Column(name = "password")
	private String password;

	@Column(name = "Photourlpath")
	private String photoUrlPath;

	@Column(name = "MCIRegdnumber")
	private String mciRegdNumber;

	@Column(name = "Expinyears")
	private String expInYears;

	@Column(name = "aboutyourself")
	private String aboutYourSelf;

	@Column(name = "Emailverified")
	private Boolean emailVerified;

	@Column(name = "Phonenumverified")
	private Boolean phoneNumVerified;

	@Column(name = "Status")
	private Boolean status;

	@Column(name = "Dateofbirth")
	private LocalDate dateOfBirth;

	@Column(name = "createddate")
	private LocalDateTime createdDate;

	@Column(name = "Updateddate")
	private LocalDateTime updatedDate;

	@Column(name = "Lastlogin")
	private LocalDateTime lastLogin;

	@Column(name = "Hospitalid")
	private Long hospitalId;

	@Column(name = "Hospitaldepartmentid")
	private String hospitalDepartmentId;

	@Column(name = "Hospitaldepartment_hospitaldepartmentid")
	private Integer hospitalDepartment;

	@Column(name = "fee")
	private String fee;

	@Column(name = "skypeid")
	private String skypeId;

	@Column(name = "activedate")
	private LocalDateTime activeDate;

	@Column(name = "doctortype")
	private String doctorType;

	@Column(name = "counselortype")
	private String counselorType;

	@Column(name = "intrntnlfee")
	private String internationalFee;

	@Column(name = "doctorcode")
	private String doctorCode;

	@Column(name = "Feecomfirst")
	private String feeComFirst;

	@Column(name = "Feecomsecond")
	private String feeComSecond;

	public Long getDoctorId() {
		return doctorid;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public String getPassword() {
		return password;
	}

	public String getPhotoUrlPath() {
		return photoUrlPath;
	}

	public String getMciRegdNumber() {
		return mciRegdNumber;
	}

	public String getExpInYears() {
		return expInYears;
	}

	public String getAboutYourSelf() {
		return aboutYourSelf;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public Boolean getPhoneNumVerified() {
		return phoneNumVerified;
	}

	public Boolean getStatus() {
		return status;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public Long getHospitalId() {
		return hospitalId;
	}

	public String getHospitalDepartmentId() {
		return hospitalDepartmentId;
	}

	public Integer getHospitalDepartment() {
		return hospitalDepartment;
	}

	public String getFee() {
		return fee;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public LocalDateTime getActiveDate() {
		return activeDate;
	}

	public String getDoctorType() {
		return doctorType;
	}

	public String getCounselorType() {
		return counselorType;
	}

	public String getInternationalFee() {
		return internationalFee;
	}

	public String getDoctorCode() {
		return doctorCode;
	}

	public String getFeeComFirst() {
		return feeComFirst;
	}

	public String getFeeComSecond() {
		return feeComSecond;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorid = doctorId;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhotoUrlPath(String photoUrlPath) {
		this.photoUrlPath = photoUrlPath;
	}

	public void setMciRegdNumber(String mciRegdNumber) {
		this.mciRegdNumber = mciRegdNumber;
	}

	public void setExpInYears(String expInYears) {
		this.expInYears = expInYears;
	}

	public void setAboutYourSelf(String aboutYourSelf) {
		this.aboutYourSelf = aboutYourSelf;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public void setPhoneNumVerified(Boolean phoneNumVerified) {
		this.phoneNumVerified = phoneNumVerified;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}

	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public void setHospitalDepartmentId(String hospitalDepartmentId) {
		this.hospitalDepartmentId = hospitalDepartmentId;
	}

	public void setHospitalDepartment(Integer hospitalDepartment) {
		this.hospitalDepartment = hospitalDepartment;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public void setActiveDate(LocalDateTime activeDate) {
		this.activeDate = activeDate;
	}

	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}

	public void setCounselorType(String counselorType) {
		this.counselorType = counselorType;
	}

	public void setInternationalFee(String internationalFee) {
		this.internationalFee = internationalFee;
	}

	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	public void setFeeComFirst(String feeComFirst) {
		this.feeComFirst = feeComFirst;
	}

	public void setFeeComSecond(String feeComSecond) {
		this.feeComSecond = feeComSecond;
	}

}
