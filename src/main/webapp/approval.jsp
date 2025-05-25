<%@page import="java.util.function.LongToIntFunction"%>
<%@page import="Model.LoginModel"%>
<%@page import="Model.DonorModel"%>
<%@page import="Model.RequestModel"%>
<%@page import="Model.ApprovalModel"%>
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
HttpSession session1=request.getSession();
ArrayList<RequestModel> allrequest=(ArrayList<RequestModel>) session1.getAttribute("allrequest");
ArrayList<DonorModel> alldonor=(ArrayList<DonorModel>) session1.getAttribute("alldonor");
ArrayList<LoginModel> alladmin=(ArrayList<LoginModel>) session1.getAttribute("alladmin");
%>
<form method="post" action="ApprovalController">
<table align="center"> 
<tr><td><b><h1>Approval Managment</b></h1></td><tr><br>
<tr><td><label>Request Name</label>
<select name="txrq">
<option selected>select request</option>
<%
for(RequestModel rq:allrequest)
{
%>

<option value="<%=rq.getRequest_id()%>"><%=rq.getRequest_id() %></option>

<%
}
%>
</select>

</td></tr>

<tr><td><label>Donor id</label>

<select name="txdi">
<option selected>select donor</option>
<%
for(DonorModel donor:alldonor)
{
%>
<option value="<%= donor.getDonor_id()%>"><%=donor.getDonor_id() %></option>

<%
}
%>
</select>

</td></tr>

<tr><td>

<label>Admin Name</label>
<select name="txad">
<option selected>select admin</option>
<%
for(LoginModel admin: alladmin)
{
%>

<option value="<%=admin.getAdmin()%>"><%=admin.getName() %></option>

<%
}
%>
</select>
</td></tr>



<tr hidden><td>Status</td><td><input type="text" name="txst" value="Approve" hidden></td></tr>
<tr><td>Approval Date</td><td><input type="date" name="txdate"></td></tr>
<tr><td>Submit</td><td><input type="submit" name="but"></td></tr>
</table>
</form>
</body>
</html>