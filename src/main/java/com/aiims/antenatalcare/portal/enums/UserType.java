package com.aiims.antenatalcare.portal.enums;

public enum UserType {
	ADMIN("ADMIN");
	private final String value;

	UserType(String val) {
		this.value = val;
	}

	public String getValue() {
		return value;
	}
}
