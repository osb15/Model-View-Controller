package com.maven.MVC.Entity;

public class User {

	private String Name;
	private String email;

	public User() {
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String name, String email) {
		super();
		Name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [Name=" + Name + ", email=" + email + "]";
	}
}
