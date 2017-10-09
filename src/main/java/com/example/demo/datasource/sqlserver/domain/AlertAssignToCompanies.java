package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AlertAssignToCompanies generated by hbm2java
 */
@Entity
@Table(name = "AlertAssignToCompanies", schema = "dbo", catalog = "FMS4.0")
public class AlertAssignToCompanies implements java.io.Serializable {

	private int alertCompanyId;
	private AlertMaster alertMaster;
	private Companies companies;

	public AlertAssignToCompanies() {
	}

	public AlertAssignToCompanies(int alertCompanyId, AlertMaster alertMaster, Companies companies) {
		this.alertCompanyId = alertCompanyId;
		this.alertMaster = alertMaster;
		this.companies = companies;
	}

	@Id

	@Column(name = "AlertCompanyID", unique = true, nullable = false)
	public int getAlertCompanyId() {
		return this.alertCompanyId;
	}

	public void setAlertCompanyId(int alertCompanyId) {
		this.alertCompanyId = alertCompanyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AlertTypeID", nullable = false)
	public AlertMaster getAlertMaster() {
		return this.alertMaster;
	}

	public void setAlertMaster(AlertMaster alertMaster) {
		this.alertMaster = alertMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CompnayID", nullable = false)
	public Companies getCompanies() {
		return this.companies;
	}

	public void setCompanies(Companies companies) {
		this.companies = companies;
	}

}
