package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FuelEntryDtlTemp generated by hbm2java
 */
@Entity
@Table(name = "FuelEntryDtlTemp", schema = "dbo", catalog = "FMS4.0")
public class FuelEntryDtlTemp implements java.io.Serializable {

	private FuelEntryDtlTempId id;

	public FuelEntryDtlTemp() {
	}

	public FuelEntryDtlTemp(FuelEntryDtlTempId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false)),
			@AttributeOverride(name = "vehicleRegNo", column = @Column(name = "VehicleRegNo", nullable = false)),
			@AttributeOverride(name = "fuelValue", column = @Column(name = "FuelValue", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "entryDate", column = @Column(name = "EntryDate", length = 23)),
			@AttributeOverride(name = "createdOn", column = @Column(name = "CreatedOn", length = 23)),
			@AttributeOverride(name = "lat", column = @Column(name = "Lat", precision = 53, scale = 0)),
			@AttributeOverride(name = "lon", column = @Column(name = "Lon", precision = 53, scale = 0)),
			@AttributeOverride(name = "imageString", column = @Column(name = "ImageString")) })
	public FuelEntryDtlTempId getId() {
		return this.id;
	}

	public void setId(FuelEntryDtlTempId id) {
		this.id = id;
	}

}
