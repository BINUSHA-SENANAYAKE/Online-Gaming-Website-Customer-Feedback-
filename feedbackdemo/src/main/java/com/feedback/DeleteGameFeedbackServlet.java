package com.feedback;

 
import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

import jakarta.servlet.RequestDispatcher;

   
public class DeleteGameFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		String id = request.getParameter("feedid");
		
		boolean isTrue;
		
		isTrue = FeedbackGameDBUtil.deleteGameFeedback(id);
		
		if(isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("gamefeedback.jsp");
			dispatcher.forward(request, response);
		}else {
			
			List<FeedbackGame> FeedbackGame = FeedbackGameDBUtil.getFeedbackDetails(id);
			request.setAttribute("FeedbackGame", FeedbackGame);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("gamefeedback.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
	}

}