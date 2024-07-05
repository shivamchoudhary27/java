package com.aiims.antenatalcare.portal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDto {

	private Long adminid;

	@NotNull
	@Email
	private String email;

	@Size(min = 2, max = 30)
	private String username;

	@Size(min = 2, max = 30)
	private String name;

	private String password;

	public Long getAdminid() {
		return adminid;
	}

	public void setAdminid(Long adminid) {
		this.adminid = adminid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
