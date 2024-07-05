package com.aiims.antenatalcare.portal.enums;

public enum Gender {
	MALE("M"), FEMALE("F"), OTHER("O");

	private final String value;

	Gender(String val) {
		this.value = val;
	}

	public String getValue() {
		return value;
	}
	
}
