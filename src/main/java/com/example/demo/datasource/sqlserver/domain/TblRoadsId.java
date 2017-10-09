package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblRoadsId generated by hbm2java
 */
@Embeddable
public class TblRoadsId implements java.io.Serializable {

	private int id;
	private Serializable roadNme;
	private Serializable roadAlt;
	private Serializable ftrCry;
	private Serializable fow;
	private Serializable fowNme;
	private Serializable city;
	private Serializable state;
	private byte[] geom;

	public TblRoadsId() {
	}

	public TblRoadsId(int id) {
		this.id = id;
	}

	public TblRoadsId(int id, Serializable roadNme, Serializable roadAlt, Serializable ftrCry, Serializable fow,
			Serializable fowNme, Serializable city, Serializable state, byte[] geom) {
		this.id = id;
		this.roadNme = roadNme;
		this.roadAlt = roadAlt;
		this.ftrCry = ftrCry;
		this.fow = fow;
		this.fowNme = fowNme;
		this.city = city;
		this.state = state;
		this.geom = geom;
	}

	@Column(name = "ID", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "ROAD_NME")
	public Serializable getRoadNme() {
		return this.roadNme;
	}

	public void setRoadNme(Serializable roadNme) {
		this.roadNme = roadNme;
	}

	@Column(name = "ROAD_ALT")
	public Serializable getRoadAlt() {
		return this.roadAlt;
	}

	public void setRoadAlt(Serializable roadAlt) {
		this.roadAlt = roadAlt;
	}

	@Column(name = "FTR_CRY")
	public Serializable getFtrCry() {
		return this.ftrCry;
	}

	public void setFtrCry(Serializable ftrCry) {
		this.ftrCry = ftrCry;
	}

	@Column(name = "FOW")
	public Serializable getFow() {
		return this.fow;
	}

	public void setFow(Serializable fow) {
		this.fow = fow;
	}

	@Column(name = "FOW_NME")
	public Serializable getFowNme() {
		return this.fowNme;
	}

	public void setFowNme(Serializable fowNme) {
		this.fowNme = fowNme;
	}

	@Column(name = "CITY")
	public Serializable getCity() {
		return this.city;
	}

	public void setCity(Serializable city) {
		this.city = city;
	}

	@Column(name = "STATE")
	public Serializable getState() {
		return this.state;
	}

	public void setState(Serializable state) {
		this.state = state;
	}

	@Column(name = "geom")
	public byte[] getGeom() {
		return this.geom;
	}

	public void setGeom(byte[] geom) {
		this.geom = geom;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblRoadsId))
			return false;
		TblRoadsId castOther = (TblRoadsId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getRoadNme() == castOther.getRoadNme()) || (this.getRoadNme() != null
						&& castOther.getRoadNme() != null && this.getRoadNme().equals(castOther.getRoadNme())))
				&& ((this.getRoadAlt() == castOther.getRoadAlt()) || (this.getRoadAlt() != null
						&& castOther.getRoadAlt() != null && this.getRoadAlt().equals(castOther.getRoadAlt())))
				&& ((this.getFtrCry() == castOther.getFtrCry()) || (this.getFtrCry() != null
						&& castOther.getFtrCry() != null && this.getFtrCry().equals(castOther.getFtrCry())))
				&& ((this.getFow() == castOther.getFow()) || (this.getFow() != null && castOther.getFow() != null
						&& this.getFow().equals(castOther.getFow())))
				&& ((this.getFowNme() == castOther.getFowNme()) || (this.getFowNme() != null
						&& castOther.getFowNme() != null && this.getFowNme().equals(castOther.getFowNme())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null && castOther.getCity() != null
						&& this.getCity().equals(castOther.getCity())))
				&& ((this.getState() == castOther.getState()) || (this.getState() != null
						&& castOther.getState() != null && this.getState().equals(castOther.getState())))
				&& ((this.getGeom() == castOther.getGeom()) || (this.getGeom() != null && castOther.getGeom() != null
						&& Arrays.equals(this.getGeom(), castOther.getGeom())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getRoadNme() == null ? 0 : this.getRoadNme().hashCode());
		result = 37 * result + (getRoadAlt() == null ? 0 : this.getRoadAlt().hashCode());
		result = 37 * result + (getFtrCry() == null ? 0 : this.getFtrCry().hashCode());
		result = 37 * result + (getFow() == null ? 0 : this.getFow().hashCode());
		result = 37 * result + (getFowNme() == null ? 0 : this.getFowNme().hashCode());
		result = 37 * result + (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result + (getState() == null ? 0 : this.getState().hashCode());
		result = 37 * result + (getGeom() == null ? 0 : Arrays.hashCode(this.getGeom()));
		return result;
	}

}