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
 * EtaLog generated by hbm2java
 */
@Entity
@Table(name = "EtaLog", schema = "dbo", catalog = "FMS4.0")
public class EtaLog implements java.io.Serializable {

	private int id;
	private Serializable routeId;
	private Serializable wayPointId;
	private Serializable eta;
	private Serializable pageName;
	private Date etaTime;

	public EtaLog() {
	}

	public EtaLog(int id) {
		this.id = id;
	}

	public EtaLog(int id, Serializable routeId, Serializable wayPointId, Serializable eta, Serializable pageName,
			Date etaTime) {
		this.id = id;
		this.routeId = routeId;
		this.wayPointId = wayPointId;
		this.eta = eta;
		this.pageName = pageName;
		this.etaTime = etaTime;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "RouteID")
	public Serializable getRouteId() {
		return this.routeId;
	}

	public void setRouteId(Serializable routeId) {
		this.routeId = routeId;
	}

	@Column(name = "WayPointID")
	public Serializable getWayPointId() {
		return this.wayPointId;
	}

	public void setWayPointId(Serializable wayPointId) {
		this.wayPointId = wayPointId;
	}

	@Column(name = "ETa")
	public Serializable getEta() {
		return this.eta;
	}

	public void setEta(Serializable eta) {
		this.eta = eta;
	}

	@Column(name = "PageName")
	public Serializable getPageName() {
		return this.pageName;
	}

	public void setPageName(Serializable pageName) {
		this.pageName = pageName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EtaTime", length = 23)
	public Date getEtaTime() {
		return this.etaTime;
	}

	public void setEtaTime(Date etaTime) {
		this.etaTime = etaTime;
	}

}
