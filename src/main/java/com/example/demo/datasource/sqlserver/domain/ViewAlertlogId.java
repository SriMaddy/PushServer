package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewAlertlogId generated by hbm2java
 */
@Embeddable
public class ViewAlertlogId implements java.io.Serializable {

	private int id;
	private String vehicleno;
	private Double lat;
	private Double long_;
	private Double speed;
	private Date datetime;
	private String wayPointName;
	private Integer groupid;
	private Integer alerttype;
	private Integer fleetid;
	private Double odometerReading;
	private String probableroutes;
	private String routeName;
	private Date actualDateTime;

	public ViewAlertlogId() {
	}

	public ViewAlertlogId(int id) {
		this.id = id;
	}

	public ViewAlertlogId(int id, String vehicleno, Double lat, Double long_, Double speed, Date datetime,
			String wayPointName, Integer groupid, Integer alerttype, Integer fleetid, Double odometerReading,
			String probableroutes, String routeName, Date actualDateTime) {
		this.id = id;
		this.vehicleno = vehicleno;
		this.lat = lat;
		this.long_ = long_;
		this.speed = speed;
		this.datetime = datetime;
		this.wayPointName = wayPointName;
		this.groupid = groupid;
		this.alerttype = alerttype;
		this.fleetid = fleetid;
		this.odometerReading = odometerReading;
		this.probableroutes = probableroutes;
		this.routeName = routeName;
		this.actualDateTime = actualDateTime;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "Vehicleno", length = 50)
	public String getVehicleno() {
		return this.vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	@Column(name = "lat", precision = 53, scale = 0)
	public Double getLat() {
		return this.lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	@Column(name = "long", precision = 53, scale = 0)
	public Double getLong_() {
		return this.long_;
	}

	public void setLong_(Double long_) {
		this.long_ = long_;
	}

	@Column(name = "speed", precision = 53, scale = 0)
	public Double getSpeed() {
		return this.speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	@Column(name = "datetime", length = 23)
	public Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	@Column(name = "WayPointName", length = 50)
	public String getWayPointName() {
		return this.wayPointName;
	}

	public void setWayPointName(String wayPointName) {
		this.wayPointName = wayPointName;
	}

	@Column(name = "Groupid")
	public Integer getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	@Column(name = "alerttype")
	public Integer getAlerttype() {
		return this.alerttype;
	}

	public void setAlerttype(Integer alerttype) {
		this.alerttype = alerttype;
	}

	@Column(name = "fleetid")
	public Integer getFleetid() {
		return this.fleetid;
	}

	public void setFleetid(Integer fleetid) {
		this.fleetid = fleetid;
	}

	@Column(name = "odometerReading", precision = 53, scale = 0)
	public Double getOdometerReading() {
		return this.odometerReading;
	}

	public void setOdometerReading(Double odometerReading) {
		this.odometerReading = odometerReading;
	}

	@Column(name = "Probableroutes", length = 200)
	public String getProbableroutes() {
		return this.probableroutes;
	}

	public void setProbableroutes(String probableroutes) {
		this.probableroutes = probableroutes;
	}

	@Column(name = "RouteName", length = 50)
	public String getRouteName() {
		return this.routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	@Column(name = "ActualDateTime", length = 23)
	public Date getActualDateTime() {
		return this.actualDateTime;
	}

	public void setActualDateTime(Date actualDateTime) {
		this.actualDateTime = actualDateTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewAlertlogId))
			return false;
		ViewAlertlogId castOther = (ViewAlertlogId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getVehicleno() == castOther.getVehicleno()) || (this.getVehicleno() != null
						&& castOther.getVehicleno() != null && this.getVehicleno().equals(castOther.getVehicleno())))
				&& ((this.getLat() == castOther.getLat()) || (this.getLat() != null && castOther.getLat() != null
						&& this.getLat().equals(castOther.getLat())))
				&& ((this.getLong_() == castOther.getLong_()) || (this.getLong_() != null
						&& castOther.getLong_() != null && this.getLong_().equals(castOther.getLong_())))
				&& ((this.getSpeed() == castOther.getSpeed()) || (this.getSpeed() != null
						&& castOther.getSpeed() != null && this.getSpeed().equals(castOther.getSpeed())))
				&& ((this.getDatetime() == castOther.getDatetime()) || (this.getDatetime() != null
						&& castOther.getDatetime() != null && this.getDatetime().equals(castOther.getDatetime())))
				&& ((this.getWayPointName() == castOther.getWayPointName())
						|| (this.getWayPointName() != null && castOther.getWayPointName() != null
								&& this.getWayPointName().equals(castOther.getWayPointName())))
				&& ((this.getGroupid() == castOther.getGroupid()) || (this.getGroupid() != null
						&& castOther.getGroupid() != null && this.getGroupid().equals(castOther.getGroupid())))
				&& ((this.getAlerttype() == castOther.getAlerttype()) || (this.getAlerttype() != null
						&& castOther.getAlerttype() != null && this.getAlerttype().equals(castOther.getAlerttype())))
				&& ((this.getFleetid() == castOther.getFleetid()) || (this.getFleetid() != null
						&& castOther.getFleetid() != null && this.getFleetid().equals(castOther.getFleetid())))
				&& ((this.getOdometerReading() == castOther.getOdometerReading())
						|| (this.getOdometerReading() != null && castOther.getOdometerReading() != null
								&& this.getOdometerReading().equals(castOther.getOdometerReading())))
				&& ((this.getProbableroutes() == castOther.getProbableroutes())
						|| (this.getProbableroutes() != null && castOther.getProbableroutes() != null
								&& this.getProbableroutes().equals(castOther.getProbableroutes())))
				&& ((this.getRouteName() == castOther.getRouteName()) || (this.getRouteName() != null
						&& castOther.getRouteName() != null && this.getRouteName().equals(castOther.getRouteName())))
				&& ((this.getActualDateTime() == castOther.getActualDateTime())
						|| (this.getActualDateTime() != null && castOther.getActualDateTime() != null
								&& this.getActualDateTime().equals(castOther.getActualDateTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getVehicleno() == null ? 0 : this.getVehicleno().hashCode());
		result = 37 * result + (getLat() == null ? 0 : this.getLat().hashCode());
		result = 37 * result + (getLong_() == null ? 0 : this.getLong_().hashCode());
		result = 37 * result + (getSpeed() == null ? 0 : this.getSpeed().hashCode());
		result = 37 * result + (getDatetime() == null ? 0 : this.getDatetime().hashCode());
		result = 37 * result + (getWayPointName() == null ? 0 : this.getWayPointName().hashCode());
		result = 37 * result + (getGroupid() == null ? 0 : this.getGroupid().hashCode());
		result = 37 * result + (getAlerttype() == null ? 0 : this.getAlerttype().hashCode());
		result = 37 * result + (getFleetid() == null ? 0 : this.getFleetid().hashCode());
		result = 37 * result + (getOdometerReading() == null ? 0 : this.getOdometerReading().hashCode());
		result = 37 * result + (getProbableroutes() == null ? 0 : this.getProbableroutes().hashCode());
		result = 37 * result + (getRouteName() == null ? 0 : this.getRouteName().hashCode());
		result = 37 * result + (getActualDateTime() == null ? 0 : this.getActualDateTime().hashCode());
		return result;
	}

}
