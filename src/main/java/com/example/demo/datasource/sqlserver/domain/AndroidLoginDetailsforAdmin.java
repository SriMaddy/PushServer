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
 * AndroidLoginDetailsforAdmin generated by hbm2java
 */
@Entity
@Table(name = "AndroidLoginDetailsforAdmin", schema = "dbo", catalog = "FMS4.0")
public class AndroidLoginDetailsforAdmin implements java.io.Serializable {

	private int id;
	private Date loginTime;
	private Date createdOn;
	private Date modifiedOn;
	private Date alertReadTime;
	private Serializable vehicleRegNo;

	public AndroidLoginDetailsforAdmin() {
	}

	public AndroidLoginDetailsforAdmin(int id) {
		this.id = id;
	}

	public AndroidLoginDetailsforAdmin(int id, Date loginTime, Date createdOn, Date modifiedOn, Date alertReadTime,
			Serializable vehicleRegNo) {
		this.id = id;
		this.loginTime = loginTime;
		this.createdOn = createdOn;
		this.modifiedOn = modifiedOn;
		this.alertReadTime = alertReadTime;
		this.vehicleRegNo = vehicleRegNo;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LoginTime", length = 23)
	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AlertReadTime", length = 23)
	public Date getAlertReadTime() {
		return this.alertReadTime;
	}

	public void setAlertReadTime(Date alertReadTime) {
		this.alertReadTime = alertReadTime;
	}

	@Column(name = "VehicleRegNo")
	public Serializable getVehicleRegNo() {
		return this.vehicleRegNo;
	}

	public void setVehicleRegNo(Serializable vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

}
