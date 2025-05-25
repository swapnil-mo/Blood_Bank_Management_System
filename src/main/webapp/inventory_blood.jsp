<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="InventoryController">
<table align="center">
<tr><td align="center"><b><h1>Add Blood Inventory</b></h1></td><br>
<tr><td>Quality <input type="text" name="qty"></td></tr><br>
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
<tr><td >Date <input type="text" name="txud"></td></tr><br>
<tr><td><input type="submit" name="but"></td></tr><br>
</table>
</form>
</body>
</html>