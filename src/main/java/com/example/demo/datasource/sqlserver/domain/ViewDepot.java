package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewDepot generated by hbm2java
 */
@Entity
@Table(name = "view_depot", schema = "dbo", catalog = "FMS4.0")
public class ViewDepot implements java.io.Serializable {

	private ViewDepotId id;

	public ViewDepot() {
	}

	public ViewDepot(ViewDepotId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "depotId", column = @Column(name = "depot_id", nullable = false)),
			@AttributeOverride(name = "depotName", column = @Column(name = "depot_name")),
			@AttributeOverride(name = "fenceGeom", column = @Column(name = "fence_geom")) })
	public ViewDepotId getId() {
		return this.id;
	}

	public void setId(ViewDepotId id) {
		this.id = id;
	}

}
