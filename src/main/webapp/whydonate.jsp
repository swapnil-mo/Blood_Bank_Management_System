<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Why Donate Blood Section -->
<section class="py-5 bg-light text-center">
    <div class="container">
        <h2 class="mb-4 text-danger">Why Donate Blood?</h2>
        <p class="lead text-muted">Your blood donation can save lives and bring hope to those in need. Here’s why you should donate:</p>

        <div class="row mt-4">
            <!-- Saves Lives -->
            <div class="col-md-4">
                <div class="card border-0 shadow-lg p-3">
                    <img src="https://cdn-icons-png.flaticon.com/512/3179/3179068.png" alt="Saves Lives" class="mx-auto" width="80">
                    <h4 class="mt-3">Saves Lives</h4>
                    <p class="text-muted">Every donation can save up to three lives. Your contribution makes a real difference.</p>
                </div>
            </div>

            <!-- Health Benefits -->
            <div class="col-md-4">
                <div class="card border-0 shadow-lg p-3">
                    <img src="https://cdn-icons-png.flaticon.com/512/4353/4353529.png" alt="Health Benefits" class="mx-auto" width="80">
                    <h4 class="mt-3">Health Benefits</h4>
                    <p class="text-muted">Regular donation helps improve heart health and reduces the risk of diseases.</p>
                </div>
            </div>

            <!-- Community Impact -->
            <div class="col-md-4">
                <div class="card border-0 shadow-lg p-3">
                    <img src="https://static.vecteezy.com/system/resources/previews/019/608/291/non_2x/leadership-community-social-and-company-logo-icon-vector.jpg" alt="Community Impact" class="mx-auto" width="80">
                    <h4 class="mt-3">Community Impact</h4>
                    <p class="text-muted">Join the movement and become a hero in your community by donating blood.</p>
                </div>
            </div>
        </div>

		<form action="./DonorController" method="get">
       
        <button type="submit" class="btn btn-danger mt-4 px-4 py-2">Donate Now</button>
        </form>
    </div>
</section>
</body>
</html>