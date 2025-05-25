<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="User_EventController" method="post">
<table align="center">
<tr><td><h1><b>Events</h1></b></td></tr><br>

<tr><td>Event Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Description</td><td><input type="text" name="desc"></td></tr>
<tr><td>Address</td><td><input type="text" name="add"></td></tr>
<tr><td>Event Date</td><td><input type="date" name="event_date"></td></tr><br>
 <tr><td>Submit</td><td><input type="submit" name="but"></td><tr>

</table>


</form>
</body>
</html> --%>



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>

   body {
            background: linear-gradient(to right, #ff4b2b, #ff416c);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
</style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Event Form</title>

    <!-- Bootstrap 4 CDN -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

    <!-- Optional: jQuery and Bootstrap JS for additional interactivity -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <!-- Custom JS for validation (optional) -->
    <script>
        // Basic form validation (optional)
        function validateForm() {
            var name = document.forms["eventForm"]["name"].value;
            var desc = document.forms["eventForm"]["desc"].value;
            var address = document.forms["eventForm"]["add"].value;
            var eventDate = document.forms["eventForm"]["event_date"].value;
            
            if (name == "" || desc == "" || address == "" || eventDate == "") {
                alert("All fields must be filled out");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h2 class="text-center my-4">Create Event</h2>
                <form name="eventForm" action="User_EventController" method="post" onsubmit="return validateForm()">
                    <div class="form-group">
                        <label for="name">Event Name</label>
                        <input type="text" class="form-control" id="name" name="name" required>
                    </div>
                    <div class="form-group">
                        <label for="desc">Description</label>
                        <input type="text" class="form-control" id="desc" name="desc" required>
                    </div>
                    <div class="form-group">
                        <label for="add">Address</label>
                        <input type="text" class="form-control" id="add" name="add" required>
                    </div>
                    <div class="form-group">
                        <label for="event_date">Event Date</label>
                        <input type="date" class="form-control" id="event_date" name="event_date" required>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block ">Submit</button>
                         <button type="reset" class="btn btn-success btn-block"> <a class="text-decoration-none text-white d-block" href="./Home.jsp">Back</a></button>
                </form>
            </div>
        </div>
    </div>
    
     
</body>
</html>
