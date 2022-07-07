package com.feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

	public class FeedbackGameInsert extends HttpServlet {
		private static final long serialVersionUID = 1L;
	 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 
			PrintWriter out = response.getWriter();
			 
			response.setContentType("text/html");
			
			
			String uname = request.getParameter("uname");
			String email = request.getParameter("email");
			String about = request.getParameter("about");
			String feedback = request.getParameter("feedback");
			String service = request.getParameter("service");
			String gname = request.getParameter("gname");
			
			boolean isTrue;
	
			
			isTrue =FeedbackGameDBUtil.insertgamefeedback(uname, email, about, feedback, service, gname );
			
			if (isTrue == true) {
	 
				 List<FeedbackGame> FeedbackGame = FeedbackGameDBUtil.getFeedback(uname);
				 request.setAttribute("FeedbackGame", FeedbackGame);
				
				RequestDispatcher dis = request.getRequestDispatcher("gamefeedbackdetails.jsp");
				dis.forward(request, response);
				
		 	}else {
				 out.println("<script type= 'text/javascript'>");
				 out.println("alert('Your user name or password is incorrect')");
				 out.println("location='feedback.jsp'");
				 out.println("</script>");
			}
		
		
		}

	}

