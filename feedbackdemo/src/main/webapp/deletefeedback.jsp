<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Homepage</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
      integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
      crossorigin="anonymous"
      referrerpolicy="no-referrer"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Nunito&family=Ubuntu&display=swap"
      rel="stylesheet"
    />
  <link rel="stylesheet" href="./styles/feedback.css" />
  </head>
  <body>
    <div class="nav-bar-area">
      <nav>
        <div>
          <h1>LOGO</h1>
        </div>

        <div>
          <ul>
            <li>Store</li>
            <li>FAQ</li>
            <li>News</li>
            <li>Pricing</li>
          </ul>
        </div>

        <div class="nav-account">
          <i class="fas fa-user-tie"></i>
          <p>Your account</p>
        </div>
      </nav>
    </div>
    <div class="page-container">
      <div>
        <h1>Delete this feedback</h1>
        <div class="form-container">
		<%
	
	String id  = request.getParameter("id");
	String uname = request.getParameter("uname");
	String email = request.getParameter("email");
	String about = request.getParameter("about");
	String feedback = request.getParameter("feedback");
	String service = request.getParameter("service");
	
	%>
		
          <form action="delete" method="post">
            <div class="input">
			<p style="color:  #ffffff" >Feedback ID  <p/>
              <input
                type="text"
                name="feedid"
				value="<%= id %>"
                readonly
              />
            </div>
			
			<div class="input">
			<p style="color:  #ffffff" >User Name  <p/>
			
              <input
                type="text"
                name="name"
				value="<%= uname %>"
                readonly
              />
            </div>
			
	
            <div class="input">
            <p style="color:  #ffffff" >User email  <p/>
			
              <input type="text" name="email" value="<%= email %>" readonly />
            </div>

            <div class="input">
            <p style="color:  #ffffff" >Feedback about <p/>
			
              <input
               type="text"
               name ="about" 
			   value="<%= about %>"
			   readonly
              />
            </div>

			<div class="input">
			<p style="color:  #ffffff" >Feedback <p/>
			
              <input
                type="text"
                name ="feedback"
                value="<%= feedback %>"
                readonly
              />
            </div>
             

            <div class="input">
            <p style="color:  #ffffff" >Are you happy about our service <p/>
			
              <input
                type="text"
                name ="service"
                value="<%= service %>" 
                readonly
              />
            </div>

            <div class="button-container">
              <button style="background-color: #ff0000; width: 100%" name="submit" >
                Delete Feedback
              </button>
            </div>
          </form>
        </div>
      </div>

      <div class="reach-us-container">
        <h2><span class="or"> OR </span> Reach us out!</h2>

        <p>
          Lorem Ipsum is simply dummy text of the printing and typesetting
          industry. Lorem Ipsum has been the industry's standard dummy text ever
          since the 1500s
        </p>

        <div>
          <p class="post">
            <i class="fas fa-envelope-open-text fa-2x"></i>456, Surrey, United
            Kingdom
          </p>
        </div>
      </div>
    </div>
    <div class="footer-area">
      <footer class="footer">
        <div class="icons">
          <a href="#"><i class="fab fa-facebook"></i></a>
          <a href="#"><i class="fab fa-linkedin"></i></a>
          <a href="#"><i class="fab fa-instagram"></i></a>
          <a href="#"><i class="fab fa-twitter"></i></a>
          <p class="company-name">Gamestore &copy; 2021, ALL Rights Reserved</p>
        </div>
      </footer>
    </div>
  </body>
</html>
