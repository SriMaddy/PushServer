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
 * TblImeimaster generated by hbm2java
 */
@Entity
@Table(name = "tblIMEIMaster", schema = "dbo", catalog = "FMS4.0")
public class TblImeimaster implements java.io.Serializable {

	private int id;
	private Serializable imeinumber;
	private Serializable simnumber;
	private Boolean isDeleted;
	private Date createdOn;
	private Serializable createdBy;

	public TblImeimaster() {
	}

	public TblImeimaster(int id) {
		this.id = id;
	}

	public TblImeimaster(int id, Serializable imeinumber, Serializable simnumber, Boolean isDeleted, Date createdOn,
			Serializable createdBy) {
		this.id = id;
		this.imeinumber = imeinumber;
		this.simnumber = simnumber;
		this.isDeleted = isDeleted;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "IMEINumber")
	public Serializable getImeinumber() {
		return this.imeinumber;
	}

	public void setImeinumber(Serializable imeinumber) {
		this.imeinumber = imeinumber;
	}

	@Column(name = "SIMNumber")
	public Serializable getSimnumber() {
		return this.simnumber;
	}

	public void setSimnumber(Serializable simnumber) {
		this.simnumber = simnumber;
	}

	@Column(name = "IsDeleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "CreatedBy")
	public Serializable getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Serializable createdBy) {
		this.createdBy = createdBy;
	}

}