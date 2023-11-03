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
    <link rel="stylesheet" href="/css/loginRoutes.css">
    <link rel="stylesheet" href="/css/home.css">
    <title>Logins</title>
</head>

<body>
    <!-- header -->

    <div class="header">
        <a href="/index.html" class="logo">
            <img src="images/logo3.png" width="240px">
        </a>

        <ul class="navbar">
            <li><a href="/">Home</a></li>
            <li><a href="#about">About Us</a></li>
            <li><a href="#contact">Contact</a></li>
        </ul>
        <div class="header-icons">
            <a href="/login.html"><i class="fi fi-rr-sign-in-alt"></i></a>

            <div class="bx bx-menu" id="menu-icon"></div>

        </div>
    </div>
    
    
    <!-- header -->

    <div class="row">
       

        <div class="box">
            <img src="images/admin.png" width="70px">
            <h3>Admin</h3>
            <p>Admin can add courses, assign faculty to their respective courses.
                Admin has full access to all the components of the project.
                Can view course progress, and check whether faculty are actively uploading course-related material or not. 
                Whether students are submitting assignments before the deadline or not.<br>
            </p>
            <a href="admin/adminLogin"><button class="btn">Login</button></a>
        </div>
        <div class="box">
            <img src="images/faculty.png">
            <h3>Faculty</h3>
            <p>Can view their respective courses.
                Can add presentations, documents, videos, and web links related to the course (only faculty with certain permissions).
                Can add assignments, and quizzes with due dates.
                Can grade the assignments submitted by their respective students.<br>
            </p>
            <a href="faculty/facultyLogin"><button class="btn">Login</button></a>
        </div>
        <div class="box">
            <img src="images/students.png">
            <h3>Student</h3>
            <p>Can view their respective registered courses.
                Can view presentations, documents, videos, and weblinks uploaded by respective faculty.
                Can access and submit assignments, quizzes, and other grading components added by respective faculty.
                <br>
            </p>
            <a href="student/studentLogin"><button class="btn">Login</button></a>
        </div>




    </div>

    <!-- customejs link -->
    <script type="text/javascript" src="js/home.js"></script>
</body>

</html>