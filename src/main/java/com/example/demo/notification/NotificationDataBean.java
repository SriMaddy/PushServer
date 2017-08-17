package com.example.demo.notification;

import com.google.gson.annotations.SerializedName;

public class NotificationDataBean {
	
	@SerializedName("to")
	private String token;
	
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
