package com.example.demo.datasource.mysql.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Message {

	@Expose
	@SerializedName("email")
	private String email;
	
	@Expose
	@SerializedName("message")
	private String message;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
