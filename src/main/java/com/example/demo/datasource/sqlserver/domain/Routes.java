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
 * Routes generated by hbm2java
 */
@Entity
@Table(name = "Routes", schema = "dbo", catalog = "FMS4.0")
public class Routes implements java.io.Serializable {

	private int routeId;
	private Serializable routeName;
	private Integer origin;
	private Integer destination;
	private Double totalDistance;
	private String createdBy;
	private Date createOn;
	private String modifiedBy;
	private Date modifiedOn;
	private boolean isDeleted;
	private Integer companyId;
	private Integer groupId;
	private Date origionWptime;
	private Date destWptime;
	private Serializable origionTime;
	private Serializable destinationTime;
	private Serializable tripDistance;

	public Routes() {
	}

	public Routes(int routeId, boolean isDeleted) {
		this.routeId = routeId;
		this.isDeleted = isDeleted;
	}

	public Routes(int routeId, Serializable routeName, Integer origin, Integer destination, Double totalDistance,
			String createdBy, Date createOn, String modifiedBy, Date modifiedOn, boolean isDeleted, Integer companyId,
			Integer groupId, Date origionWptime, Date destWptime, Serializable origionTime,
			Serializable destinationTime, Serializable tripDistance) {
		this.routeId = routeId;
		this.routeName = routeName;
		this.origin = origin;
		this.destination = destination;
		this.totalDistance = totalDistance;
		this.createdBy = createdBy;
		this.createOn = createOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.isDeleted = isDeleted;
		this.companyId = companyId;
		this.groupId = groupId;
		this.origionWptime = origionWptime;
		this.destWptime = destWptime;
		this.origionTime = origionTime;
		this.destinationTime = destinationTime;
		this.tripDistance = tripDistance;
	}

	@Id

	@Column(name = "RouteId", unique = true, nullable = false)
	public int getRouteId() {
		return this.routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	@Column(name = "RouteName")
	public Serializable getRouteName() {
		return this.routeName;
	}

	public void setRouteName(Serializable routeName) {
		this.routeName = routeName;
	}

	@Column(name = "Origin")
	public Integer getOrigin() {
		return this.origin;
	}

	public void setOrigin(Integer origin) {
		this.origin = origin;
	}

	@Column(name = "Destination")
	public Integer getDestination() {
		return this.destination;
	}

	public void setDestination(Integer destination) {
		this.destination = destination;
	}

	@Column(name = "TotalDistance", precision = 53, scale = 0)
	public Double getTotalDistance() {
		return this.totalDistance;
	}

	public void setTotalDistance(Double totalDistance) {
		this.totalDistance = totalDistance;
	}

	@Column(name = "CreatedBy", length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateOn", length = 23)
	public Date getCreateOn() {
		return this.createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
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

	@Column(name = "isDeleted", nullable = false)
	public boolean isIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "CompanyID")
	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	@Column(name = "GroupID")
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "OrigionWPTime", length = 12)
	public Date getOrigionWptime() {
		return this.origionWptime;
	}

	public void setOrigionWptime(Date origionWptime) {
		this.origionWptime = origionWptime;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "DestWPTime", length = 12)
	public Date getDestWptime() {
		return this.destWptime;
	}

	public void setDestWptime(Date destWptime) {
		this.destWptime = destWptime;
	}

	@Column(name = "OrigionTime")
	public Serializable getOrigionTime() {
		return this.origionTime;
	}

	public void setOrigionTime(Serializable origionTime) {
		this.origionTime = origionTime;
	}

	@Column(name = "DestinationTime")
	public Serializable getDestinationTime() {
		return this.destinationTime;
	}

	public void setDestinationTime(Serializable destinationTime) {
		this.destinationTime = destinationTime;
	}

	@Column(name = "TripDistance")
	public Serializable getTripDistance() {
		return this.tripDistance;
	}

	public void setTripDistance(Serializable tripDistance) {
		this.tripDistance = tripDistance;
	}

}