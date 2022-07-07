package com.feedback;

public class User {
	
	private int id;
	private String name;
	private String ermail;
	private String phone;
	private String username;
	private String password;
	
	public User(int id, String name, String ermail, String phone, String username, String password) {
	 
		this.id = id;
		this.name = name;
		this.ermail = ermail;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getErmail() {
		return ermail;
	}

	public String getPhone() {
		return phone;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
}
