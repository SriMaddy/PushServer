package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VehicleActivateHistory generated by hbm2java
 */
@Entity
@Table(name = "VehicleActivateHistory", schema = "dbo", catalog = "FMS4.0")
public class VehicleActivateHistory implements java.io.Serializable {

	private VehicleActivateHistoryId id;

	public VehicleActivateHistory() {
	}

	public VehicleActivateHistory(VehicleActivateHistoryId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "vehicleId", column = @Column(name = "VehicleID", nullable = false)),
			@AttributeOverride(name = "modifiedBy", column = @Column(name = "ModifiedBy")),
			@AttributeOverride(name = "modifiedOn", column = @Column(name = "ModifiedOn", length = 23)),
			@AttributeOverride(name = "isactivated", column = @Column(name = "isactivated")) })
	public VehicleActivateHistoryId getId() {
		return this.id;
	}

	public void setId(VehicleActivateHistoryId id) {
		this.id = id;
	}

}