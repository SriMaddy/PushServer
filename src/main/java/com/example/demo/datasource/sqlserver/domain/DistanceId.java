package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DistanceId generated by hbm2java
 */
@Embeddable
public class DistanceId implements java.io.Serializable {

	private int groupId;
	private int passengerFrom;
	private int passengerTo;

	public DistanceId() {
	}

	public DistanceId(int groupId, int passengerFrom, int passengerTo) {
		this.groupId = groupId;
		this.passengerFrom = passengerFrom;
		this.passengerTo = passengerTo;
	}

	@Column(name = "GroupID", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	@Column(name = "PassengerFrom", nullable = false)
	public int getPassengerFrom() {
		return this.passengerFrom;
	}

	public void setPassengerFrom(int passengerFrom) {
		this.passengerFrom = passengerFrom;
	}

	@Column(name = "PassengerTo", nullable = false)
	public int getPassengerTo() {
		return this.passengerTo;
	}

	public void setPassengerTo(int passengerTo) {
		this.passengerTo = passengerTo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DistanceId))
			return false;
		DistanceId castOther = (DistanceId) other;

		return (this.getGroupId() == castOther.getGroupId())
				&& (this.getPassengerFrom() == castOther.getPassengerFrom())
				&& (this.getPassengerTo() == castOther.getPassengerTo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGroupId();
		result = 37 * result + this.getPassengerFrom();
		result = 37 * result + this.getPassengerTo();
		return result;
	}

}