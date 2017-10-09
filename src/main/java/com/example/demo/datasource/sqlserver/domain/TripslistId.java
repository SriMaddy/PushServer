package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TripslistId generated by hbm2java
 */
@Embeddable
public class TripslistId implements java.io.Serializable {

	private int id;
	private Serializable vehicleno;
	private Date astarttime;
	private Date aendtime;

	public TripslistId() {
	}

	public TripslistId(int id) {
		this.id = id;
	}

	public TripslistId(int id, Serializable vehicleno, Date astarttime, Date aendtime) {
		this.id = id;
		this.vehicleno = vehicleno;
		this.astarttime = astarttime;
		this.aendtime = aendtime;
	}

	@Column(name = "ID", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "VEHICLENO")
	public Serializable getVehicleno() {
		return this.vehicleno;
	}

	public void setVehicleno(Serializable vehicleno) {
		this.vehicleno = vehicleno;
	}

	@Column(name = "ASTARTTIME", length = 23)
	public Date getAstarttime() {
		return this.astarttime;
	}

	public void setAstarttime(Date astarttime) {
		this.astarttime = astarttime;
	}

	@Column(name = "AENDTIME", length = 23)
	public Date getAendtime() {
		return this.aendtime;
	}

	public void setAendtime(Date aendtime) {
		this.aendtime = aendtime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TripslistId))
			return false;
		TripslistId castOther = (TripslistId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getVehicleno() == castOther.getVehicleno()) || (this.getVehicleno() != null
						&& castOther.getVehicleno() != null && this.getVehicleno().equals(castOther.getVehicleno())))
				&& ((this.getAstarttime() == castOther.getAstarttime()) || (this.getAstarttime() != null
						&& castOther.getAstarttime() != null && this.getAstarttime().equals(castOther.getAstarttime())))
				&& ((this.getAendtime() == castOther.getAendtime()) || (this.getAendtime() != null
						&& castOther.getAendtime() != null && this.getAendtime().equals(castOther.getAendtime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getVehicleno() == null ? 0 : this.getVehicleno().hashCode());
		result = 37 * result + (getAstarttime() == null ? 0 : this.getAstarttime().hashCode());
		result = 37 * result + (getAendtime() == null ? 0 : this.getAendtime().hashCode());
		return result;
	}

}
