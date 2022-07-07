package com.feedback;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

import jakarta.servlet.RequestDispatcher;

   
public class DeleteFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		String id = request.getParameter("feedid");
		
		boolean isTrue;
		
		//calling FeedbackDBUtil.java
		isTrue = FeedbackDBUtil.deleteFeedback(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("feedback.jsp"); 
			dispatcher.forward(request, response);
		}else {
			
			List<Feedback> feedDetails = FeedbackDBUtil.getFeedbackDetails(id);
			request.setAttribute("feedDetails", feedDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("feedback.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
	}

}
