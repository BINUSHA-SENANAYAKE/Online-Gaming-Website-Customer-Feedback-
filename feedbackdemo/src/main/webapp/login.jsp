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
    <link rel="stylesheet" href="styles/login.css" />
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
      <div class="form-container">
        <form action="log" method="post">
          <h1>Login to your account</h1>
          <div class="input">
            <input type="text" placeholder="Enter your username" name="username" />
          </div>

          <div class="input">
            <input
              type="password"
              name="password"
              placeholder="Enter your password"
            />
          </div>

          <button>Login</button>

          <p class="new-user-sentence"> <a href="./register.jsp">
            New User? Click here to signup</p>
          </a>
        </form>
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