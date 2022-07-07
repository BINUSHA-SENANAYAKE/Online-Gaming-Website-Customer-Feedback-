<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  


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
        <div class="response">
          <h1>Tell us your experience</h1>
		 <form>  
	<c:forEach var="feed" items="${feedDetails}">
	
	<c:set var ="id" value ="${feed.id}"/>
	<c:set var ="uname" value ="${feed.uname}"/>
	<c:set var ="email" value ="${feed.email}"/>
	<c:set var ="about" value ="${feed.about}"/>
	<c:set var ="feedback" value ="${feed.feedback}"/>
	<c:set var ="service" value ="${feed.service}"/>
	
	 
	
          <p style="color:  #ffffff" >Feedback ID  <p/>
              <input
                type="text"
                name="feedid"
				value="${feed.id}"
                readonly
              />
     
          <p style="color:  #ffffff" >User Name  <p/>
              <input
                type="text"
                name="name"
				value="${feed.uname}"
                readonly
              />
           
           <p style="color:  #ffffff" >User email  <p/>
              <input
               type="text" 
               name="email" 
               value="${feed.email}" 
               readonly 
               />
               
           
         <p style="color:  #ffffff" >Feedback about <p/>
              <input
               type="text"
               name ="about" 
			   value="${feed.about}"
			   readonly
              />
         
         <p style="color:  #ffffff" >Feedback <p/>
              <input
                type="text"
                name ="feedback"
                value="${feed.feedback}"
                readonly
              />
           
		  <p style="color:  #ffffff" >Are you happy about our service <p/>
              <input
                type="text"
                name ="service"
                value="${feed.service}" 
                readonly
              />
	 
		</c:forEach>
			</form> 
          <div class="respose-para" style="color:  #ffffff">
            <p>
              Feedback occurs when outputs of a system are routed back as inputs as part of a chain of cause-and-effect that forms a circuit or loop. The system can then be said to feed back into itself. The notion of cause-and-effect has to be handled carefully when applied to feedback systems:
            </p>
          </div>
        </div>
		
        <div class="button-container">
			<c:url value ="updatefeedback.jsp"   var="feedupdate">
			
			<c:param name ="id"			 value ="${id}"/> 
			<c:param name ="uname" 		 value ="${uname}"/> 
			<c:param name ="email" 		 value ="${email}"/> 
		    <c:param name ="about"   	 value ="${about}"/> 
			<c:param name ="feedback" 	 value ="${feedback}"/> 
			<c:param name ="service"     value ="${service}"/> 
			
			</c:url>
			
			<a href ="${feedupdate}">
            <button style="background-color: #0066ff; width: 100%">
		    Update Feedback
		    </button>
		  	</a>
        </div>
		

        <div class="button-container">
		<c:url value ="deletefeedback.jsp" var ="feeddelete">
		
			<c:param name ="id" 		value ="${id}"/> 
			<c:param name ="uname"  	value ="${uname}"/> 
			<c:param name ="email"  	value ="${email}"/> 
			<c:param name ="about"  	value ="${about}"/> 
			<c:param name ="feedback" 	value ="${feedback}"/> 
			<c:param name ="service" 	value ="${service}"/> 
			
		</c:url>
		
			<a href = "${feeddelete}">
          <button style="background-color: #ff0000; width: 100%">
           Delete Feedback
          </button>
		  </a>
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
