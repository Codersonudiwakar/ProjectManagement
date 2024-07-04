package com.ManagePro.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String userName;
	private String email;
	private String userProfile;
	private String userPassword;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(long userId, String userName, String email, String userProfile, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.userProfile = userProfile;
		this.userPassword = userPassword;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
