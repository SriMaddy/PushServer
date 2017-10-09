package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RoleMenu generated by hbm2java
 */
@Entity
@Table(name = "RoleMenu", schema = "dbo", catalog = "FMS4.0")
public class RoleMenu implements java.io.Serializable {

	private int id;
	private int roleId;
	private int menuId;
	private String createdBy;
	private Date createdOn;
	private String modifiedBy;
	private Date modifiedOn;
	private Boolean isDeleted;
	private Boolean readAccess;
	private Boolean writeAccess;
	private Boolean deleteAccess;

	public RoleMenu() {
	}

	public RoleMenu(int id, int roleId, int menuId) {
		this.id = id;
		this.roleId = roleId;
		this.menuId = menuId;
	}

	public RoleMenu(int id, int roleId, int menuId, String createdBy, Date createdOn, String modifiedBy,
			Date modifiedOn, Boolean isDeleted, Boolean readAccess, Boolean writeAccess, Boolean deleteAccess) {
		this.id = id;
		this.roleId = roleId;
		this.menuId = menuId;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.isDeleted = isDeleted;
		this.readAccess = readAccess;
		this.writeAccess = writeAccess;
		this.deleteAccess = deleteAccess;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "RoleId", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Column(name = "MenuId", nullable = false)
	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Column(name = "CreatedBy", length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "ModifiedBy", length = 50)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ModifiedOn", length = 23)
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

	@Column(name = "ReadAccess")
	public Boolean getReadAccess() {
		return this.readAccess;
	}

	public void setReadAccess(Boolean readAccess) {
		this.readAccess = readAccess;
	}

	@Column(name = "WriteAccess")
	public Boolean getWriteAccess() {
		return this.writeAccess;
	}

	public void setWriteAccess(Boolean writeAccess) {
		this.writeAccess = writeAccess;
	}

	@Column(name = "DeleteAccess")
	public Boolean getDeleteAccess() {
		return this.deleteAccess;
	}

	public void setDeleteAccess(Boolean deleteAccess) {
		this.deleteAccess = deleteAccess;
	}

}
