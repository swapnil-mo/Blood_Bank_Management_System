<%-- <%@page import="java.util.ArrayList"%>
<%@page import="Model.User_RegisterModel"%>

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
//out.println("Name="+user.getName());


%>

<form method="post" action="DonorController">
<table align="center">
<tr><td align="center"><b><h1>Donors</b></h1></td><br>
<tr hidden><td>User id</td><td><input type="text" name="userid" value="<%=user.getUid()%> " ></td></tr>
<tr><td>Donor Name</td><td><input type="text" name="donor_name"></td></tr>
<tr><td><label>Blood group</label> <select name="txbn">
	<option selected disabled>select blood</option>
	<option>A+</option>
	<option>A-</option>
	<option>B+</option>
	<option>B-</option>
	<option>AB+</option>
	<option>AB-</option>
	<option>O+</option>
	<option>O-</option>
	</select></td></tr>
<tr><td>Date Of Birth</td><td><input type="date" name="txdob"></td></tr>
<tr><td>Last Of Donation</td><td><input type="date" name="txlob"></td></tr>
<tr><td>Address</td><td><input type="text" name="txadd"></td></tr>

<tr><td>Submit</td><td><input type="submit" name="but"></td></tr>
<tr><td>Reset</td><td><input type="reset" name="but"></td></tr>

</table>
</form>
</body>
</html>
 --%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.User_RegisterModel"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donor Registration</title>
    <!-- Bootstrap CDN -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script>
        // JavaScript form validation
        function validateForm() {
            var bloodGroup = document.forms["donorForm"]["txbn"].value;
            var dob = document.forms["donorForm"]["txdob"].value;
            var lob = document.forms["donorForm"]["txlob"].value;
            var address = document.forms["donorForm"]["txadd"].value;
            
            if (bloodGroup == "") {
                alert("Please select a blood group.");
                return false;
            }
            if (dob == "") {
                alert("Please enter your Date of Birth.");
                return false;
            }
            if (lob == "") {
                alert("Please enter your Last Donation Date.");
                return false;
            }
            if (address == "") {
                alert("Please enter your address.");
                return false;
            }
            return true;
        }
    </script>
    
    <style type="text/css">
      body {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
    
    </style>
</head>
<body>
    <div class="container mt-5">
        <% 
        HttpSession session1 = request.getSession();
        User_RegisterModel user = (User_RegisterModel) session1.getAttribute("currentuser");
        %>
        
        <h1 class="text-center mb-4">Donor Registration</h1>

        <form method="post" action="DonorController" name="donorForm" onsubmit="return validateForm()">
            <table class="table table-bordered text-white fw-bold">
                <tr hidden>
                    <td>User ID</td>
                    <td><input type="text" name="userid" value="<%= user.getUid() %>" class="form-control" readonly></td>
                </tr>
                <tr><td><label>Donor Name</label></td><td><input type="text" name="donor_name" class="form-control"></td></tr>
				
                <tr>
                    <td><label for="txbn">Blood Group</label></td>
                    <td>
                        <select name="txbn" class="form-control" id="txbn">
                            <option value="" selected disabled>Select blood group</option>
                            <option>A+</option>
                            <option>A-</option>
                            <option>B+</option>
                            <option>B-</option>
                            <option>AB+</option>
                            <option>AB-</option>
                            <option>O+</option>
                            <option>O-</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td><label for="txdob">Date of Birth</label></td>
                    <td><input type="date" name="txdob" id="txdob" class="form-control"></td>
                </tr>

                <tr>
                    <td><label for="txlob">Last Donation Date</label></td>
                    <td><input type="date" name="txlob" id="txlob" class="form-control"></td>
                </tr>

                <tr>
                    <td><label for="txadd">Address</label></td>
                    <td><input type="text" name="txadd" id="txadd" class="form-control" required></td>
                </tr>

                <tr>
                    <td></td>
                    <td class="text-center">
                        <button type="submit" name="but" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-success "> <a class="text-decoration-none text-white " href="./Home.jsp">Back</a></button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>



