package com.aiims.antenatalcare.portal.entity;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Visit {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "patid")
	private Long patId;

	@Column(name = "weeks", length = 255)
	private String weeks;

	@Temporal(TemporalType.DATE)
	@Column(name = "visit_date")
	private LocalDate visitDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "today")
	private LocalDate today;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at")
	private Date updatedAt;



	public Long getPatId() {
		return patId;
	}

	public String getWeeks() {
		return weeks;
	}

	public LocalDate getVisitDate() {
		return visitDate;
	}

	public LocalDate getToday() {
		return today;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}



	public void setPatId(Long patId) {
		this.patId = patId;
	}

	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}

	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}