<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="User_RegisterController">
<table align="center">
<tr><td align="center"><b><h1>Registration Form</b></h1></td></tr>
<tr><td>User Name</td><td><input type="text" name="name"></td></tr>
<tr><td>User Email</td><td><input type="text" name="email"></td></tr>
<tr><td>User Password</td><td><input type="text" name="pass"></td></tr>
<tr><td>User Phone No</td><td><input type="text" name="ph"></td></tr>
<tr><td>Submit</td><td><input type="submit" name="submit"></td></tr>
<tr><td>Reset</td><td><input type="reset" name="reset"></td></tr>
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
    <title>User Registration</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS for background -->
    <style>
        body {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .form-container {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 600px;
        }
        
        .mycolor
        {
         background: linear-gradient(to right, #ff4b2b, #ff416c);
 
        }
        
    </style>
</head>
<body>

    <div class="form-container">
        <h1 class="text-center mb-4">Registration Form</h1>
        <form method="post" action="User_RegisterController" id="registrationForm">
            <div class="form-group">
                <label for="name">User Name</label>
                <input type="text" class="form-control" id="name" name="name" required>
                <div class="invalid-feedback">
                    Please enter your name.
                </div>
            </div>

            <div class="form-group">
                <label for="email">User Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <div class="invalid-feedback">
                    Please enter a valid email address.
                </div>
            </div>

            <div class="form-group">
                <label for="password">User Password</label>
                <input type="password" class="form-control" id="password" name="pass" required>
                <div class="invalid-feedback">
                    Please enter a password.
                </div>
            </div>

            <div class="form-group">
                <label for="phone">User Phone No</label>
                <input type="text" class="form-control" id="phone" name="ph" required pattern="^[0-9]{10}$">
                <div class="invalid-feedback">
                    Please enter a valid 10-digit phone number.
                </div>
            </div>

            <button type="submit" class="btn mycolor btn-block text-white">Submit</button>
            <button type="reset" class="btn btn-success btn-block"> <a class="text-decoration-none text-white d-block" href="./Home.jsp">Back</a></button>
        </form>
    </div>

    <!-- Bootstrap JS, Popper.js -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <!-- JavaScript for Form Validation -->
    <script>
        // Bootstrap form validation
        (function () {
            'use strict'

            window.addEventListener('load', function () {
                var forms = document.getElementsByClassName('needs-validation')

                var validation = Array.prototype.filter.call(forms, function (form) {
                    form.addEventListener('submit', function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault()
                            event.stopPropagation()
                        }
                        form.classList.add('was-validated')
                    }, false)
                })
            }, false)
        })()

        // Apply Bootstrap's custom validation classes
        document.getElementById("registrationForm").addEventListener("submit", function(event){
            var form = event.target;
            var inputs = form.querySelectorAll("input");

            inputs.forEach(function(input){
                if(!input.validity.valid){
                    input.classList.add('is-invalid');
                } else {
                    input.classList.remove('is-invalid');
                }
            });
        });
    </script>

</body>
</html>
