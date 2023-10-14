<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/home.css" type="text/css" >
    <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <link href='https://unpkg.com/boxicons@2.1.4/dist/boxicons.js' rel='stylesheet'>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500;600;700;800;900&family=Poppins:ital,wght@1,200&display=swap" rel="stylesheet">

    <!-- flatiocns -->
    <link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>

    <title>Home</title>
</head>
<body>

    <!-- start header-->
    <div class="header">
        <a href="#" class="logo">
            <img src="images/logo3.png" width="240px" >
        </a>

        <ul class="navbar">
            <li><a href="/">Home</a></li>
            <li><a href="#about">About Us</a></li>
            <li><a href="#contact">Contact</a></li>
        </ul>
        <div class="header-icons">
            <a href="loginRoutes"><i class="fi fi-rr-sign-in-alt"></i></a>
            
            <div class="bx bx-menu" id="menu-icon"></div>

        </div>
    </div>
        <!-- home section  -->
    <section class="home" id="home">
            <div class="home-text">
                <h6>Student Learning Management Platform</h6>
                <h1>Manage Your Student's Learning </h1>
                <p>Your Journey to Academic Excellence</p>
            </div>
            <div class="home-img">
                <img src="images/home.svg" width="540px">
            </div>
           
    </section>
    <!-- container section  -->
    <section class="container">
        <div class="container-box">
            <div class="conatiner-img">
                 <img src="images/assignment.png" width="60px">
            </div>
            <div class="container-text">
                <h4>Assignments</h4>
                <p>You can add course related assignments</p>
            </div>
        </div>
        <div class="container-box">
            <div class="conatiner-img">
                <img src="images/quiz.png" width="60px">
            </div>
            <div class="container-text">
                <h4>Quizzes</h4>
                <p>You can add course related assignments</p>
            </div>
        </div>
        <div class="container-box">
            <div class="conatiner-img">
                 <img src="images/materials.png" width="60px">
            </div>
            <div class="container-text">
                <h4>Study Materials</h4>
                <p>You can add course related assignments</p>
            </div>
        </div>
        <div class="container-box">
            <div class="conatiner-img">
                 <img src="images/grade.png" width="60px">
            </div>
            <div class="container-text">
                <h4>Grade</h4>
                <p>You can add course related assignments</p>
            </div>
        </div>


    </section>
        


    <!-- customejs link -->
    <script type="text/javascript" src="js/home.js"></script>
    
</body>
</html>