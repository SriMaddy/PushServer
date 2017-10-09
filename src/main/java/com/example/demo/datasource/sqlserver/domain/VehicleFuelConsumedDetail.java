package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VehicleFuelConsumedDetail generated by hbm2java
 */
@Entity
@Table(name = "VehicleFuelConsumedDetail", schema = "dbo", catalog = "FMS4.0")
public class VehicleFuelConsumedDetail implements java.io.Serializable {

	private VehicleFuelConsumedDetailId id;
	private int id_1;
	private Double meterStartReading;
	private Double meterEndReading;
	private Double fuelConsumed;
	private Date createdDate;
	private Serializable createdBy;
	private Date modifiedDate;
	private Serializable modifiedBy;

	public VehicleFuelConsumedDetail() {
	}

	public VehicleFuelConsumedDetail(VehicleFuelConsumedDetailId id, int id_1) {
		this.id = id;
		this.id_1 = id_1;
	}

	public VehicleFuelConsumedDetail(VehicleFuelConsumedDetailId id, int id_1, Double meterStartReading,
			Double meterEndReading, Double fuelConsumed, Date createdDate, Serializable createdBy, Date modifiedDate,
			Serializable modifiedBy) {
		this.id = id;
		this.id_1 = id_1;
		this.meterStartReading = meterStartReading;
		this.meterEndReading = meterEndReading;
		this.fuelConsumed = fuelConsumed;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "groupId", column = @Column(name = "GroupID", nullable = false)),
			@AttributeOverride(name = "vehicleId", column = @Column(name = "VehicleID", nullable = false)),
			@AttributeOverride(name = "fuelConsumedDate", column = @Column(name = "FuelConsumedDate", nullable = false, length = 23)) })
	public VehicleFuelConsumedDetailId getId() {
		return this.id;
	}

	public void setId(VehicleFuelConsumedDetailId id) {
		this.id = id;
	}

	@Column(name = "ID", nullable = false)
	public int getId_1() {
		return this.id_1;
	}

	public void setId_1(int id_1) {
		this.id_1 = id_1;
	}

	@Column(name = "MeterStartReading", precision = 53, scale = 0)
	public Double getMeterStartReading() {
		return this.meterStartReading;
	}

	public void setMeterStartReading(Double meterStartReading) {
		this.meterStartReading = meterStartReading;
	}

	@Column(name = "MeterEndReading", precision = 53, scale = 0)
	public Double getMeterEndReading() {
		return this.meterEndReading;
	}

	public void setMeterEndReading(Double meterEndReading) {
		this.meterEndReading = meterEndReading;
	}

	@Column(name = "FuelConsumed", precision = 53, scale = 0)
	public Double getFuelConsumed() {
		return this.fuelConsumed;
	}

	public void setFuelConsumed(Double fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate", length = 23)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "CreatedBy")
	public Serializable getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Serializable createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ModifiedDate", length = 23)
	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Column(name = "ModifiedBy")
	public Serializable getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Serializable modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
