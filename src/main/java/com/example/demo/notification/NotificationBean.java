package com.example.demo.notification;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notification_table")
public class NotificationBean {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	/*@Column(name = "token", nullable = true)
	private String token;*/
	
	@Column(name = "title", nullable = false)
	private String title;
	
	@Column(name = "message", nullable = false)
	private String message;
	
	@Column(name = "timestamp", nullable = false)
	private long timestamp;
	
	public long getId() {
		return id;
	}

	/*public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}*/

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "{"
//				+ "\"to\" :" + "\"" + token + "\","
				+ "\"notification\" :"  + "{" 
								+ "\"title\" :" + "\"" + title + "\","
								+ "\"message\" :" + "\"" + message + "\","
								+ "\"timestamp\" :" + "\"" + timestamp + "\""
								+ "}"
				+ "}" ;
	}
}
