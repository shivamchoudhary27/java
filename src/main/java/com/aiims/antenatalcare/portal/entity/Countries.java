package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countries")
public class Countries {
	@Id
	@Column(name = "CountryId")
	private Long countryId;

	@Column(name = "CountryName")
	private String countryName;

	@Column(name = "Status")
	private boolean status;

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Countries(long countryId, String countryName, boolean status) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.status = status;
	}

	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}

}
