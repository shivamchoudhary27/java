package com.aiims.antenatalcare.portal.dto;

import com.aiims.antenatalcare.portal.enums.UserType;

import jakarta.validation.constraints.NotNull;

public class SignInReqDto {

	@NotNull
	private String username;
	@NotNull
	private String password;
	@NotNull
	private UserType userType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}