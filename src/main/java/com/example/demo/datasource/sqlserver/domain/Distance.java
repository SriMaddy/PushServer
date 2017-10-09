package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Distance generated by hbm2java
 */
@Entity
@Table(name = "Distance", schema = "dbo", catalog = "FMS4.0")
public class Distance implements java.io.Serializable {

	private DistanceId id;
	private Double distance;

	public Distance() {
	}

	public Distance(DistanceId id) {
		this.id = id;
	}

	public Distance(DistanceId id, Double distance) {
		this.id = id;
		this.distance = distance;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "groupId", column = @Column(name = "GroupID", nullable = false)),
			@AttributeOverride(name = "passengerFrom", column = @Column(name = "PassengerFrom", nullable = false)),
			@AttributeOverride(name = "passengerTo", column = @Column(name = "PassengerTo", nullable = false)) })
	public DistanceId getId() {
		return this.id;
	}

	public void setId(DistanceId id) {
		this.id = id;
	}

	@Column(name = "Distance", precision = 53, scale = 0)
	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

}