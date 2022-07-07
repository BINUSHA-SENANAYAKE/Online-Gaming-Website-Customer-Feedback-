package com.feedback;

public class Feedback {
	
	private int id;
	private String uname;
	private String email;
	private String about;
	private String feedback;
	private String service;
	
	public Feedback(int id, String uname, String email, String about, String feedback, String service) {
		 
		this.id = id;
		this.uname = uname;
		this.email = email;
		this.about = about;
		this.feedback = feedback;
		this.service = service;
	}

	public int getId() {
		return id;
	}

	public String getUname() {
		return uname;
	}

	public String getEmail() {
		return email;
	}

	public String getAbout() {
		return about;
	}

	public String getFeedback() {
		return feedback;
	}

	public String getService() {
		return service;
	}

}
