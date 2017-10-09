package com.example.demo.datasource.mysql.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;

@Entity
@Table(name = "notification_table")
public class NotificationBean {

//	@Expose
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Expose
	@Column(name = "title", nullable = false)
	private String title;
	
	@Expose
	@Column(name = "message", nullable = false)
	private String message;
	
//	@Expose
	@Column(name = "timestamp", nullable = false)
	private long timestamp;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

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
				+ "\"notification\" :"  + "{"
								+ "\"id\" :" + "\"" + id + "\","
								+ "\"title\" :" + "\"" + title + "\","
								+ "\"message\" :" + "\"" + message + "\","
								+ "\"timestamp\" :" + "\"" + timestamp + "\""
								+ "}"
				+ "}" ;
	}
}
