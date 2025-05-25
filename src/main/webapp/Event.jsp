<%@page import="Model.LoginModel"%>
<%@page import="Model.EventModel"%>
<%@page import="java.util.ArrayList"%>
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
HttpSession session1=request.getSession(true);
ArrayList<LoginModel> alladmins =(ArrayList<LoginModel>) session1.getAttribute("alladmins");

%>
<form method="post" action="EventController">
<table align="center">
<tr><td align="center"><b><h1>Add Event</b></h1></td><br>
<tr><td>Event Name <input type="text" name="Name"></td></tr><br>
<tr><td>Event Description <input type="text" name="desc"></td></tr><br>
<tr><td>Event Location <input type="text" name="loc"></td></tr><br>
<tr><td>Event Date <input type="text" name="edate"></td></tr><br>
	<tr><td><label>Admin_Name</label>
	
	 <select name="adid">
	 <option  selected>select admin</option>
<%	for(LoginModel admin : alladmins)
{
	%>

	out.println(admin);
	<option value="<%=admin.getAdmin()%>"><%= admin.getName() %></option>
	
	<%
	}
	
	%>
	
	
	
	</select></td></tr>

<tr><td><input type="submit" name="but"></td></tr><br>
</table>
</form>

</body>
</html>