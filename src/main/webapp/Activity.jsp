<%@page import="Model.LoginModel"%>
<%@page import="Model.ActivityModel"%>
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
<form method="post" action="ActivityController">
<table align="center">
<tr><td align="center"><b><h1>Add Activity</b></h1></td><br>
<tr><td>Activity Name <input type="text" name="Name"></td></tr><br>
<tr><td>Performed At <input type="text" name="per"></td></tr><br>

	<tr><td><label>Admin_Name</label>
	
	 <select name="adimin_id">
	 <option  selected>select admin</option>
<%	for(LoginModel admin : alladmins)
{
	%>

	out.println(admin);
	<option value="<%=admin.getAdmin()%>"><%= admin.getName()%></option>
	
	<%
	}
	
	%>
	
	
	
	</select></td></tr>

<tr><td><input type="submit" name="but"></td></tr><br>
</table>
</form>

</body>
</html>