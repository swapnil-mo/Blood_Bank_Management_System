<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Donation Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: url('https://static.vecteezy.com/system/resources/previews/007/849/061/large_2x/world-blood-donor-background-free-vector.jpg?t=st=1741601968~exp=1741605568~hmac=4e55ff9f520e80b130bdac208598a3932413e7bb485c712c89d6c28c4efdb4f2&w=2000') no-repeat center center/cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            max-width: 400px;
            background: rgba(255, 255, 255, 0.95);
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
            text-align: center;
        }
        .heart-icon {
            font-size: 60px;
            color: #d32f2f;
            margin-bottom: 10px;
        }
        .btn-danger {
            width: 100%;
            font-size: 18px;
            padding: 10px;
        }
        .form-control {
            background: #f8d7da;
            border: 1px solid #d32f2f;
            padding: 12px;
            font-size: 16px;
        }
        .form-control:focus {
            box-shadow: 0px 0px 5px #d32f2f;
            border-color: #d32f2f;
        }
        a {
            color: #d32f2f;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="heart-icon">❤</div>
        <h3 class="mt-2">Login</h3>
        <form action="User_LoginController" method="post">
            <div class="mb-3">
                <input type="email" class="form-control" name="email" placeholder="Enter your Email" required>
            </div>
            <div class="mb-3">
                <input type="password" class="form-control" name="pass" placeholder="Enter your Password" required>
            </div>
            <a href="#" class="d-block text-end mb-2">Forgot Password?</a>
            <button type="submit" class="btn btn-danger">Sign In Now</button>
        </form>
        <p class="mt-3">Don't have an account? <a href="user_Register.jsp">Sign up</a></p>
    </div>
</body>
</html>