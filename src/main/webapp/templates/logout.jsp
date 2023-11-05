<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Your Page Title</title>
    <!-- Add the JavaScript code here -->
    <script>
        window.history.pushState(null, null, document.URL);
        window.addEventListener('popstate', function () {
            window.history.pushState(null, null, document.URL);
        });

        // Redirect the user to the login page
        window.location.href = '/admin/adminLogin'; // Adjust the URL as needed
    </script>
</head>
<body>
    <!-- Your HTML content goes here -->
</body>
</html>
