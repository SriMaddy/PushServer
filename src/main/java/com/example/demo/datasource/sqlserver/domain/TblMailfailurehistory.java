package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TblMailfailurehistory generated by hbm2java
 */
@Entity
@Table(name = "TBL_MAILFAILUREHISTORY", schema = "dbo", catalog = "FMS4.0")
public class TblMailfailurehistory implements java.io.Serializable {

	private TblMailfailurehistoryId id;

	public TblMailfailurehistory() {
	}

	public TblMailfailurehistory(TblMailfailurehistoryId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false)),
			@AttributeOverride(name = "mailid", column = @Column(name = "MAILID")),
			@AttributeOverride(name = "attemptno", column = @Column(name = "ATTEMPTNO")),
			@AttributeOverride(name = "failuremessage", column = @Column(name = "FAILUREMESSAGE")),
			@AttributeOverride(name = "createon", column = @Column(name = "CREATEON", length = 10)) })
	public TblMailfailurehistoryId getId() {
		return this.id;
	}

	public void setId(TblMailfailurehistoryId id) {
		this.id = id;
	}

}
