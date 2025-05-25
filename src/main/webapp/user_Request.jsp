<%-- <%@page import="Model.User_RegisterModel"%>

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
User_RegisterModel user=(User_RegisterModel)session1.getAttribute("currentuser");

%>
<form method="post" action="RequestController">
<table align="center">
<tr><td align="center"><b><h1>Request Reason</b></h1></td><tr>
<tr hidden><td>User id</td><td><input type="text" name="use_id" value="<%= user.getUid()%>"></td></tr>
<tr><td><label>Blood Group</label><select name=txbn>
<option selected disabled>Selecte Blood</option>
<option>A+</option>
<option>A-</option>
<option>B+</option>
<option>B-</option>
<option>AB+</option>
<option>AB-</option>
<option>O+</option>
<option>O-</option>

</select></td></tr>
<tr><td>Quantity</td><td><input type="number" name="qty"></td><tr>
<tr><td>Request Reason</td><td><input type="text" name="txrr"></td><tr>
<tr><td>Submit</td><td><input type="submit" name="but"></td></tr>
<tr><td>Reset</td><td><input type="reset" name="but"></td></tr>
</table>

</form>
</body>
</html> --%>






<%@page import="Model.User_RegisterModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Blood</title>
<style>

body {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
  
    table {
        width: 100%;
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        border-radius: 8px;
        background-color: white;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1 {
        color: #4CAF50;
        text-align: center;
    }

    td {
        padding: 10px;
    }

    input[type="text"],
    input[type="number"],
    select {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"],
    input[type="reset"] {
        background-color: #4CAF50;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover,
    input[type="reset"]:hover {
        background-color: #45a049;
    }

    .error {
        color: red;
        font-size: 14px;
    }
    
    /* Custom Button Style */
.custom-btn {
    background-color: #28a745; /* Bootstrap 'btn-success' color */
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
    text-align: center;
    display: inline-block;
    text-decoration: none; /* Prevents underline from appearing on the link */
}

.custom-btn:hover {
    background-color: #218838; /* Darker shade for hover effect */
}

/* Custom Link inside Button */
.custom-link {
    color: white;
    text-decoration: none; /* Ensures link has no underline */
}

.custom-link:hover {
    color: #ddd; /* Lighter color for hover effect */
}
    
</style>

<script>
function validateForm() {
    // Get form values
    var userId = document.forms["requestForm"]["use_id"].value;
    var bloodGroup = document.forms["requestForm"]["txbn"].value;
    var quantity = document.forms["requestForm"]["qty"].value;
    var reason = document.forms["requestForm"]["txrr"].value;
    
    // Validate User ID
    if (userId == "") {
        alert("User ID must be filled out");
        return false;
    }

    // Validate Blood Group
    if (bloodGroup == "") {
        alert("Please select a blood group");
        return false;
    }

    // Validate Quantity
    if (quantity == "" || quantity <= 0) {
        alert("Quantity must be a positive number");
        return false;
    }

    // Validate Request Reason
    if (reason == "") {
        alert("Request reason must be provided");
        return false;
    }

    return true;
}
</script>

</head>
<body>
<%
HttpSession session1 = request.getSession();
User_RegisterModel user = (User_RegisterModel) session1.getAttribute("currentuser");
%>

<form name="requestForm" method="post" action="RequestController" onsubmit="return validateForm()">
    <table align="center">
        <tr><td align="center"><b><h1>Request Blood</h1></b></td></tr>
        <tr hidden><td>User ID</td><td><input type="text" name="use_id" value="<%= user.getUid() %>" readonly></td></tr>
        <tr><td>Blood Group</td><td>
            <select name="txbn">
                <option value="" selected disabled>Select Blood Group</option>
                <option value="A+" >A+</option>
                <option value="A-" >A-</option>
                <option value="B+" >B+</option>
                <option value="B-" >B-</option>
                <option value="AB+" >AB+</option>
                <option value="AB-" >AB-</option>
                <option value="O+" >O+</option>
                <option value="O-" >O-</option>
            </select>
        </td></tr>
        <tr><td>Quantity</td><td><input type="text" name="qty" min="1"></td></tr>
        <tr><td>Request Reason</td><td><input type="text" name="txrr"></td></tr>
        <tr><td colspan="2" align="center">
            <input type="submit" name="but" value="Submit">
            <button type="button" class="custom-btn"> 
    <a class="custom-link" href="./Home.jsp">Back</a>
</button>
                    </td></tr>
    </table>
</form>

</body>
</html>
