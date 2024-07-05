package com.aiims.antenatalcare.portal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hospitaldocschedules")
public class HospitalDocSchedules {

	@Id
	@Column(name = "DocScheduleId")
	private Long docScheduleId;

	@Column(name = "ScheduleId")
	private Long scheduleId;

	@Column(name = "DoctorId")
	private Long doctorId;

	@Column(name = "HospitalId")
	private Long hospitalId;

	@Column(name = "HospitalDepartmentId")
	private Integer hospitalDepartmentId;

	@Column(name = "WeekDay")
	private String weekDay;

	@Column(name = "Session1_Stime")
	private String session1StartTime;

	@Column(name = "Session1_Etime")
	private String session1EndTime;

	@Column(name = "Session2_Stime")
	private String session2StartTime;

	@Column(name = "Session2_Etime")
	private String session2EndTime;

	@Column(name = "Session3_Stime")
	private String session3StartTime;

	@Column(name = "Session3_Etime")
	private String session3EndTime;

	@Column(name = "Session4_Stime")
	private String session4StartTime;

	@Column(name = "Session4_Etime")
	private String session4EndTime;

	@Column(name = "Status")
	private Integer status;

	@Column(name = "resheduletype")
	private String rescheduleType;

	public Long getDocScheduleId() {
		return docScheduleId;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public Long getHospitalId() {
		return hospitalId;
	}

	public Integer getHospitalDepartmentId() {
		return hospitalDepartmentId;
	}

	public String getWeekDay() {
		return weekDay;
	}

	public String getSession1StartTime() {
		return session1StartTime;
	}

	public String getSession1EndTime() {
		return session1EndTime;
	}

	public String getSession2StartTime() {
		return session2StartTime;
	}

	public String getSession2EndTime() {
		return session2EndTime;
	}

	public String getSession3StartTime() {
		return session3StartTime;
	}

	public String getSession3EndTime() {
		return session3EndTime;
	}

	public String getSession4StartTime() {
		return session4StartTime;
	}

	public String getSession4EndTime() {
		return session4EndTime;
	}

	public Integer getStatus() {
		return status;
	}

	public String getRescheduleType() {
		return rescheduleType;
	}

	public void setDocScheduleId(Long docScheduleId) {
		this.docScheduleId = docScheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}

	public void setHospitalDepartmentId(Integer hospitalDepartmentId) {
		this.hospitalDepartmentId = hospitalDepartmentId;
	}

	public void setWeekDay(String weekDay) {
		this.weekDay = weekDay;
	}

	public void setSession1StartTime(String session1StartTime) {
		this.session1StartTime = session1StartTime;
	}

	public void setSession1EndTime(String session1EndTime) {
		this.session1EndTime = session1EndTime;
	}

	public void setSession2StartTime(String session2StartTime) {
		this.session2StartTime = session2StartTime;
	}

	public void setSession2EndTime(String session2EndTime) {
		this.session2EndTime = session2EndTime;
	}

	public void setSession3StartTime(String session3StartTime) {
		this.session3StartTime = session3StartTime;
	}

	public void setSession3EndTime(String session3EndTime) {
		this.session3EndTime = session3EndTime;
	}

	public void setSession4StartTime(String session4StartTime) {
		this.session4StartTime = session4StartTime;
	}

	public void setSession4EndTime(String session4EndTime) {
		this.session4EndTime = session4EndTime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setRescheduleType(String rescheduleType) {
		this.rescheduleType = rescheduleType;
	}

	public HospitalDocSchedules(Long docScheduleId, Long scheduleId, Long doctorId, Long hospitalId,
			Integer hospitalDepartmentId, String weekDay, String session1StartTime, String session1EndTime,
			String session2StartTime, String session2EndTime, String session3StartTime, String session3EndTime,
			String session4StartTime, String session4EndTime, Integer status, String rescheduleType) {
		super();
		this.docScheduleId = docScheduleId;
		this.scheduleId = scheduleId;
		this.doctorId = doctorId;
		this.hospitalId = hospitalId;
		this.hospitalDepartmentId = hospitalDepartmentId;
		this.weekDay = weekDay;
		this.session1StartTime = session1StartTime;
		this.session1EndTime = session1EndTime;
		this.session2StartTime = session2StartTime;
		this.session2EndTime = session2EndTime;
		this.session3StartTime = session3StartTime;
		this.session3EndTime = session3EndTime;
		this.session4StartTime = session4StartTime;
		this.session4EndTime = session4EndTime;
		this.status = status;
		this.rescheduleType = rescheduleType;
	}

	public HospitalDocSchedules() {
		super();
		// TODO Auto-generated constructor stub
	}

}
