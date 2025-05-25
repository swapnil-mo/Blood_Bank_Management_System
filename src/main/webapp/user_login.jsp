<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="User_LoginController">
<table align="center">
<tr><td align="center"><b><h1>Login Form</b></h1></td></tr>
<tr><td>Email</td><td><input type="email" name="email"></td></tr>
<tr><td>Password</td><td><input type="password" name="pass"></td></tr>

<tr><td>Submit</td><td><input type="Submit" name="submit"></td></tr>

</table>
</form>
</body>
</html> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEJ3QF3s8kW5y5d11YfWBZzL2bZfqW2f3eI5y5n5FzF3VZa1onXsyU6b6Qz9J" crossorigin="anonymous">
    <style>
        body {
            background-color: #f0f8ff; /* Light blue background */
            font-family: 'Arial', sans-serif;
        }
        
        .login-form {
            max-width: 450px;
            margin: 100px auto;
            padding: 40px;
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
            border-left: 6px solid #2e76d2; /* Add colorful left border */
            transition: all 0.3s ease;
        }

        .login-form:hover {
            box-shadow: 0px 10px 15px rgba(0, 0, 0, 0.15); /* Hover effect */
        }

        h1 {
            font-size: 2rem;
            font-weight: bold;
            color: #2e76d2; /* Matching color with left border */
        }

        .form-label {
            color: #2e76d2;
            font-weight: 500;
        }

        .btn-primary {
            background-color: #28a745; /* Green color for the submit button */
            border: none;
        }

        .btn-primary:hover {
            background-color: #218838; /* Darker green when hovered */
            transition: background-color 0.3s ease;
        }

        .form-control:focus {
            border-color: #28a745;
            box-shadow: 0 0 5px rgba(40, 167, 69, 0.5); /* Green border on focus */
        }

        .invalid-feedback {
            color: #dc3545; /* Red color for error message */
        }

        /* Custom styles for form elements */
        .form-control {
            border-radius: 25px; /* Rounded inputs */
            padding: 10px;
        }

        /* Add some spacing between fields */
        .mb-3 {
            margin-bottom: 20px;
        }

        .text-center {
            color: #2e76d2;
        }

        .login-form .btn {
            border-radius: 25px; /* Rounded button */
            padding: 12px 25px;
        }
    </style>
</head>
<body>
    <div class="login-form">
        <h1 class="text-center mb-4">Login Form</h1>
        <form method="post" action="User_LoginController" id="loginForm" novalidate>
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
                <div class="invalid-feedback">Please enter a valid email address.</div>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="pass" placeholder="Enter your password" required>
                <div class="invalid-feedback">Password is required.</div>
            </div>
            <button type="submit" class="btn btn-primary w-100">Login</button>
        </form>
    </div>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz4fnFO9gyb3gf3tL56W9fEK3bmJg9V1n1Rujg/jr59baMm5y5JmQbb6zR" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0Z4fD4nDgoBiJYfJZpPpS2Q9zU2g/ChW1JJcE9gM79V9+Q6P" crossorigin="anonymous"></script>

    <!-- JavaScript for form validation -->
    <script>
        // Enable Bootstrap form validation on field focus-out
        (function() {
            'use strict';
            var forms = document.querySelectorAll('form');

            Array.prototype.slice.call(forms)
                .forEach(function(form) {
                    form.addEventListener('input', function(event) {
                        if (form.checkValidity()) {
                            form.classList.remove('was-validated');
                        } else {
                            form.classList.add('was-validated');
                        }
                    }, false);

                    form.addEventListener('submit', function(event) {
                        if (!form.checkValidity()) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
        })();
    </script>
</body>
</html>
