
<%@page import="Model.DonorModel"%>
<%@page import="Model.RequestModel"%>
<%@page import="Model.User_RegisterModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<%

HttpSession session1=request.getSession();
User_RegisterModel user=(User_RegisterModel)session1.getAttribute("currentuser");
/* DonorModel donor=(DonorModel)session1.getAttribute("donate"); */
//DonorModel donor=(DonorModel)session1.getAttribute("currentdonor");

//out.println("id="+donor.getDonor_id());
//System.out.println("ok"); 

%>

<style>
.image
{
height:300px;
width:200px
}
.card {
            transition: all 0.3s ease-in-out;
        }

        .card:hover {
            transform: scale(1.05);
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.4);
        }
        
 
    .navbar-custom {
        background: linear-gradient(to right, #ff4b2b, #ff416c);
    }
    .navbar-nav {
        margin: auto;
        display: flex;
        justify-content: center;
        width: 100%;
    }
    .nav-item {
        padding: 0 15px;
    }
    .nav-link {
        color: white !important;
        font-weight: bold;
        font-size: 18px;
    }
    .nav-link:hover {
        color: #ffd700 !important;
    }
    .carousel-item img {
        height: 500px; /* Slider Image Height */
        object-fit: cover;
    }
    
    
    
    <!-- Add this to your CSS to style badges -->

.badge-box {
    background: #fff;
    transition: 0.3s;
}
.badge-box:hover {
    background: #f8d7da;
    transform: scale(1.05);
}

    <!-- Custom CSS for Effects -->

    .navbar-custom {
       background: linear-gradient(90deg, #ff4b5c, #ff2e63);
        padding: 15px 0;
    }
    .navbar-nav .nav-link {
        color: white !important;
        transition: 0.3s ease-in-out;
    }
    .navbar-nav .nav-link:hover {
        color: #ffd700 !important;
        transform: scale(1.1);
    }
    .register-btn {
        transition: 0.3s ease-in-out;
    }
    .register-btn:hover {
        background: #ff0055;
        transform: scale(1.05);
    }
    
    
    
<!-- Custom CSS for More Attractive Look -->

    .bg-danger {
        background: #d32f2f !important; /* Darker Red */
        color: white;
    }
    .badge-box {
        transition: 0.3s ease-in-out;
    }
    .badge-box:hover {
        transform: translateY(-5px);
        background: #ffebee;
    }
    .badge-box i {
        transition: 0.3s ease-in-out;
    }
    .badge-box:hover i {
        transform: scale(1.1);
    }


<!-- Custom CSS -->

    .navbar-custom {
        background-color: #d32f2f !important; /* Darker Red */
    }
    .navbar .nav-link {
        transition: color 0.3s ease-in-out;
    }
    .navbar .nav-link:hover {
        color: #ffd700 !important; /* Golden Yellow */
    }
    .carousel-inner img {
        height: 500px; /* Adjust height as per design */
        object-fit: cover;
    }
    
    
  <!-- Custom CSS -->

    /* Section Styling */
    .about-section {
        background: #f8f9fa;
    }

    /* Image Hover Effect */
    .image-hover {
        transition: transform 0.4s ease-in-out, box-shadow 0.4s ease-in-out;
        cursor: pointer;
    }

    .image-hover:hover {
        transform: scale(1.1);
        box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.3);
    }

    /* Text Hover Effect */
    .text-hover {
        transition: color 0.3s ease-in-out;
    }

    .text-hover:hover {
        color: #b30000;
    }

    /* Icon Hover Effect */
    .icon-effect {
        transition: transform 0.3s ease-in-out;
    }

    .icon-effect:hover {
        transform: rotate(10deg) scale(1.1);
    }

    /* Button Hover Effect */
    .btn-hover {
        font-size: 1.2rem;
        transition: all 0.3s ease-in-out;
        border-radius: 8px;
        box-shadow: 0px 4px 10px rgba(255, 0, 0, 0.3);
    }

    .btn-hover:hover {
        background: darkred;
        transform: translateY(-3px);
        box-shadow: 0px 8px 15px rgba(255, 0, 0, 0.5);
    }

    /* Fade-in Animation */
    .fade-in-left {
        opacity: 0;
        transform: translateX(-50px);
        animation: fadeInLeft 1s ease-in-out forwards;
    }

    .fade-in-right {
        opacity: 0;
        transform: translateX(50px);
        animation: fadeInRight 1s ease-in-out forwards;
    }

    @keyframes fadeInLeft {
        0% { opacity: 0; transform: translateX(-50px); }
        100% { opacity: 1; transform: translateX(0); }
    }

    @keyframes fadeInRight {
        0% { opacity: 0; transform: translateX(50px); }
        100% { opacity: 1; transform: translateX(0); }
    }

    /* Hover Effect on Features */
    .hover-effect {
        transition: transform 0.3s ease-in-out, box-shadow 0.3s ease-in-out;
        padding: 10px;
        border-radius: 10px;
    }

    .hover-effect:hover {
        transform: scale(1.05);
        box-shadow: 0px 5px 15px rgba(0, 0, 0, 0.1);
    }

    /* Modal Styling */
    .modal {
        display: none;
        position: fixed;
        z-index: 1000;
        left: 0;
        top: 0;
        width: 100%;
        height: 100%;
        overflow: auto;
        background-color: rgba(0,0,0,0.7);
    }

    .modal-content {
        display: block;
        margin: 5% auto;
        max-width: 90%;
        border-radius: 10px;
        box-shadow: 0px 10px 30px rgba(0, 0, 0, 0.3);
        animation: zoomIn 0.5s ease-in-out;
    }

    .close {
        position: absolute;
        top: 20px;
        right: 35px;
        color: white;
        font-size: 40px;
        font-weight: bold;
        transition: 0.3s;
        cursor: pointer;
    }

    .close:hover {
        color: #ff0000;
    }

    @keyframes zoomIn {
        from { transform: scale(0.5); opacity: 0; }
        to { transform: scale(1); opacity: 1; }
    }

  
    
       
    
</style>


<!-- ****************************************** new navbar ********************************* -->

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-custom shadow-lg fixed-top bg-danger">
    <div class="container">
        <a class="navbar-brand text-white fw-bold fs-3" href="index.jsp">Blood Donation Bank</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav fw-bold fs-5">
                <li class="nav-item"><a class="nav-link mx-2 text-white" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link mx-2 text-white" href="#about">About</a></li>
               
                
        <li class="nav-item align-content-center  " >
          <form action="DonorController" method="get">
          <button class="border-0 navbar-custom text-white fw-bold">Donate</button>
          </form>
        </li>
        
         <li class="nav-item align-content-center  ">
          <form action="RequestController" method="get">
          <button class="border-0 navbar-custom navbar-custom text-white fw-bold">Request</button>
          </form>
        </li>
         <li class="nav-item align-content-center  " >
        <form action="U_DonationController" method="get">
         <input type="text" name="user_id" hidden value="<%=user.getUid() %>" >
        <%--  <input type="text" name="donor_name" value="<%=donor.getDonor_name() %>"> --%>
          <button class="border-0 navbar-custom navbar-custom text-white fw-bold">Donation</button>
          </form>
          </li>
          
           <li class="nav-item align-content-center  " >
           <form action="User_EventController" method="get">
       
          <button class="border-0 navbar-custom text-white fw-bold">Events</button>
          </form>
          </li>
          
                <!-- <li class="nav-item"><a class="nav-link mx-2 text-white" href="donors.jsp">Donors</a></li> -->
              
                <li class="nav-item"><a class="nav-link mx-2 text-white" href="#contact">Contact</a></li>
               <!--  <li class="nav-item">
                    <a class="btn btn-light btn-lg ms-4 px-4 shadow-lg register-btn text-danger" href="user_Register.jsp">Register</a>
                </li> -->
            </ul>
        </div>
    </div>
</nav>

<!-- ****************************************** slider ********************************* -->

<%@include  file="slider.jsp" %>
<!-- ****************************************** badges ********************************* -->
<%@include file="badges.jsp" %>
<!-- ****************************************** abouts ********************************* -->
<div id="about">
<%@include file="about.jsp" %>
</div>

<!-- ****************************************** blogs ********************************* -->
<%@include file="blog.jsp" %>
<!-- ****************************************** whydonate ********************************* -->
<%@include file="whydonate.jsp" %>
<!-- ****************************************** contact ********************************* -->
<div id="contact">
<%@include file="contact.jsp" %>
</div>

<!-- ****************************************** contact ********************************* -->
<%@include file="faq.jsp" %>
<!-- ****************************************** FAQ ********************************* -->
<%@include file="footer.jsp" %>


</body>
</html>