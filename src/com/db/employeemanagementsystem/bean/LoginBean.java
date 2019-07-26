package com.db.employeemanagementsystem.bean;

public class LoginBean {
	
	private String username;
	private String password;
	
	
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + "]";
	}
	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
