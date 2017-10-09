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
import javax.persistence.Version;

/**
 * TblIgnitionAlerts generated by hbm2java
 */
@Entity
@Table(name = "tblIgnitionAlerts", schema = "dbo", catalog = "FMS4.0")
public class TblIgnitionAlerts implements java.io.Serializable {

	private int id;
	private Date timestamp;
	private Serializable imei;
	private Integer vehicleId;
	private Serializable registrationNo;
	private Integer groupId;
	private boolean ignitionStatus;
	private Date modifiedOn;
	private Date createdOn;
	private Boolean isdeleted;

	public TblIgnitionAlerts() {
	}

	public TblIgnitionAlerts(int id, Serializable imei, boolean ignitionStatus) {
		this.id = id;
		this.imei = imei;
		this.ignitionStatus = ignitionStatus;
	}

	public TblIgnitionAlerts(int id, Serializable imei, Integer vehicleId, Serializable registrationNo, Integer groupId,
			boolean ignitionStatus, Date modifiedOn, Date createdOn, Boolean isdeleted) {
		this.id = id;
		this.imei = imei;
		this.vehicleId = vehicleId;
		this.registrationNo = registrationNo;
		this.groupId = groupId;
		this.ignitionStatus = ignitionStatus;
		this.modifiedOn = modifiedOn;
		this.createdOn = createdOn;
		this.isdeleted = isdeleted;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", length = 23)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "IMEI", nullable = false)
	public Serializable getImei() {
		return this.imei;
	}

	public void setImei(Serializable imei) {
		this.imei = imei;
	}

	@Column(name = "VehicleId")
	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Column(name = "RegistrationNo")
	public Serializable getRegistrationNo() {
		return this.registrationNo;
	}

	public void setRegistrationNo(Serializable registrationNo) {
		this.registrationNo = registrationNo;
	}

	@Column(name = "GroupId")
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "IgnitionStatus", nullable = false)
	public boolean isIgnitionStatus() {
		return this.ignitionStatus;
	}

	public void setIgnitionStatus(boolean ignitionStatus) {
		this.ignitionStatus = ignitionStatus;
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
	@Column(name = "CreatedOn", length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "Isdeleted")
	public Boolean getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(Boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

}
