package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblsampleId generated by hbm2java
 */
@Embeddable
public class TblsampleId implements java.io.Serializable {

	private int id;
	private Serializable groupbyId;
	private Double fuel;

	public TblsampleId() {
	}

	public TblsampleId(int id) {
		this.id = id;
	}

	public TblsampleId(int id, Serializable groupbyId, Double fuel) {
		this.id = id;
		this.groupbyId = groupbyId;
		this.fuel = fuel;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "GroupbyID")
	public Serializable getGroupbyId() {
		return this.groupbyId;
	}

	public void setGroupbyId(Serializable groupbyId) {
		this.groupbyId = groupbyId;
	}

	@Column(name = "fuel", precision = 53, scale = 0)
	public Double getFuel() {
		return this.fuel;
	}

	public void setFuel(Double fuel) {
		this.fuel = fuel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblsampleId))
			return false;
		TblsampleId castOther = (TblsampleId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getGroupbyId() == castOther.getGroupbyId()) || (this.getGroupbyId() != null
						&& castOther.getGroupbyId() != null && this.getGroupbyId().equals(castOther.getGroupbyId())))
				&& ((this.getFuel() == castOther.getFuel()) || (this.getFuel() != null && castOther.getFuel() != null
						&& this.getFuel().equals(castOther.getFuel())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getGroupbyId() == null ? 0 : this.getGroupbyId().hashCode());
		result = 37 * result + (getFuel() == null ? 0 : this.getFuel().hashCode());
		return result;
	}

}
