<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Fix for Navbar Overlapping Slider -->
<div style="margin-top: 80px;"></div>

<!-- Bootstrap Image Slider (Auto Sliding & Controls) -->
<div id="carouselExample" class="carousel slide" data-bs-ride="carousel" data-bs-interval="2000">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="https://img.freepik.com/free-vector/cartoon-blood-donation-background_52683-70799.jpg?q=80&w=1200" class="d-block w-100 " alt="Blood Donation">
        </div>
        <div class="carousel-item">
            <img src="./Images/blooddonor.jpg" class="d-block w-100" alt="not found">
        </div>
        <div class="carousel-item">
            <img src="https://boringbug.com/wp-content/uploads/2018/05/mblood-870x426.jpg?w=870?q=80&w=1200" class="d-block w-100" alt="Blood Camp">
        </div>
        <div class="carousel-item">
            <img src="https://png.pngtree.com/thumb_back/fh260/background/20190221/ourmid/pngtree-public-welfare-blood-donation-volunteer-rescue-image_11578.jpg?q=10&w=1200" class="d-block w-100" alt="Be a Donor">
        </div>
    </div>

    <!-- Carousel Controls -->
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>
</body>
</html>