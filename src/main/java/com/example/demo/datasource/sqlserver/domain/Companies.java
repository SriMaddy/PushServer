package com.example.demo.datasource.sqlserver.domain;
// Generated Sep 8, 2017 3:06:00 PM by Hibernate Tools 4.3.1.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Companies generated by hbm2java
 */
@Entity
@Table(name = "Companies", schema = "dbo", catalog = "FMS4.0")
public class Companies implements java.io.Serializable {

	private int id;
	private Serializable companyName;
	private Serializable address1;
	private Serializable address2;
	private Serializable address3;
	private Integer countryId;
	private Long stateId;
	private Long districtId;
	private Long cityId;
	private Serializable contactPerson;
	private Serializable contactNumber1;
	private Serializable mobileNumber;
	private Serializable email;
	private Serializable fax;
	private Boolean isActive;
	private Serializable createdBy;
	private Date createdOn;
	private Serializable modifiedBy;
	private Date modifiedOn;
	private Serializable pinCode;
	private Boolean isDeleted;
	private Serializable companyId;
	private Serializable contactNumber2;
	private Integer logoType;
	private Set<AlertAssignToCompanies> alertAssignToCompanieses = new HashSet<AlertAssignToCompanies>(0);

	public Companies() {
	}

	public Companies(int id, Serializable companyName, Serializable address1) {
		this.id = id;
		this.companyName = companyName;
		this.address1 = address1;
	}

	public Companies(int id, Serializable companyName, Serializable address1, Serializable address2,
			Serializable address3, Integer countryId, Long stateId, Long districtId, Long cityId,
			Serializable contactPerson, Serializable contactNumber1, Serializable mobileNumber, Serializable email,
			Serializable fax, Boolean isActive, Serializable createdBy, Date createdOn, Serializable modifiedBy,
			Date modifiedOn, Serializable pinCode, Boolean isDeleted, Serializable companyId,
			Serializable contactNumber2, Integer logoType, Set<AlertAssignToCompanies> alertAssignToCompanieses) {
		this.id = id;
		this.companyName = companyName;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.countryId = countryId;
		this.stateId = stateId;
		this.districtId = districtId;
		this.cityId = cityId;
		this.contactPerson = contactPerson;
		this.contactNumber1 = contactNumber1;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.fax = fax;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.pinCode = pinCode;
		this.isDeleted = isDeleted;
		this.companyId = companyId;
		this.contactNumber2 = contactNumber2;
		this.logoType = logoType;
		this.alertAssignToCompanieses = alertAssignToCompanieses;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "CompanyName", nullable = false)
	public Serializable getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(Serializable companyName) {
		this.companyName = companyName;
	}

	@Column(name = "Address1", nullable = false)
	public Serializable getAddress1() {
		return this.address1;
	}

	public void setAddress1(Serializable address1) {
		this.address1 = address1;
	}

	@Column(name = "Address2")
	public Serializable getAddress2() {
		return this.address2;
	}

	public void setAddress2(Serializable address2) {
		this.address2 = address2;
	}

	@Column(name = "Address3")
	public Serializable getAddress3() {
		return this.address3;
	}

	public void setAddress3(Serializable address3) {
		this.address3 = address3;
	}

	@Column(name = "CountryId")
	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Column(name = "StateId")
	public Long getStateId() {
		return this.stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	@Column(name = "DistrictId")
	public Long getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Long districtId) {
		this.districtId = districtId;
	}

	@Column(name = "CityId")
	public Long getCityId() {
		return this.cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	@Column(name = "ContactPerson")
	public Serializable getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(Serializable contactPerson) {
		this.contactPerson = contactPerson;
	}

	@Column(name = "ContactNumber1")
	public Serializable getContactNumber1() {
		return this.contactNumber1;
	}

	public void setContactNumber1(Serializable contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	@Column(name = "MobileNumber")
	public Serializable getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(Serializable mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Column(name = "Email")
	public Serializable getEmail() {
		return this.email;
	}

	public void setEmail(Serializable email) {
		this.email = email;
	}

	@Column(name = "Fax")
	public Serializable getFax() {
		return this.fax;
	}

	public void setFax(Serializable fax) {
		this.fax = fax;
	}

	@Column(name = "IsActive")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "CreatedBy")
	public Serializable getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Serializable createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedOn", length = 23)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name = "ModifiedBy")
	public Serializable getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Serializable modifiedBy) {
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

	@Column(name = "PinCode")
	public Serializable getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(Serializable pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name = "IsDeleted")
	public Boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "CompanyId")
	public Serializable getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Serializable companyId) {
		this.companyId = companyId;
	}

	@Column(name = "ContactNumber2")
	public Serializable getContactNumber2() {
		return this.contactNumber2;
	}

	public void setContactNumber2(Serializable contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}

	@Column(name = "LogoType")
	public Integer getLogoType() {
		return this.logoType;
	}

	public void setLogoType(Integer logoType) {
		this.logoType = logoType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "companies")
	public Set<AlertAssignToCompanies> getAlertAssignToCompanieses() {
		return this.alertAssignToCompanieses;
	}

	public void setAlertAssignToCompanieses(Set<AlertAssignToCompanies> alertAssignToCompanieses) {
		this.alertAssignToCompanieses = alertAssignToCompanieses;
	}

}