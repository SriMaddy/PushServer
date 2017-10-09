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
 * Request generated by hbm2java
 */
@Entity
@Table(name = "Request", schema = "dbo", catalog = "FMS4.0")
public class Request implements java.io.Serializable {

	private int id;
	private Integer passengerId;
	private byte[] source;
	private Integer sourceId;
	private Serializable sourceName;
	private byte[] destination;
	private Serializable destinationId;
	private Serializable destinationName;
	private Boolean requestType;
	private Date requestedOn;
	private Date scheduledOn;
	private Date createdOn;
	private Date updatedOn;
	private Double distance;
	private Double distancePrePoint;
	private Integer direction;
	private Integer statusId;
	private Integer vehicleId;
	private Integer updatedBy;
	private Serializable additionalInfo;
	private Integer groupId;

	public Request() {
	}

	public Request(int id) {
		this.id = id;
	}

	public Request(int id, Integer passengerId, byte[] source, Integer sourceId, Serializable sourceName,
			byte[] destination, Serializable destinationId, Serializable destinationName, Boolean requestType,
			Date requestedOn, Date scheduledOn, Date createdOn, Date updatedOn, Double distance,
			Double distancePrePoint, Integer direction, Integer statusId, Integer vehicleId, Integer updatedBy,
			Serializable additionalInfo, Integer groupId) {
		this.id = id;
		this.passengerId = passengerId;
		this.source = source;
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.destination = destination;
		this.destinationId = destinationId;
		this.destinationName = destinationName;
		this.requestType = requestType;
		this.requestedOn = requestedOn;
		this.scheduledOn = scheduledOn;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.distance = distance;
		this.distancePrePoint = distancePrePoint;
		this.direction = direction;
		this.statusId = statusId;
		this.vehicleId = vehicleId;
		this.updatedBy = updatedBy;
		this.additionalInfo = additionalInfo;
		this.groupId = groupId;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "PassengerId")
	public Integer getPassengerId() {
		return this.passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	@Column(name = "Source")
	public byte[] getSource() {
		return this.source;
	}

	public void setSource(byte[] source) {
		this.source = source;
	}

	@Column(name = "SourceID")
	public Integer getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}

	@Column(name = "SourceName")
	public Serializable getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(Serializable sourceName) {
		this.sourceName = sourceName;
	}

	@Column(name = "Destination")
	public byte[] getDestination() {
		return this.destination;
	}

	public void setDestination(byte[] destination) {
		this.destination = destination;
	}

	@Column(name = "DestinationID")
	public Serializable getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(Serializable destinationId) {
		this.destinationId = destinationId;
	}

	@Column(name = "DestinationName")
	public Serializable getDestinationName() {
		return this.destinationName;
	}

	public void setDestinationName(Serializable destinationName) {
		this.destinationName = destinationName;
	}

	@Column(name = "RequestType")
	public Boolean getRequestType() {
		return this.requestType;
	}

	public void setRequestType(Boolean requestType) {
		this.requestType = requestType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RequestedOn", length = 23)
	public Date getRequestedOn() {
		return this.requestedOn;
	}

	public void setRequestedOn(Date requestedOn) {
		this.requestedOn = requestedOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Scheduled On", length = 23)
	public Date getScheduledOn() {
		return this.scheduledOn;
	}

	public void setScheduledOn(Date scheduledOn) {
		this.scheduledOn = scheduledOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdatedOn", length = 23)
	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Column(name = "Distance", precision = 53, scale = 0)
	public Double getDistance() {
		return this.distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	@Column(name = "DistancePrePoint", precision = 53, scale = 0)
	public Double getDistancePrePoint() {
		return this.distancePrePoint;
	}

	public void setDistancePrePoint(Double distancePrePoint) {
		this.distancePrePoint = distancePrePoint;
	}

	@Column(name = "Direction")
	public Integer getDirection() {
		return this.direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	@Column(name = "StatusId")
	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	@Column(name = "VehicleId")
	public Integer getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Column(name = "UpdatedBy")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Column(name = "AdditionalInfo")
	public Serializable getAdditionalInfo() {
		return this.additionalInfo;
	}

	public void setAdditionalInfo(Serializable additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Column(name = "GroupID")
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

}
