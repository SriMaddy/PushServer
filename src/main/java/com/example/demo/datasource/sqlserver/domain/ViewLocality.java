package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewLocality generated by hbm2java
 */
@Entity
@Table(name = "View_Locality", schema = "dbo", catalog = "FMS4.0")
public class ViewLocality implements java.io.Serializable {

	private ViewLocalityId id;

	public ViewLocality() {
	}

	public ViewLocality(ViewLocalityId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false)),
			@AttributeOverride(name = "locNme", column = @Column(name = "LOC_NME")),
			@AttributeOverride(name = "locAlt", column = @Column(name = "LOC_ALT")),
			@AttributeOverride(name = "locId", column = @Column(name = "LOC_ID")),
			@AttributeOverride(name = "ftrCry", column = @Column(name = "FTR_CRY")),
			@AttributeOverride(name = "cityNme", column = @Column(name = "CITY_NME")),
			@AttributeOverride(name = "cityId", column = @Column(name = "CITY_ID")),
			@AttributeOverride(name = "sttNme", column = @Column(name = "STT_NME")),
			@AttributeOverride(name = "sttId", column = @Column(name = "STT_ID")),
			@AttributeOverride(name = "cntNme", column = @Column(name = "CNT_NME")),
			@AttributeOverride(name = "geom", column = @Column(name = "geom")) })
	public ViewLocalityId getId() {
		return this.id;
	}

	public void setId(ViewLocalityId id) {
		this.id = id;
	}

}
