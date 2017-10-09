package com.example.demo.datasource.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token_table")
public class TokenBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "token", nullable = false)
	private String token;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "device", nullable = false)
	private String device;
	
	@Column(name = "deviceId", nullable = false)
	private String deviceId;
	
	public long getId() {
		return id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
	
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	@Override
	public String toString() {
		return "{"
				+ "\"token\" :" + "\"" + token + "\","
				+ "}" ;
	}
}
