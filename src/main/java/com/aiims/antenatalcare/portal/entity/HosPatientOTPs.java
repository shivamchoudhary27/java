package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;

public class HosPatientOTPs {

	@Column(name = "UserOTPId")
	private int userOTPId;

	@Column(name = "OtpCode")
	private String otpCode;

	@Column(name = "UserId")
	private long userId;

	@Column(name = "MobileNo")
	private String mobileNo;

	@Column(name = "OtpGenTime")
	private Date otpGenTime;

	@Column(name = "OtpExpTime")
	private Date otpExpTime;

	public int getUserOTPId() {
		return userOTPId;
	}

	public String getOtpCode() {
		return otpCode;
	}

	public long getUserId() {
		return userId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public Date getOtpGenTime() {
		return otpGenTime;
	}

	public Date getOtpExpTime() {
		return otpExpTime;
	}

	public void setUserOTPId(int userOTPId) {
		this.userOTPId = userOTPId;
	}

	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setOtpGenTime(Date otpGenTime) {
		this.otpGenTime = otpGenTime;
	}

	public void setOtpExpTime(Date otpExpTime) {
		this.otpExpTime = otpExpTime;
	}

	public HosPatientOTPs(int userOTPId, String otpCode, long userId, String mobileNo, Date otpGenTime,
			Date otpExpTime) {
		super();
		this.userOTPId = userOTPId;
		this.otpCode = otpCode;
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.otpGenTime = otpGenTime;
		this.otpExpTime = otpExpTime;
	}

	public HosPatientOTPs() {
		super();
		// TODO Auto-generated constructor stub
	}

}
