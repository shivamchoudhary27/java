package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patientappointment")
public class PatientAppointment {

	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "patientid")
	private Integer patientId;

	@Column(name = "doctorid")
	private Integer doctorId;

	@Column(name = "appointmentid")
	private Integer appointmentId;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

	
	public int getId() {
		return id;
	}

	public int getPatientId() {
		return patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public PatientAppointment(int id, int patientId, int doctorId, int appointmentId, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentId = appointmentId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public PatientAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
