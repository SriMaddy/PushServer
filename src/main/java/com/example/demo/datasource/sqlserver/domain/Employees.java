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
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "Employees", schema = "dbo", catalog = "FMS4.0")
public class Employees implements java.io.Serializable {

	private int id;
	private Serializable employeeId;
	private Serializable employeeName;
	private Serializable fathersName;
	private String tagId;
	private Serializable address1;
	private Serializable address2;
	private Serializable address3;
	private Integer countryId;
	private Long stateId;
	private Long districtId;
	private Long cityId;
	private Serializable pinCode;
	private Serializable contactNumber;
	private Serializable licenceNumber;
	private Date licenceExpiry;
	private Serializable createdBy;
	private Date createOn;
	private Serializable modifiedBy;
	private Date modifiedOn;
	private boolean isDeleted;
	private Date dateOfBirth;
	private Integer groupId;
	private Integer employeeType;
	private Integer bloodGroup;
	private Date dateOfJoining;
	private Date healthCheckupDate;
	private Date healthCheckupDueDate;
	private Serializable badgeNumber;
	private Date badgeExpiryDate;
	private Serializable healthProblems;
	private Integer weeklyOff;
	private Serializable driverImagePath;
	private Serializable driverDlpath;
	private Serializable driverBnpath;
	private byte[] driverImage;
	private Set<DutyAllocation> dutyAllocations = new HashSet<DutyAllocation>(0);

	public Employees() {
	}

	public Employees(int id, Serializable employeeId, Serializable employeeName, Date createOn, boolean isDeleted) {
		this.id = id;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.createOn = createOn;
		this.isDeleted = isDeleted;
	}

