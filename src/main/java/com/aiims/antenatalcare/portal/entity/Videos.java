package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Videos {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name"
			)
	private String name;

	@Column(name = "location")
	private String location;

	@Column(name = "title")
	private String title;

	@Column(name = "category")
	private String category;

	@Column(name = "trimester")
	private String trimester;

	@Column(name = "status")
	private int status;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getTrimester() {
		return trimester;
	}

	public int getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setTrimester(String trimester) {
		this.trimester = trimester;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Videos(int id, String name, String location, String title, String category, String trimester, int status) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.title = title;
		this.category = category;
		this.trimester = trimester;
		this.status = status;
	}

	public Videos() {
		super();
		// TODO Auto-generated constructor stub
	}

}
