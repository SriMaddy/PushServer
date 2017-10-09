package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AlertMode generated by hbm2java
 */
@Entity
@Table(name = "AlertMode", schema = "dbo", catalog = "FMS4.0")
public class AlertMode implements java.io.Serializable {

	private int id;
	private Integer alertModeId;
	private Integer alertTypeId;

	public AlertMode() {
	}

	public AlertMode(int id) {
		this.id = id;
	}

	public AlertMode(int id, Integer alertModeId, Integer alertTypeId) {
		this.id = id;
		this.alertModeId = alertModeId;
		this.alertTypeId = alertTypeId;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "AlertModeID")
	public Integer getAlertModeId() {
		return this.alertModeId;
	}

	public void setAlertModeId(Integer alertModeId) {
		this.alertModeId = alertModeId;
	}

	@Column(name = "AlertTypeID")
	public Integer getAlertTypeId() {
		return this.alertTypeId;
	}

	public void setAlertTypeId(Integer alertTypeId) {
		this.alertTypeId = alertTypeId;
	}

}