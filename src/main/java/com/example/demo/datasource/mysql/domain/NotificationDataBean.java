package com.example.demo.datasource.mysql.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotificationDataBean {
	
	@Expose
	@SerializedName("to")
	private String token;
	
	@Expose
	@SerializedName("data")
	private NotificationBean bean;
	
	public String getTo() {
		return token;
	}

	public NotificationBean getNotificationBean() {
		return bean;
	}

	public void setNotificationBean(NotificationBean bean) {
		this.bean = bean;
	}

	public void setTo(String to) {
		this.token = to;
	}

}
