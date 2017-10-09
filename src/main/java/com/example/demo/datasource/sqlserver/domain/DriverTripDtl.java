package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DriverTripDtl generated by hbm2java
 */
@Entity
@Table(name = "DriverTripDtl", schema = "dbo", catalog = "FMS4.0")
public class DriverTripDtl implements java.io.Serializable {

	private Serializable tripId;
	private int id;
	private Integer startDriverId;
	private Integer startOdometer;
	private Integer endDriverId;
	private Integer endOdometer;
	private Integer status;
	private Date createdOn;
	private Date modifiedOn;
	private Serializable employee;

	public DriverTripDtl() {
	}

	public DriverTripDtl(Serializable tripId, int id) {
		this.tripId = tripId;
		this.id = id;
	}

	public DriverTripDtl(Serializable tripId, int id, Integer startDriverId, Integer startOdometer, Integer endDriverId,
			Integer endOdometer, Integer status, Date createdOn, Date modifiedOn, Serializable employee) {
		this.tripId = tripId;
		this.id = id;
		this.startDriverId = startDriverId;
		this.startOdometer = startOdometer;
		this.endDriverId = endDriverId;
		this.endOdometer = endOdometer;
		this.status = status;
		this.createdOn = createdOn;
		this.modifiedOn = modifiedOn;
		this.employee = employee;
	}

	@Id

	@Column(name = "TripId", unique = true, nullable = false)
	public Serializable getTripId() {
		return this.tripId;
	}

	public void setTripId(Serializable tripId) {
		this.tripId = tripId;
	}

	@Column(name = "ID", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "StartDriverId")
	public Integer getStartDriverId() {
		return this.startDriverId;
	}

	public void setStartDriverId(Integer startDriverId) {
		this.startDriverId = startDriverId;
	}

	@Column(name = "StartOdometer")
	public Integer getStartOdometer() {
		return this.startOdometer;
	}

	public void setStartOdometer(Integer startOdometer) {
		this.startOdometer = startOdometer;
	}

	@Column(name = "EndDriverId")
	public Integer getEndDriverId() {
		return this.endDriverId;
	}

	public void setEndDriverId(Integer endDriverId) {
		this.endDriverId = endDriverId;
	}

	@Column(name = "EndOdometer")
	public Integer getEndOdometer() {
		return this.endOdometer;
	}

	public void setEndOdometer(Integer endOdometer) {
		this.endOdometer = endOdometer;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ModifiedOn", length = 23)
	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column(name = "Employee")
	public Serializable getEmployee() {
		return this.employee;
	}

	public void setEmployee(Serializable employee) {
		this.employee = employee;
	}

}
