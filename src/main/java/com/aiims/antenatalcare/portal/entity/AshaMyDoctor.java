package com.aiims.antenatalcare.portal.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "ashamydoctor")
public class AshaMyDoctor {
    @Id
    private int id;

    @Column(name = "ashaid")
    private Integer ashaId;

    @Column(name = "doctorid")
    private Integer doctorId;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    

    // Constructors, getters, and setters
    public AshaMyDoctor() {
    }

    public AshaMyDoctor(int id, Integer ashaId, Integer doctorId, Date updatedAt, Date createdAt) {
        this.id = id;
        this.ashaId = ashaId;
        this.doctorId = doctorId;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    // Getters and setters for the fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAshaId() {
        return ashaId;
    }

    public void setAshaId(Integer ashaId) {
        this.ashaId = ashaId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    
}
