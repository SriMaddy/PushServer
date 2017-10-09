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
 * TblSmsdeliveryStatus generated by hbm2java
 */
@Entity
@Table(name = "tbl_SMSDeliveryStatus", schema = "dbo", catalog = "FMS4.0")
public class TblSmsdeliveryStatus implements java.io.Serializable {

	private int id;
	private Serializable notificationId;
	private Serializable mobileNo;
	private Serializable status;
	private Serializable smsid;
	private Serializable fullInfo;
	private Date createddate;

	public TblSmsdeliveryStatus() {
	}

	public TblSmsdeliveryStatus(int id) {
		this.id = id;
	}

	public TblSmsdeliveryStatus(int id, Serializable notificationId, Serializable mobileNo, Serializable status,
			Serializable smsid, Serializable fullInfo, Date createddate) {
		this.id = id;
		this.notificationId = notificationId;
		this.mobileNo = mobileNo;
		this.status = status;
		this.smsid = smsid;
		this.fullInfo = fullInfo;
		this.createddate = createddate;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NotificationId")
	public Serializable getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(Serializable notificationId) {
		this.notificationId = notificationId;
	}

	@Column(name = "MobileNo")
	public Serializable getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(Serializable mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name = "Status")
	public Serializable getStatus() {
		return this.status;
	}

	public void setStatus(Serializable status) {
		this.status = status;
	}

	@Column(name = "SMSId")
	public Serializable getSmsid() {
		return this.smsid;
	}

	public void setSmsid(Serializable smsid) {
		this.smsid = smsid;
	}

	@Column(name = "FullInfo")
	public Serializable getFullInfo() {
		return this.fullInfo;
	}

	public void setFullInfo(Serializable fullInfo) {
		this.fullInfo = fullInfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Createddate", length = 23)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

}
