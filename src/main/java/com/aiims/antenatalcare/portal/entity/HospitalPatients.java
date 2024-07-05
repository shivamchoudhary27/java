package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospitalpatients")
public class HospitalPatients {

	@Id
	@Column(name = "UserId")
	private Long userId;

	@Column(name = "UserName")
	private String userName;

	@Column(name = "Userfullname")
	private String userFullName;

	@Column(name = "Password")
	private String password;

	@Column(name = "Email")
	private String email;

	@Column(name = "PhoneNumber")
	private String phoneNumber;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "DateOfBirth")
	private Date dateOfBirth;

	@Column(name = "EmailVerified")
	private Boolean emailVerified;

	@Column(name = "PhoneNumVerified")
	private Boolean phoneNumVerified;

	@Column(name = "Status")
	private String status;

	@Column(name = "PhotoURLPath")
	private String photoUrlPath;

	@Column(name = "hospitalid")
	private Integer hospitalId;

	@Column(name = "CreatedDate")
	private Date createdDate;

	@Column(name = "UpdatedDate")
	private Date updatedDate;

	@Column(name = "CreatedBy")
	private Long createdBy;

	@Column(name = "LastLogin")
	private Date lastLogin;

	@Column(name = "Firstname")
	private String firstName;

	@Column(name = "Lastname")
	private String lastName;

	@Column(name = "aboutyourself")
	private String aboutYourself;

	@Column(name = "patcode")
	private String patCode;

	@Column(name = "idnum")
	private String idNum;

	@Column(name = "idtype")
	private String idType;

	@Column(name = "ipid")
	private String ipId;

	@Column(name = "associatecenter")
	private String associateCenter;

	@Column(name = "specialization")
	private String specialization;

	@Column(name = "Address")
	private String address;

	@Column(name = "cityid")
	private Integer cityId;

	@Column(name = "stateid")
	private Integer stateId;

	@Column(name = "countryid")
	private Integer countryId;

	@Column(name = "Regtype")
	private String regType;

	@Column(name = "Contype")
	private String conType;

	@Column(name = "Tagpatient")
	private Long tagPatient;

	public Long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Boolean getEmailVerified() {
		return emailVerified;
	}

	public Boolean getPhoneNumVerified() {
		return phoneNumVerified;
	}

	public String getStatus() {
		return status;
	}

	public String getPhotoUrlPath() {
		return photoUrlPath;
	}

	public Integer getHospitalId() {
		return hospitalId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAboutYourself() {
		return aboutYourself;
	}

	public String getPatCode() {
		return patCode;
	}

	public String getIdNum() {
		return idNum;
	}

	public String getIdType() {
		return idType;
	}

	public String getIpId() {
		return ipId;
	}

	public String getAssociateCenter() {
		return associateCenter;
	}

	public String getSpecialization() {
		return specialization;
	}

	public String getAddress() {
		return address;
	}

	public Integer getCityId() {
		return cityId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public String getRegType() {
		return regType;
	}

	public String getConType() {
		return conType;
	}

	public Long getTagPatient() {
		return tagPatient;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public void setPhoneNumVerified(Boolean phoneNumVerified) {
		this.phoneNumVerified = phoneNumVerified;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPhotoUrlPath(String photoUrlPath) {
		this.photoUrlPath = photoUrlPath;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAboutYourself(String aboutYourself) {
		this.aboutYourself = aboutYourself;
	}

	public void setPatCode(String patCode) {
		this.patCode = patCode;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public void setAssociateCenter(String associateCenter) {
		this.associateCenter = associateCenter;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public void setConType(String conType) {
		this.conType = conType;
	}

	public void setTagPatient(Long tagPatient) {
		this.tagPatient = tagPatient;
	}

	public HospitalPatients(Long userId, String userName, String userFullName, String password, String email,
			String phoneNumber, String gender, Date dateOfBirth, Boolean emailVerified, Boolean phoneNumVerified,
			String status, String photoUrlPath, Integer hospitalId, Date createdDate, Date updatedDate, Long createdBy,
			Date lastLogin, String firstName, String lastName, String aboutYourself, String patCode, String idNum,
			String idType, String ipId, String associateCenter, String specialization, String address, Integer cityId,
			Integer stateId, Integer countryId, String regType, String conType, Long tagPatient) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userFullName = userFullName;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.emailVerified = emailVerified;
		this.phoneNumVerified = phoneNumVerified;
		this.status = status;
		this.photoUrlPath = photoUrlPath;
		this.hospitalId = hospitalId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.createdBy = createdBy;
		this.lastLogin = lastLogin;
		this.firstName = firstName;
		this.lastName = lastName;
		this.aboutYourself = aboutYourself;
		this.patCode = patCode;
		this.idNum = idNum;
		this.idType = idType;
		this.ipId = ipId;
		this.associateCenter = associateCenter;
		this.specialization = specialization;
		this.address = address;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.regType = regType;
		this.conType = conType;
		this.tagPatient = tagPatient;
	}

	public HospitalPatients() {
		super();
		// TODO Auto-generated constructor stub
	}

}
