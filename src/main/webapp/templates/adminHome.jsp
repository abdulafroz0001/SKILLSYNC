<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
  <link rel="stylesheet" href="/css/home.css">
  <link rel="stylesheet" type="text/css" href="/css/admin_css/adminListingPage.css" />
  <title>Admin Home</title>
</head>

<body>
  <!-- header -->

  <div class="header">
    <a href="/" class="logo">
      <img src="/images/logo3.png" width="240px">
    </a>

    <ul class="navbar">
      <li><a href="adminHome">Admin Dashboard</a></li>
      <li><a href="facultyRegister">Add Faculty</a></li>
      <li><a href="studentRegister">Add Student</a></li>
      <li><a href="studentRegister">Add Course</a></li>
    </ul>
    <div class="header-icons">
      <a href="/login.html"><img src="/images/admin_imgs/admin_profile.png" width="65px"></a>

      <div class="bx bx-menu" id="menu-icon"></div>

    </div>
  </div>

  <!-- header -->



  <div class="jobs-list-container">
    <div class="course-heading">
      <img src="images/courses.png" alt="" width="70px" />

      <h2>6 Courses </h2>      
    </div>


    <div class="jobs">
      <div class="job">
        <img src="images/software-engineer.jpg" alt="" />
        <h3 class="job-title">Naa peru Bharat</h3>
        <div class="details">
          Responsible for knowing everyone about all services.
        </div>
        <a href="/admin/coursePage.html" class="details-btn">Edit</a>
        <span class="open-position">21CS6969</span>
      </div>

      <div class="job">
        <img src="images/software-engineer.jpg" alt="" />
        <h3 class="job-title">Naa peru Bharat</h3>
        <div class="details">
          Responsible for knowing everyone about all services.
        </div>
        <a href="/admin/coursePage.html" class="details-btn">More details</a>
        <span class="open-position">4 open positions</span>
      </div>

      <div class="job">
        <img src="images/software-engineer.jpg" alt="" />
        <h3 class="job-title">Naa peru Bharat</h3>
        <div class="details">
          Responsible for knowing everyone about all services.
        </div>
        <a href="/admin/coursePage.html" class="details-btn">More details</a>
        <span class="open-position">4 open positions</span>
      </div>

      <div class="job">
        <img src="images/software-engineer.jpg" alt="" />
        <h3 class="job-title">Naa peru Bharat</h3>
        <div class="details">
          Responsible for knowing everyone about all services.
        </div>
        <a href="/admin/coursePage.html" class="details-btn">More details</a>
        <span class="open-position">4 open positions</span>
      </div>

      <div class="job">
        <img src="images/software-engineer.jpg" alt="" />
        <h3 class="job-title">Naa peru Bharat</h3>
        <div class="details">
          Responsible for knowing everyone about all services.
        </div>
        <a href="/admin/coursePage.html" class="details-btn">More details</a>
        <span class="open-position">4 open positions</span>
      </div>

      <div class="job">
        <img src="images/software-engineer.jpg" alt="" />
        <h3 class="job-title">Naa peru Bharat</h3>
        <div class="details">
          Responsible for knowing everyone about all services.
        </div>
        <a href="/admin/coursePage.html" class="details-btn">More details</a>
        <span class="open-position">4 open positions</span>
      </div>
    </div>
  </div>



  <!-- customejs link -->
  <script type="text/javascript" src="/js/admin_js/adminMain.js"></script>
  <script type="text/javascript" src="/js/home.js"></script>
</body>

</html>