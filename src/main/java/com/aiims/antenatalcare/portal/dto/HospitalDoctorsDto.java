package com.aiims.antenatalcare.portal.dto;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class HospitalDoctorsDto {

	private Long doctorId;
	
	private String firstName;
	
	private String lastName;

	@Email(message = "Invalid email address")
	private String emailId;
	
	private String mobileNo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String dateOfBirth;
	
	private Boolean status;
	
	private String address;
	
	@Size(min = 6, message = "Password must be at least 6 characters")
	private String password;


	private String gender;

	private String photoUrlPath;

	private String mciRegdNumber;

	private String expInYears;

	private String aboutYourSelf;


	private Boolean emailVerified;

	private Boolean phoneNumVerified;

	private String createdDateTime;

	private String updatedDateTime;

	private String lastLogin;

	private Long hospitalId;


	private String hospitalDepartmentId;


	private Integer hospitalDepartment;

	private String fee;


	private String skypeId;


	private String activeDate;


	private String doctorType;


	private String counselorType;


	private String internationalFee;


	private String doctorCode;


	private String feeComFirst;


	private String feeComSecond;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhotoUrlPath() {
		return photoUrlPath;
	}

	public void setPhotoUrlPath(String photoUrlPath) {
		this.photoUrlPath = photoUrlPath;
	}

	public String getMciRegdNumber() {
		return mciRegdNumber;
	}

	public void setMciRegdNumber(String mciRegdNumber) {
		this.mciRegdNumber = mciRegdNumber;
	}

	public String getExpInYears() {
		return expInYears;
	}

	public void setExpInYears(String expInYears) {
		this.expInYears = expInYears;
	}

	public String getAboutYourSelf() {
		return aboutYourSelf;
	}

	public void setAboutYourSelf(String aboutYourSelf) {
		this.aboutYourSelf = aboutYourSelf;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public Boolean getPhoneNumVerified() {
		return phoneNumVerified;
	}

	public void setPhoneNumVerified(Boolean phoneNumVerified) {
		this.phoneNumVerified = phoneNumVerified;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Long getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalDepartmentId() {
		return hospitalDepartmentId;
	}

	public void setHospitalDepartmentId(String hospitalDepartmentId) {
		this.hospitalDepartmentId = hospitalDepartmentId;
	}

	public Integer getHospitalDepartment() {
		return hospitalDepartment;
	}

	public void setHospitalDepartment(Integer hospitalDepartment) {
		this.hospitalDepartment = hospitalDepartment;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public String getActiveDate() {
		return activeDate;
	}

	public void setActiveDate(String activeDate) {
		this.activeDate = activeDate;
	}

	public String getDoctorType() {
		return doctorType;
	}

	public void setDoctorType(String doctorType) {
		this.doctorType = doctorType;
	}

	public String getCounselorType() {
		return counselorType;
	}

	public void setCounselorType(String counselorType) {
		this.counselorType = counselorType;
	}

	public String getInternationalFee() {
		return internationalFee;
	}

	public void setInternationalFee(String internationalFee) {
		this.internationalFee = internationalFee;
	}

	public String getDoctorCode() {
		return doctorCode;
	}

	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	public String getFeeComFirst() {
		return feeComFirst;
	}

	public void setFeeComFirst(String feeComFirst) {
		this.feeComFirst = feeComFirst;
	}

	public String getFeeComSecond() {
		return feeComSecond;
	}

	public void setFeeComSecond(String feeComSecond) {
		this.feeComSecond = feeComSecond;
	}
}
	

	
