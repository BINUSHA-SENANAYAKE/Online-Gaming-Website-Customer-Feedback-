 package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

 
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 
public class Feedbackinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		PrintWriter out = response.getWriter();
		 
		response.setContentType("text/html");
		
		//to catch data from jsp form 
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String about = request.getParameter("about");
		String feedback = request.getParameter("feedback");
		String service = request.getParameter("service");
		
		boolean isTrue;
		
		//calling FeedbackDBUtil.java
		isTrue =FeedbackDBUtil.insertfeedback(uname, email, about, feedback, service);
		
		if (isTrue == true) {
 
			 List<Feedback> feedDetails = FeedbackDBUtil.getFeedback(uname);
			 request.setAttribute("feedDetails", feedDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("feedbackdetails.jsp");
			dis.forward(request, response);
			
	 	}else {
			 out.println("<script type= 'text/javascript'>");
			 out.println("alert('Your user your data coludnt insert ')");
			 out.println("location='feedback.jsp'");
			 out.println("</script>");
		}
	
	
	}

}
