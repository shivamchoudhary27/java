package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospitalasha")
public class HospitalAsha {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ashaid")
	private Long ashaId;

	@Column(name = "createdby")
	private Long createdBy;

	@Column(name = "Firstname")
	private String firstName;

	@Column(name = "Lastname")
	private String lastName;

	@Column(name = "Emailid")
	private String emailId;

	@Column(name = "Mobilenumber")
	private String mobileNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Password")
	private String password;

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
	private Date dateOfBirth;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "Updateddate")
	private Date updatedDate;

	@Column(name = "Lastlogin")
	private Date lastLogin;

	@Column(name = "Hospitaldepartmentid", length = 2000)
	private String hospitalDepartmentId;

	@Column(name = "Hospitaldepartment_hospitaldepartmentid")
	private Integer hospitalDepartmentHospitalDepartmentId;

	@Column(name = "code")
	private String code;

	@Column(name = "doctors")
	private String doctors;

	
	public Long getAshaId() {
		return ashaId;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public String getHospitalDepartmentId() {
		return hospitalDepartmentId;
	}

	public Integer getHospitalDepartmentHospitalDepartmentId() {
		return hospitalDepartmentHospitalDepartmentId;
	}

	public String getCode() {
		return code;
	}

	public String getDoctors() {
		return doctors;
	}

	public void setAshaId(Long ashaId) {
		this.ashaId = ashaId;
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

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public void setHospitalDepartmentId(String hospitalDepartmentId) {
		this.hospitalDepartmentId = hospitalDepartmentId;
	}

	public void setHospitalDepartmentHospitalDepartmentId(Integer hospitalDepartmentHospitalDepartmentId) {
		this.hospitalDepartmentHospitalDepartmentId = hospitalDepartmentHospitalDepartmentId;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setDoctors(String doctors) {
		this.doctors = doctors;
	}
	
	public HospitalAsha(Long ashaId, Long createdBy, String firstName, String lastName, String emailId,
			String mobileNumber, String address, String gender, String password, String expInYears,
			String aboutYourSelf, Boolean emailVerified, Boolean phoneNumVerified, Boolean status, Date dateOfBirth,
			Date createdDate, Date updatedDate, Date lastLogin, String hospitalDepartmentId,
			Integer hospitalDepartmentHospitalDepartmentId, String code, String doctors) {
		super();
		this.ashaId = ashaId;
		this.createdBy = createdBy;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.expInYears = expInYears;
		this.aboutYourSelf = aboutYourSelf;
		this.emailVerified = emailVerified;
		this.phoneNumVerified = phoneNumVerified;
		this.status = status;
		this.dateOfBirth = dateOfBirth;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.lastLogin = lastLogin;
		this.hospitalDepartmentId = hospitalDepartmentId;
		this.hospitalDepartmentHospitalDepartmentId = hospitalDepartmentHospitalDepartmentId;
		this.code = code;
		this.doctors = doctors;
	}

	public HospitalAsha() {
		super();
		// TODO Auto-generated constructor stub
	}

}
