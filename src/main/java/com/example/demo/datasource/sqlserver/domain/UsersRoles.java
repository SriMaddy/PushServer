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
 * UsersRoles generated by hbm2java
 */
@Entity
@Table(name = "UsersRoles", schema = "dbo", catalog = "FMS4.0")
public class UsersRoles implements java.io.Serializable {

	private int id;
	private int userId;
	private int roleId;
	private Serializable createdBy;
	private Date createOn;
	private String modifiedBy;
	private Date modifiedOn;
	private Boolean isDeleted;

	public UsersRoles() {
	}

	public UsersRoles(int id, int userId, int roleId) {
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
	}

	public UsersRoles(int id, int userId, int roleId, Serializable createdBy, Date createOn, String modifiedBy,
			Date modifiedOn, Boolean isDeleted) {
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
		this.createdBy = createdBy;
		this.createOn = createOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.isDeleted = isDeleted;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "UserId", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "RoleId", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "CreatedBy")
	public Serializable getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Serializable createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createOn", length = 23)
	public Date getCreateOn() {
		return this.createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	@Column(name = "modifiedBy", length = 50)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedOn", length = 23)
	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column(name = "isDeleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

}