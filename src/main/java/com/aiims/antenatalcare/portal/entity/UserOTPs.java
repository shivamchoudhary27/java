package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "userotps")
public class UserOTPs {
	@Id
	@Column(name = "UserOTPId")
	private long userOTPId;

	@Column(name = "OtpCode", length = 50)
	private String otpCode;

	@Column(name = "UserId")
	private long userId;

	@Column(name = "MobileNo", length = 150)
	private String mobileNo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OtpGenTime")
	private Date otpGenTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OtpExpTime")
	private Date otpExpTime;

	public long getUserOTPId() {
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

	public void setUserOTPId(long userOTPId) {
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

	public UserOTPs(long userOTPId, String otpCode, long userId, String mobileNo, Date otpGenTime, Date otpExpTime) {
		super();
		this.userOTPId = userOTPId;
		this.otpCode = otpCode;
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.otpGenTime = otpGenTime;
		this.otpExpTime = otpExpTime;
	}

	public UserOTPs() {
		super();
		// TODO Auto-generated constructor stub
	}

}
