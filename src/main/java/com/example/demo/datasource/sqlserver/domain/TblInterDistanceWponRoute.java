package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TblInterDistanceWponRoute generated by hbm2java
 */
@Entity
@Table(name = "tblInterDistanceWPOnRoute", schema = "dbo", catalog = "FMS4.0")
public class TblInterDistanceWponRoute implements java.io.Serializable {

	private TblInterDistanceWponRouteId id;

	public TblInterDistanceWponRoute() {
	}

	public TblInterDistanceWponRoute(TblInterDistanceWponRouteId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "Id", nullable = false)),
			@AttributeOverride(name = "routeId", column = @Column(name = "RouteId", nullable = false)),
			@AttributeOverride(name = "originWpId", column = @Column(name = "OriginWpId", nullable = false)),
			@AttributeOverride(name = "destinationWpid", column = @Column(name = "DestinationWPId", nullable = false)),
			@AttributeOverride(name = "distance", column = @Column(name = "Distance", nullable = false, precision = 53, scale = 0)),
			@AttributeOverride(name = "isDeleted", column = @Column(name = "IsDeleted")),
			@AttributeOverride(name = "createdOn", column = @Column(name = "CreatedOn", length = 23)) })
	public TblInterDistanceWponRouteId getId() {
		return this.id;
	}

	public void setId(TblInterDistanceWponRouteId id) {
		this.id = id;
	}

}