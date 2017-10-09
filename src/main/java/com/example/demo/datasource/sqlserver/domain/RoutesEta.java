package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RoutesEta generated by hbm2java
 */
@Entity
@Table(name = "RoutesEta", schema = "dbo", catalog = "FMS4.0")
public class RoutesEta implements java.io.Serializable {

	private RoutesEtaId id;

	public RoutesEta() {
	}

	public RoutesEta(RoutesEtaId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "etaId", column = @Column(name = "EtaID", nullable = false)),
			@AttributeOverride(name = "etaTime", column = @Column(name = "EtaTime", nullable = false)),
			@AttributeOverride(name = "wayPointId", column = @Column(name = "WayPointId", nullable = false)),
			@AttributeOverride(name = "routeId", column = @Column(name = "RouteID", nullable = false)),
			@AttributeOverride(name = "isDeleted", column = @Column(name = "IsDeleted", nullable = false)),
			@AttributeOverride(name = "sequenceOrder", column = @Column(name = "SequenceOrder", nullable = false)),
			@AttributeOverride(name = "createdBy", column = @Column(name = "CreatedBy")),
			@AttributeOverride(name = "createdOn", column = @Column(name = "CreatedOn", length = 23)),
			@AttributeOverride(name = "modifiedBy", column = @Column(name = "ModifiedBy")),
			@AttributeOverride(name = "modifiedOn", column = @Column(name = "ModifiedOn", length = 23)),
			@AttributeOverride(name = "wayPointDistance", column = @Column(name = "WayPointDistance", precision = 53, scale = 0)),
			@AttributeOverride(name = "waypointTime", column = @Column(name = "WaypointTime", length = 12)),
			@AttributeOverride(name = "pointTime", column = @Column(name = "PointTime")) })
	public RoutesEtaId getId() {
		return this.id;
	}

	public void setId(RoutesEtaId id) {
		this.id = id;
	}

}
