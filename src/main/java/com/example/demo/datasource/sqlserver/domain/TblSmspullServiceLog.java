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
 * TblSmspullServiceLog generated by hbm2java
 */
@Entity
@Table(name = "tblSMSPullServiceLog", schema = "dbo", catalog = "FMS4.0")
public class TblSmspullServiceLog implements java.io.Serializable {

	private int id;
	private Serializable groupId;
	private Serializable mobileNo;
	private Serializable routeName;
	private Serializable tripId;
	private Serializable vehicleId;
	private Serializable vehicleName;
	private Serializable imei;
	private Serializable latitude;
	private Serializable longitude;
	private Date createddate;

	public TblSmspullServiceLog() {
	}

	public TblSmspullServiceLog(int id) {
		this.id = id;
	}

	public TblSmspullServiceLog(int id, Serializable groupId, Serializable mobileNo, Serializable routeName,
			Serializable tripId, Serializable vehicleId, Serializable vehicleName, Serializable imei,
			Serializable latitude, Serializable longitude, Date createddate) {
		this.id = id;
		this.groupId = groupId;
		this.mobileNo = mobileNo;
		this.routeName = routeName;
		this.tripId = tripId;
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.imei = imei;
		this.latitude = latitude;
		this.longitude = longitude;
		this.createddate = createddate;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "GroupId")
	public Serializable getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Serializable groupId) {
		this.groupId = groupId;
	}

	@Column(name = "MobileNo")
	public Serializable getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(Serializable mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "RouteName")
	public Serializable getRouteName() {
		return this.routeName;
	}

	public void setRouteName(Serializable routeName) {
		this.routeName = routeName;
	}

	@Column(name = "TripID")
	public Serializable getTripId() {
		return this.tripId;
	}

	public void setTripId(Serializable tripId) {
		this.tripId = tripId;
	}

	@Column(name = "VehicleId")
	public Serializable getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Serializable vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Column(name = "VehicleName")
	public Serializable getVehicleName() {
		return this.vehicleName;
	}

	public void setVehicleName(Serializable vehicleName) {
		this.vehicleName = vehicleName;
	}

	@Column(name = "Imei")
	public Serializable getImei() {
		return this.imei;
	}

	public void setImei(Serializable imei) {
		this.imei = imei;
	}

	@Column(name = "Latitude")
	public Serializable getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Serializable latitude) {
		this.latitude = latitude;
	}

	@Column(name = "Longitude")
	public Serializable getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Serializable longitude) {
		this.longitude = longitude;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createddate", length = 23)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

}