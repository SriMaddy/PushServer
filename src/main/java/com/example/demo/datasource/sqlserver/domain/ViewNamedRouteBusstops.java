package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewNamedRouteBusstops generated by hbm2java
 */
@Entity
@Table(name = "view_named_route_busstops", schema = "dbo", catalog = "FMS4.0")
public class ViewNamedRouteBusstops implements java.io.Serializable {

	private ViewNamedRouteBusstopsId id;

	public ViewNamedRouteBusstops() {
	}

	public ViewNamedRouteBusstops(ViewNamedRouteBusstopsId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "routeNumber", column = @Column(name = "route_number", nullable = false)),
			@AttributeOverride(name = "stopId", column = @Column(name = "stop_id", nullable = false)),
			@AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "indx", column = @Column(name = "indx", nullable = false)),
			@AttributeOverride(name = "distance", column = @Column(name = "distance")),
			@AttributeOverride(name = "distanceFromOrigin", column = @Column(name = "DISTANCE_FROM_ORIGIN")) })
	public ViewNamedRouteBusstopsId getId() {
		return this.id;
	}

	public void setId(ViewNamedRouteBusstopsId id) {
		this.id = id;
	}

}
