<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- About Us Section -->
<section class="py-5 about-section">
    <div class="container">
        <div class="row align-items-center">
            <!-- Left Side: Image -->
            <div class="col-md-6">
                <div class="image-container">
                    <img src="https://t3.ftcdn.net/jpg/02/68/84/02/360_F_268840289_Pdto4wxi92Mrn0fp0yaV1e310kovsP17.jpg?q=80&w=1200" 
                         alt="About Us" 
                         class="img-fluid rounded shadow-lg image-hover"
                         onclick="openImageModal(this.src)">
                </div>
            </div>

            <!-- Right Side: Text Content -->
            <div class="col-md-6 fade-in-right">
                <h2 class="text-danger mb-3 fw-bold display-4 text-hover">About Us</h2>
                <p class="text-muted fs-4">
                    We are committed to saving lives by ensuring a safe and sufficient blood supply. 
                    Our mission is to connect donors with those in need, spreading hope and compassion through voluntary blood donations.
                </p>

                <div class="row mt-4">
                    <div class="col-md-6">
                        <div class="d-flex align-items-center hover-effect">
                            <img src="https://cdn-icons-png.flaticon.com/512/1828/1828640.png" alt="Trust" width="55" class="me-3 icon-effect">
                            <p class="mb-0 fw-bold text-dark fs-4 text-hover">Trusted by Thousands</p>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="d-flex align-items-center hover-effect">
                            <img src="https://cdn-icons-png.flaticon.com/512/3448/3448542.png" alt="Donors" width="55" class="me-3 icon-effect">
                            <p class="mb-0 fw-bold text-dark fs-4 text-hover ml-2">Millions of Lives Impacted</p>
                        </div>
                    </div>
                </div>

                <a href="#contact" class="btn btn-danger mt-4 px-5 py-3 btn-hover">Contact Us</a>
            </div>
        </div>
    </div>
</section>

<!-- Image Modal -->
<div id="imageModal" class="modal">
    <span class="close" onclick="closeImageModal()">&times;</span>
    <img class="modal-content" id="modalImg">
</div>
</body>
</html>