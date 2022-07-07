package com.feedback;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

import jakarta.servlet.RequestDispatcher;

 
public class UpdateGameFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	
		String id = request.getParameter("feedid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String about = request.getParameter("about");
		String feedback = request.getParameter("feedback");
		String service = request.getParameter("service");
		String gname = request.getParameter("ganame");
		
		boolean isTrue;
		
		isTrue = FeedbackGameDBUtil.updateGamefeedback(id, name, email, about, feedback ,service,gname);
		
		if(isTrue == true) {
			
			List<FeedbackGame> FeedbackGame = FeedbackGameDBUtil.getFeedbackDetails(id);
			request.setAttribute("FeedbackGame",FeedbackGame); 
			  
			RequestDispatcher dis = request.getRequestDispatcher("gamefeedbackdetails.jsp");
			dis.forward(request, response);
			
		}else {
			
			List<FeedbackGame> gamefeedDetails = FeedbackGameDBUtil.getFeedbackDetails(id);
			request.setAttribute("gamefeedDetails",gamefeedDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("gamefeedbackdetails.jsp");
			dis.forward(request, response);
		}
		
		
	}

}

