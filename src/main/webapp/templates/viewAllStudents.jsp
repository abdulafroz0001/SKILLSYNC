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
  <link rel="stylesheet" href="/css/admin_css/viewAllStudent.css">
  <link rel="stylesheet" href="/css/admin_css/dropdown.css">
  <link rel="stylesheet" href="/css/home.css">
  <link rel="stylesheet" type="text/css" href="/css/admin_css/adminListingPage.css" />
  <title>View All Student</title>
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
    
    <div class="header-icons">
      <a href="/login.html"><img src="/images/admin_imgs/admin_profile.png" width="65px"></a>

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

      <h2>${total_students} Students </h2> 
      <span><input style="padding:2%;margin-left:-10%; border-radius:5px;border-style: solid; border-color: green;" type="text" id="searchInput" placeholder="Search by name">     
      </span>     
    </div>


    <div class="jobs">
    <c:forEach items="${student_list}"  var="student"> 
	      <div class="job">
		        <div class="job-header">
			        <img src="/images/admin_imgs/software-engineer.jpg" alt="" />
			        <h3 class="job-title">${student.fullname }</h3>
	       		 </div>
		        <div class="details">
		          Department : ${student.department }
		        </div>
		        <div class="details">
		          Email : ${student.email }
		        </div>
		        <div class="job-body">
			        <span class="open-position">Gender : ${student.gender}</span>
			       
			        <span class="open-position">Contact : ${student.contactno}</span>
			        <span class="open-position">Cgpa : ${student.cgpa}</span>
		        </div>
		        <div class="job-end">
		        	<a href="/admin/coursePage.html" class="job-button">More details</a>
		        </div>
		        
	      </div>
      </c:forEach> 
    </div>
  </div>



  <!-- customejs link -->
	<!-- <script type="text/javascript" src="/js/admin_js/adminMain.js"></script>  -->
  <script type="text/javascript" src="/js/home.js"></script>
  <script>
  
	  document.addEventListener('DOMContentLoaded', function() {
	      const searchInput = document.getElementById('searchInput');
	      const studentItems = document.querySelectorAll('.job');
	
	      searchInput.addEventListener('input', function() {
	          const searchText = searchInput.value.toLowerCase();
	
	          studentItems.forEach(function(student) {
	              const studentName = student.querySelector('.job-title').textContent.toLowerCase();
	
	              if (studentName.includes(searchText)) {
	                  student.style.display = 'block'; // Show matching students
	              } else {
	                  student.style.display = 'none'; // Hide non-matching students
	              }
	          });
	      });
  		});
  </script>
	
</body>

</html>