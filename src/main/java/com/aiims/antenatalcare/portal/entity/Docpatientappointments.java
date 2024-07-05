package com.aiims.antenatalcare.portal.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "docpatientappointments")
public class Docpatientappointments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="appointmentid")
	private Long appointmentId;

	@Column(name = "docscheduleid")
	private Long docScheduleId;

	@Column(name = "doctorid")
	private Long doctorId;

	@Column(name = "patientid")
	private Long patientId;

	@Column(name = "patientname")
	private String patientName;

	@Column(name = "doctorstatus")
	private String doctorStatus;

	@Column(name = "patientstatus")
	private String patientStatus;

	@Column(name = "appointmentlength")
	private String appointmentLength;

	@Column(name = "appointmentdate")
	private LocalDate appointmentDate;

	@Column(name = "appointmenttime")
	private String appointmentTime;

	@Column(name = "today")
	private LocalDate today;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	public Long getAppointmentId() {
		return appointmentId;
	}

	public Long getDocScheduleId() {
		return docScheduleId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getDoctorStatus() {
		return doctorStatus;
	}

	public String getPatientStatus() {
		return patientStatus;
	}

	public String getAppointmentLength() {
		return appointmentLength;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public LocalDate getToday() {
		return today;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public void setDocScheduleId(Long docScheduleId) {
		this.docScheduleId = docScheduleId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setDoctorStatus(String doctorStatus) {
		this.doctorStatus = doctorStatus;
	}

	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}

	public void setAppointmentLength(String appointmentLength) {
		this.appointmentLength = appointmentLength;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}