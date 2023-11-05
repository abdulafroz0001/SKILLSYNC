<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 
<!DOCTYPE html>
<html lang="en">


<head>
  <!-- from home -->
  <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
  <link href='https://unpkg.com/boxicons@2.1.4/dist/boxicons.js' rel='stylesheet'>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link
    href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&family=Poppins:ital,wght@1,200&display=swap"
    rel="stylesheet">

  <!-- flatiocns -->
  <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>
  <link rel="stylesheet" href="/css/admin_css/adminHome.css">
  <link rel="stylesheet" href="/css/admin_css/dropdown.css">
  <link rel="stylesheet" href="/css/home.css">
  <link rel="stylesheet" type="text/css" href="/css/admin_css/adminListingPage.css" />
  <title>Admin Dashboard</title>
</head>

<body>
  <!-- header -->
 <div class="header">
    <a href="/index.html" class="logo">
        <img src="/images/logo3.png" width="240px" >
    </a>

    <ul class="navbar">
       <li><a href="/">Home</a></li>
      <li><a href="adminDashboard">Admin Dashboard</a></li>
      <li><a href="facultyRegister">Add Faculty</a></li>
      <li><a href="studentRegister">Add Student</a></li>
      <li><a href="courseRegister">Add Course</a></li>
    </ul>
    
    
    <div class="dropdown">
	  <button class="dropbtn">Mappings Operations</button>
	  <div class="dropdown-content">
	  <a href="cfsRegister">Course-Faculty</a>
	  <a href="cfsStudentRegister">Course-Student</a>
   </div>
   
   
</div>
    
    <div style="padding:0.7%;background-color:#4CAF50;border-radius:10px;border:none; margin-right:2%;color:white;">
    	<a href="logout"><span style="color:white">Logout</span></a>
      

      <div class="bx bx-menu" id="menu-icon"></div>

    </div>
  </div>

  <!-- header -->

	<span>
		<h3 align=center style="color:green">${message}</h3>
	</span>

  <div class="jobs-list-container">
    <div class="course-heading">
      <img src="images/courses.png" alt="" width="70px" />

      <h2> Admin Dashboard </h2>      
    </div>


    <div class="jobs">
     
	      <div class="job">
		        <div class="job-header">
			        <img src="/images/admin_imgs/software-engineer.jpg" alt="" />
			        <h3 class="job-title">Faculty</h3>
	       		 </div>
		        <div class="details">
		          View All Faculty Details.
		        </div>
		        <div class="job-body">
			        <span class="open-position">Total : ${total_faculty } </span>
			        
		        </div>
		        <div class="job-end">
		        	<a href="viewAllFaculty" class="job-button">More details</a>
		        </div>
		        
	      </div>
	      <div class="job">
		        <div class="job-header">
			        <img src="/images/admin_imgs/software-engineer.jpg" alt="" />
			        <h3 class="job-title">Course</h3>
	       		 </div>
		        <div class="details">
		          View All Course Details.
		        </div>
		        <div class="job-body">
			        <span class="open-position">Total : ${total_courses } </span>
			        
		        </div>
		        <div class="job-end">
		        	<a href="viewAllCourses" class="job-button">More details</a>
		        </div>
		        
	      </div>
	      <div class="job">
		        <div class="job-header">
			        <img src="/images/admin_imgs/software-engineer.jpg" alt="" />
			        <h3 class="job-title">Student</h3>
	       		 </div>
		        <div class="details">
		          View All Student Details.
		        </div>
		        <div class="job-body">
			        <span class="open-position">Total : ${total_students } </span>
			        
		        </div>
		        <div class="job-end">
		        	<a href="viewAllStudents" class="job-button">More details</a>
		        </div>
		        
	      </div>
      
    </div>
  </div>



  <!-- customejs link -->
	<!-- <script type="text/javascript" src="/js/admin_js/adminMain.js"></script>  -->
  <script type="text/javascript" src="/js/home.js"></script>

</body>

</html>