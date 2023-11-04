<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="/css/admin_css/facultyRegistration.css">
  <link rel="stylesheet" href="/css/admin_css/dropdown.css">
  <link rel="stylesheet" href="/css/home.css">

  <!-- from home -->
  <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <link href='https://unpkg.com/boxicons@2.1.4/dist/boxicons.js' rel='stylesheet'>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&family=Poppins:ital,wght@1,200&display=swap" rel="stylesheet">

    <!-- flatiocns -->
    <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
  <title>Student Profile </title>
</head>

<body>
  <!-- header -->
  <div class="header">
    <a href="/index.html" class="logo">
        <img src="/images/logo3.png" width="240px" >
    </a>

    <ul class="navbar">
       <li><a href="/">Home</a></li>
      <li><a href="adminHome">Student Dashboard</a></li>
      
    </ul>
   
   
   
</div>
    <div class="header-icons">
        <a href="/login.html"><i class="fi fi-rr-sign-in-alt"></i></a>
        
        <div class="bx bx-menu" id="menu-icon"></div>

    </div>
</div>
<!-- header -->
	
	<span>
		<h3 align=center style="color:green">${message}</h3>
		</span>

  <div class="total-login">
    <!-- <div class="login-left">
      <img src="/images/login_background.png" width="550px">

    </div> -->
    <div class="login-wrapper">
    	
      <form class="form" action="#" method="" >
        <img src="/images/login_avatar.jpg" alt="">
        <h2>Student Profile</h2>
        <div class="loin-inputs">
	        <div class="input-group">
	          <input type="text" name="fullname" value="${student.fullname}" id="fullname" required="required" oninput="this.value = this.value.replace(/[^A-Za-z ]/g, '');">

	          <label for="fullname">Full Name</label>
	          <div class="validation-message"></div>
	        </div>
	        <div class="input-group">
	        <input type="text" name="gender" value="${student.gender}" id="gender" required="required" oninput="this.value = this.value.replace(/[^A-Za-z ]/g, '');">

	          <label for="gender">Gender</label>
	          
	        </div>

	        
	        <div class="input-group">
	            <input class="no-placeholder" style="width:200px;" value="${student.dateofbirth }" type="date" name="dob" id="dob" required="required">
  				<label hidden="true" id="dob-label" for="dob">Date Of Birth</label>
	        </div>
	        <div class="input-group">
	          <input type="text" value="${student.department }" oninput="this.value = this.value.replace(/[^A-Za-z ]/g, '');" name="dept" id="dept" required="required"> 
	          <label for="dept">Department</label>
	          <div class="validation-message"></div>
	        </div>
	        <div class="input-group">
	          <input type="number" value="${current_year }" name="cur_year" id="cur_year" required="required">
	          <label for="cur_year">CurrentYear</label>
	          <span class="validation-message"></span>
	        </div>
	        <div class="input-group">
	          <input type="number" value="${student.cgpa}" step="0.01" name="cgpa" id="salary" required="required" >
	          <label for="salary">Cgpa</label>
	        </div>
	        <div class="input-group">
	          <input type="email" value="${student.email }" name="email" id="email" required="required">
	          <label for="email">Email</label>
	          <span class="validation-message"></span>
	        </div>
	        <div class="input-group">
	          <input type="text" value="${student.contactno}"  name="contactno" id="contactno" required="required">
	          <label for="contactno">Contact No</label>
	          <span class="validation-message"></span>
	        </div>
	        <div class="input-group">
	          <input type="text" value="${student.username}" name="username" id="username" required="required">
	          <label for="username">Username</label>
	          <span class="validation-message"></span>
	        </div>
        </div>
        <!-- input field -->
        
	   <!--       <button type="submit" value="Login" class="submit-btn">Submit</button> -->
	        <!-- <a href="facultyForgotPassword" class="forgot-pw">Forgot Password?</a> -->
        
      </form>

      <!-- <div id="forgot-pw">
        <form action="" class="form">
          <a href="#" class="close">&times;</a>
          <h2>Reset Password</h2>
          <div class="input-group">
            <input type="email" name="email" id="email" required>
            <label for="email">Email</label>
          </div>
          <input type="submit" value="Submit" class="submit-btn">
        </form>
      </div> -->
    </div>
  </div>
  <!-- customejs link -->
  <script type="text/javascript" src="/js/admin_js/facultyRegistrationValidation.js"></script>
  <script type="text/javascript" src="/js/admin_js/lable.js"></script>
  <script type="text/javascript" src="/js/home.js"></script>
</body>

</html>