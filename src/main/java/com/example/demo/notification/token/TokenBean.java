package com.example.demo.notification.token;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token_table")
public class TokenBean {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;

	@Column(name = "token", nullable = false)
	private String token;
	
	public long getId() {
		return id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return "{"
				+ "\"token\" :" + "\"" + token + "\","
				+ "}" ;
	}
}
