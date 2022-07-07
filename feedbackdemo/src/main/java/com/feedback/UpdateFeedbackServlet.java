package com.feedback;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

import jakarta.servlet.RequestDispatcher;

 
public class UpdateFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//to catch data from jsp form 
		String id = request.getParameter("feedid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String about = request.getParameter("about");
		String feedback = request.getParameter("feedback");
		String service = request.getParameter("service");
		
		boolean isTrue;
		
		//calling FeedbackDBUtil.java
		isTrue = FeedbackDBUtil.updatefeedback(id, name, email, about, feedback ,service);
		
		if(isTrue == true) {
			
			List<Feedback> feedDetails = FeedbackDBUtil.getFeedbackDetails(id);
			request.setAttribute("feedDetails",feedDetails); 
			  
			RequestDispatcher dis = request.getRequestDispatcher("feedbackdetails.jsp");
			dis.forward(request, response);
			
		}else {
			
			List<Feedback> feedDetails = FeedbackDBUtil.getFeedbackDetails(id);
			request.setAttribute("feedDetails",feedDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("feedbackdetails.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
