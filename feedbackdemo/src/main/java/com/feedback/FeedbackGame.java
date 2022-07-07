package com.feedback;

public class FeedbackGame extends Feedback {

	private String gname;

	public FeedbackGame(int id, String uname, String email, String about, String feedback, String service , String gname) {
		
		super(id, uname, email, about, feedback, service);
		
		this.gname =gname;
	}

	public String getGname() {
		return gname;
	}
 
}
