<%-- <%@page import="java.util.ArrayList"%>
<%@page import="org.apache.tomcat.util.digester.SystemPropertySource"%>
<%@page import="Model.DonorModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
HttpSession session1=request.getSession();
DonorModel  donor= (DonorModel) session1.getAttribute("donor_details");


%>
<form method="post" action="U_DonationController">
<table align="center">
<tr><td><b><h1>Donation Form</b></h1></td>
<tr hidden><td>Donor id</td><td><input type="text" name="donorid" value="<%= donor.getDonor_id()%>" selected></td></tr>
<tr><td>Donor Name</td><td><input type="text" name="donor_name" value="<%= donor.getDonor_name()%>" selected></td></tr>

<tr><td><p>In this your first time donating?</p>
  <input type="radio" name="but" value="Yes">
  <label>Yes</label><br>
  <input type="radio" name="but" value="No">
  <label>No</label><br>
  </td></tr>
  
<tr><td> <label>Blood Group</label>
<select name="txbn">
<option selected disabled>Select Blood</option>
<option>A+</option>
<option>A-</option>
<option>B+</option>
<option>B-</option>
<option>AB+</option>
<option>AB-</option>
<option>O+</option>
<option>O-</option>

</select></td></tr>

<tr><td>Quantity</td><td><input type="text" name="qty"></td></tr>
<tr><td>Donation Date</td><td><input type="date" name="txdd"></td></tr>
<tr><td>Contact Number</td><td><input type="number" name="txcn"></td></tr>
<tr><td>Submit</td><td><input type="submit" name="but"></td></tr>
<tr><td>Reset</td><td><input type="reset" name="but"></td></tr>
</table>
</form>
</body>
</html>

 --%>

<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.tomcat.util.digester.SystemPropertySource"%>
<%@page import="Model.DonorModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donation Form</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    
          <style type="text/css">
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
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #007bff;
            text-align: center;
        }

        .error {
            color: red;
            font-size: 14px;
        }
    </style>
</head>
<body>

<%
HttpSession session1 = request.getSession();
DonorModel donor = (DonorModel) session1.getAttribute("donor_details");
%>

<div class="container mt-5">
    <div class="form-container">
        <h1>Donation Form</h1>

        <!-- Form starts here -->
        <form name="donationForm" method="post" action="U_DonationController" onsubmit="return validateForm()">
            <input type="hidden" name="donorid" value="<%= donor.getDonor_id() %>">
            <label>Donor Name</label><input class="form-control" type="text" name="donor_name" value="<%= donor.getDonor_name()%>" selected></td></tr>
            

      <div class="form-group">
            
            
  <label>In this your first time donating?</label><br>
  <input type="radio" name="but" value="Yes">
  <label>Yes</label><br>
  <input type="radio" name="but" value="No">
  <label>No</label><br>
  </td></tr>
                <label for="txbn">Blood Group</label>
                <select class="form-control" name="txbn" id="txbn">
                    <option value="" selected disabled>Select Blood</option>
                    <option>A+</option>
                    <option>A-</option>
                    <option>B+</option>
                    <option>B-</option>
                    <option>AB+</option>
                    <option>AB-</option>
                    <option>O+</option>
                    <option>O-</option>
                </select>
                <span class="error" id="bloodGroupError"></span>
            </div>

            <div class="form-group">
                <label for="qty">Quantity (in ml)</label>
                <input type="text" class="form-control" name="qty" id="qty" min="1" required>
                <span class="error" id="quantityError"></span>
            </div>

            <div class="form-group">
                <label for="txdd">Donation Date</label>
                <input type="date" class="form-control" name="txdd" id="txdd" required>
                <span class="error" id="dateError"></span>
            </div>

           <!--  <div class="form-group">
                <label for="txhm">Hospital Name</label>
                <input type="text" class="form-control" name="txhm" id="txhm" required>
                <span class="error" id="hospitalNameError"></span>
            </div>

            <div class="form-group">
                <label for="txha">Hospital Address</label>
                <input type="text" class="form-control" name="txha" id="txha" required>
                <span class="error" id="hospitalAddressError"></span>
            </div> -->
            
            
            <div class="form-group">
                <label for="txdd">Contact Number</label>
                <input type="number" class="form-control" name="txdd" id="txcn" required>
                <span class="error" id="dateError"></span>
            </div>
            
           <!--  <tr><td>Contact Number</td><td><input type="number" name="txcn"></td></tr> -->

            <button type="submit" class="btn btn-primary btn-block">Submit</button>
             <button type="reset" class="btn btn-success btn-block"> <a class="text-decoration-none text-white d-block" href="./Home.jsp">Back</a></button>
        </form>
    </div>
</div>

<!-- Include Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<script>
function validateForm() {
    // Clear previous error messages
    document.getElementById("bloodGroupError").innerText = "";
    document.getElementById("quantityError").innerText = "";
    document.getElementById("dateError").innerText = "";
    document.getElementById("hospitalNameError").innerText = "";
    document.getElementById("hospitalAddressError").innerText = "";

    let isValid = true;

    // Blood group validation
    const bloodGroup = document.forms["donationForm"]["txbn"].value;
    if (!bloodGroup) {
        document.getElementById("bloodGroupError").innerText = "Please select a blood group.";
        isValid = false;
    }

    // Quantity validation
    const quantity = document.forms["donationForm"]["qty"].value;
    if (quantity <= 0 || quantity === "") {
        document.getElementById("quantityError").innerText = "Quantity must be a positive number.";
        isValid = false;
    }

    // Date validation
    const donationDate = document.forms["donationForm"]["txdd"].value;
    if (!donationDate) {
        document.getElementById("dateError").innerText = "Please select a donation date.";
        isValid = false;
    }

    // Hospital Name validation
    const hospitalName = document.forms["donationForm"]["txhm"].value;
    if (!hospitalName) {
        document.getElementById("hospitalNameError").innerText = "Please enter the hospital name.";
        isValid = false;
    }

    // Hospital Address validation
    const hospitalAddress = document.forms["donationForm"]["txha"].value;
    if (!hospitalAddress) {
        document.getElementById("hospitalAddressError").innerText = "Please enter the hospital address.";
        isValid = false;
    }

    return isValid;
}
</script>

</body>
</html>
