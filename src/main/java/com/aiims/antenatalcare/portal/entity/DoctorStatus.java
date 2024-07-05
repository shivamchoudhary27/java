package com.aiims.antenatalcare.portal.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctorstatus")
public class DoctorStatus {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "doctor_id")
	private int doctorId;
	
	@Column(name="doctor_status")
	private String doctorStatus;
	
	@Column(name="appointmentdate")
	private Date appointmentDate;
	
	@Column(name="appointmenttime")
	private String appointmentTime;
	
	@Column(name="today")
	private Date today;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	@Column(name="updated_at")
	private Timestamp updatedAt;

	public int getId() {
		return id;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public String getDoctorStatus() {
		return doctorStatus;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public Date getToday() {
		return today;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public void setDoctorStatus(String doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DoctorStatus(int id, int doctorId, String doctorStatus, Date appointmentDate, String appointmentTime,
			Date today, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.id = id;
		this.doctorId = doctorId;
		this.doctorStatus = doctorStatus;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.today = today;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public DoctorStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

}
