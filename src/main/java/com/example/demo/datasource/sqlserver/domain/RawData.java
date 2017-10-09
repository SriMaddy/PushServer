package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RawData generated by hbm2java
 */
@Entity
@Table(name = "RawData", schema = "dbo", catalog = "FMS4.0")
public class RawData implements java.io.Serializable {

	private RawDataId id;

	public RawData() {
	}

	public RawData(RawDataId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "Id", nullable = false)),
			@AttributeOverride(name = "imei", column = @Column(name = "Imei", nullable = false, length = 50)),
			@AttributeOverride(name = "data", column = @Column(name = "Data", nullable = false)),
			@AttributeOverride(name = "createon", column = @Column(name = "createon", length = 23)) })
	public RawDataId getId() {
		return this.id;
	}

	public void setId(RawDataId id) {
		this.id = id;
	}

}