	public Employees(int id, Serializable employeeId, Serializable employeeName, Serializable fathersName, String tagId,
			Serializable address1, Serializable address2, Serializable address3, Integer countryId, Long stateId,
			Long districtId, Long cityId, Serializable pinCode, Serializable contactNumber, Serializable licenceNumber,
			Date licenceExpiry, Serializable createdBy, Date createOn, Serializable modifiedBy, Date modifiedOn,
			boolean isDeleted, Date dateOfBirth, Integer groupId, Integer employeeType, Integer bloodGroup,
			Date dateOfJoining, Date healthCheckupDate, Date healthCheckupDueDate, Serializable badgeNumber,
			Date badgeExpiryDate, Serializable healthProblems, Integer weeklyOff, Serializable driverImagePath,
			Serializable driverDlpath, Serializable driverBnpath, byte[] driverImage,
			Set<DutyAllocation> dutyAllocations) {
		this.id = id;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.fathersName = fathersName;
		this.tagId = tagId;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.countryId = countryId;
		this.stateId = stateId;
		this.districtId = districtId;
		this.cityId = cityId;
		this.pinCode = pinCode;
		this.contactNumber = contactNumber;
		this.licenceNumber = licenceNumber;
		this.licenceExpiry = licenceExpiry;
		this.createdBy = createdBy;
		this.createOn = createOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.isDeleted = isDeleted;
		this.dateOfBirth = dateOfBirth;
		this.groupId = groupId;
		this.employeeType = employeeType;
		this.bloodGroup = bloodGroup;
		this.dateOfJoining = dateOfJoining;
		this.healthCheckupDate = healthCheckupDate;
		this.healthCheckupDueDate = healthCheckupDueDate;
		this.badgeNumber = badgeNumber;
		this.badgeExpiryDate = badgeExpiryDate;
		this.healthProblems = healthProblems;
		this.weeklyOff = weeklyOff;
		this.driverImagePath = driverImagePath;
		this.driverDlpath = driverDlpath;
		this.driverBnpath = driverBnpath;
		this.driverImage = driverImage;
		this.dutyAllocations = dutyAllocations;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "EmployeeID", nullable = false)
	public Serializable getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Serializable employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "EmployeeName", nullable = false)
	public Serializable getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(Serializable employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "FathersName")
	public Serializable getFathersName() {
		return this.fathersName;
	}

	public void setFathersName(Serializable fathersName) {
		this.fathersName = fathersName;
	}

	@Column(name = "TagId", length = 50)
	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	@Column(name = "Address1")
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

	@Column(name = "PinCode")
	public Serializable getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(Serializable pinCode) {
		this.pinCode = pinCode;
	}

	@Column(name = "ContactNumber")
	public Serializable getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(Serializable contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Column(name = "LicenceNumber")
	public Serializable getLicenceNumber() {
		return this.licenceNumber;
	}

	public void setLicenceNumber(Serializable licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LicenceExpiry", length = 23)
	public Date getLicenceExpiry() {
		return this.licenceExpiry;
	}

	public void setLicenceExpiry(Date licenceExpiry) {
		this.licenceExpiry = licenceExpiry;
	}

	@Column(name = "CreatedBy")
	public Serializable getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Serializable createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createOn", nullable = false, length = 23)
	public Date getCreateOn() {
		return this.createOn;
	}

	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}

	@Column(name = "modifiedBy")
	public Serializable getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(Serializable modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedOn", length = 23)
	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column(name = "isDeleted", nullable = false)
	public boolean isIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateOfBirth", length = 23)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "GroupId")
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "EmployeeType")
	public Integer getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(Integer employeeType) {
		this.employeeType = employeeType;
	}

	@Column(name = "BloodGroup")
	public Integer getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(Integer bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateOfJoining", length = 23)
	public Date getDateOfJoining() {
		return this.dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HealthCheckupDate", length = 23)
	public Date getHealthCheckupDate() {
		return this.healthCheckupDate;
	}

	public void setHealthCheckupDate(Date healthCheckupDate) {
		this.healthCheckupDate = healthCheckupDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HealthCheckupDueDate", length = 23)
	public Date getHealthCheckupDueDate() {
		return this.healthCheckupDueDate;
	}

	public void setHealthCheckupDueDate(Date healthCheckupDueDate) {
		this.healthCheckupDueDate = healthCheckupDueDate;
	}

	@Column(name = "BadgeNumber")
	public Serializable getBadgeNumber() {
		return this.badgeNumber;
	}

	public void setBadgeNumber(Serializable badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BadgeExpiryDate", length = 23)
	public Date getBadgeExpiryDate() {
		return this.badgeExpiryDate;
	}

	public void setBadgeExpiryDate(Date badgeExpiryDate) {
		this.badgeExpiryDate = badgeExpiryDate;
	}

	@Column(name = "HealthProblems")
	public Serializable getHealthProblems() {
		return this.healthProblems;
	}

	public void setHealthProblems(Serializable healthProblems) {
		this.healthProblems = healthProblems;
	}

	@Column(name = "WeeklyOff")
	public Integer getWeeklyOff() {
		return this.weeklyOff;
	}

	public void setWeeklyOff(Integer weeklyOff) {
		this.weeklyOff = weeklyOff;
	}

	@Column(name = "DriverImagePath")
	public Serializable getDriverImagePath() {
		return this.driverImagePath;
	}

	public void setDriverImagePath(Serializable driverImagePath) {
		this.driverImagePath = driverImagePath;
	}

	@Column(name = "DriverDLPath")
	public Serializable getDriverDlpath() {
		return this.driverDlpath;
	}

	public void setDriverDlpath(Serializable driverDlpath) {
		this.driverDlpath = driverDlpath;
	}

	@Column(name = "DriverBNPath")
	public Serializable getDriverBnpath() {
		return this.driverBnpath;
	}

	public void setDriverBnpath(Serializable driverBnpath) {
		this.driverBnpath = driverBnpath;
	}

	@Column(name = "DriverImage")
	public byte[] getDriverImage() {
		return this.driverImage;
	}

	public void setDriverImage(byte[] driverImage) {
		this.driverImage = driverImage;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	public Set<DutyAllocation> getDutyAllocations() {
		return this.dutyAllocations;
	}

	public void setDutyAllocations(Set<DutyAllocation> dutyAllocations) {
		this.dutyAllocations = dutyAllocations;
	}

}