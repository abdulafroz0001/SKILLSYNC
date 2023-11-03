<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
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
 
  <link rel="stylesheet" href="/css/home.css">
  <link rel="stylesheet" type="text/css" href="/css/faculty_css/facultyHome.css" />
  <link rel="stylesheet" type="text/css" href="/css/faculty_css/facultyCourseList.css" />
  <title>Faculty Home</title>
</head>

<body>
  <!-- header -->

  <div class="header">
    <a href="/" class="logo">
      <img src="/images/logo3.png" width="240px">
    </a>

    <ul class="navbar">
      <li><a href="/">Home</a></li>
      <li><a href="facultyHome">Faculty Dashboard</a></li>
      <!-- <li><a href="/admin/coursePage.htmlabout">About Us</a></li>
      <li><a href="/admin/coursePage.htmlcontact">Contact</a></li> -->
    </ul>
    <div class="header-icons">
      <a href="facultyLogin.html"><img src="/images/faculty_imgs/faculty_profile.png" width="65px"></a>

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

      <h2>${total_courses} Courses </h2>      
    </div>


    <div class="jobs">
    <c:forEach items="${course_list}"  var="course"> 
	      <div class="job">
		        <div class="job-header">
			        <img src="/images/admin_imgs/software-engineer.jpg" alt="" />
			        <h3 class="job-title">${course.title }</h3>
	       		 </div>
		        <div class="details">
		          ${course.description }
		        </div>
		        <div class="job-body">
			        <span class="open-position">Code : ${course.course_code}</span>
			        <span class="open-position">Credits : ${course.credits}</span>
			        <span class="open-position">Dept : ${course.department}</span>
		        </div>
		        <div class="job-end">
		        	<a href="/admin/coursePage.html" class="job-button">More details</a>
		        </div>
		        
	      </div>
      </c:forEach> 
    </div>
  </div>



  <!-- customejs link -->

  <script type="text/javascript" src="/js/home.js"></script>
</body>

</html>