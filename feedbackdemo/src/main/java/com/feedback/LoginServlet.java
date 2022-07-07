package com.feedback;

 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		 response.setContentType("text/html");
		
		 String userName = request.getParameter("username");
		 String password = request.getParameter("password");
		 boolean isTrue;
		 
		 isTrue = CustomerDBUtil.validate(userName, password);
		 
		 if(isTrue ==  true) {
			 
			 List<User> cusDetails = CustomerDBUtil.getUser(userName);
			 request.setAttribute("cusDetails", cusDetails);
			 
			 RequestDispatcher dis = (RequestDispatcher) request.getRequestDispatcher("index.jsp");
			 dis.forward(request, response);
			 
		 }else {
			 out.println("<script type ='text/javascript'>");
			 out.println("alert('Your user name or password is Incorrect');");
			 out.println("location ='login.jsp'");
			 out.println("</script>");
		 }
		 		 
	}
		
		
	}


