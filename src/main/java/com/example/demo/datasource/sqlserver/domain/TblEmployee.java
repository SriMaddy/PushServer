package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TblEmployee generated by hbm2java
 */
@Entity
@Table(name = "tblEmployee", schema = "dbo", catalog = "FMS4.0")
public class TblEmployee implements java.io.Serializable {

	private int empid;
	private Serializable name;
	private Serializable dept;

	public TblEmployee() {
	}

	public TblEmployee(int empid) {
		this.empid = empid;
	}

	public TblEmployee(int empid, Serializable name, Serializable dept) {
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}

	@Id

	@Column(name = "empid", unique = true, nullable = false)
	public int getEmpid() {
		return this.empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	@Column(name = "name")
	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	@Column(name = "dept")
	public Serializable getDept() {
		return this.dept;
	}

	public void setDept(Serializable dept) {
		this.dept = dept;
	}

}