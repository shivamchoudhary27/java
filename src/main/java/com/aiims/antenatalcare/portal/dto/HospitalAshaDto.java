package com.aiims.antenatalcare.portal.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class HospitalAshaDto {

	private Long id;
	private String password;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	private Boolean status;
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "HospitalAshaDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", dateOfBirth=" + dateOfBirth + ", status=" + status
				+ "]";
	}

	
}
