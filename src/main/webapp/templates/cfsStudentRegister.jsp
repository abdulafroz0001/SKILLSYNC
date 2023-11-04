<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="jakarta.tags.core" prefix="c"%> 
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="/css/admin_css/cfsRegister.css">
  <link rel="stylesheet" href="/css/home.css">

  <!-- from home -->
  <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <link href='https://unpkg.com/boxicons@2.1.4/dist/boxicons.js' rel='stylesheet'>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&family=Poppins:ital,wght@1,200&display=swap" rel="stylesheet">

    <!-- flatiocns -->
    <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
  <title>Course Student Mapping </title>
</head>
<style>
	
.option
{
	width:80%; padding:2%;outline: none;
	color:black;
}
</style>

<body>
  <!-- header -->
  <div class="header">
    <a href="/index.html" class="logo">
        <img src="/images/logo3.png" width="240px" >
    </a>

    <ul class="navbar">
        <li><a href="/">Home</a></li>
      <li><a href="adminHome">Admin Dashboard</a></li>
      <li><a href="facultyRegister">Add Faculty</a></li>
      <li><a href="studentRegister">Add Student</a></li>
      <li><a href="courseRegister">Add Course</a></li>
    </ul>
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
    	
      <form class="form" action="insertCfsStudent" method="post" >
        <img src="/images/admin_imgs/courses.png" alt="">
        <h2>Course Student Mapping</h2>
        <div class="loin-inputs">
	        <div class="input-group">
		        
		        <select style="width:80%; padding:2%;outline: none;background-color: transparent; color:white;"  id="student" name="student" required>
		              <option   value="-1">Select a Student</option>
			        <c:forEach items="${studentdata}"  var="student"> 
						 <option style=" color:black;width:80%; padding:2%;outline: none;background-color: transparent;color: black;" value="${student.id}">${student.fullname }</option>
			         
					</c:forEach> 
	
	        		</select>
	            
	        </div>
	        <div class="input-group">
		        
		        <select style="width:80%; padding:2%;outline: none;background-color: transparent; color:white;"  id="course" onchange="populateSections()" name="course" required>
		              <option   value="-1">Select a Course</option>
			        <c:forEach items="${coursedata}"  var="course"> 
						 <option style=" color:black;width:80%; padding:2%;outline: none;background-color: transparent;color: black;" value="${course.id}">${course.title }</option>
			         
					</c:forEach> 
	
	        		</select>
	            
	        </div>
	        <div class="input-group">
		        
		        <select style="width:80%; padding:2%;outline: none;background-color: transparent; color:white;"  id="section" name="section" required>
			        
	
	        		</select>
	            
	        </div>
	        
        </div>
        <!-- input field -->
        
	        <button style="margin-top:2%;" type="submit" value="Course" class="submit-btn">Submit</button>
	        <!--  <a href="#forgot-pw" class="forgot-pw">Forgot Password?</a>-->
        
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
  <script type="text/javascript" src="/js/home.js"></script>
  <script >
	  function populateSections() {
	      const courseSelect = document.getElementById("course");
	      const sectionSelect = document.getElementById("section");
	      const selectedCourse = courseSelect.value;
			
	      // Clear existing options
	      sectionSelect.innerHTML = "";
	      
	      var sections = JSON.parse('${sectiondata}');
	      var cfslist = JSON.parse('${cfsdata}');
	      
	      sectionSelect.options.add(new Option("Select Section", "-1"));
	      
	      console.log("clist");
	      console.log(cfslist);
	      console.log("slist");
	      console.log(sections);
	      // Now you can work with the "sections" in your JavaScript code
	     for (var i = 0; i < cfslist.length; i++) 
	     {
	  	   console.log(typeof(cfslist[i].course.id));
	  	   if(cfslist[i].course.id===parseInt(selectedCourse))
	  	   {
	  		   console.log("if")
	  		   console.log("particular clist");
	  		   console.log(cfslist[i]);
	  		   console.log("wanted section id");
	  		   const wantedId=cfslist[i].section.id
	  		   console.log(sections[wantedId])
	  		   for (var j = 0; j< sections.length; j++) 
	  			{
	  			   if(sections[j].id===wantedId)
	  			   {
	  				   
	  				   sectionSelect.options.add(new Option(sections[j].name, sections[j].id));
	  	            }
	  			   
	  			}
	      		
	  	   }
	     }
	
	      // Add sections based on the selected course
	  }
	
	  // Initially populate sections based on the default selected course
  		populateSections();
  </script>
</body>

</html>