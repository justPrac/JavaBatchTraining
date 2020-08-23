<%@ page import="com.java.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<%
		User user = (User)session.getAttribute("user");
	
		if(user == null)
		{
			response.sendRedirect("login.jsp");
		}
	%>
	
	<h2 align="center"><font color="orange">Friends Book</font></h2>
	
	<table align='center' style="background-color: aqua; width:400px;">
		<tr align="center">
			<td> <button onclick="location.href='home.jsp'">Home</button> </td>
			<td> <button onclick="location.href='profile.jsp'">My Profile</button> </td>
			<td> <button onclick="location.href='friendList.jsp'">My Friends</button> </td>
			<td> <button onclick="location.href='login.jsp'">Logout</button> </td>			
		</tr>
	</table>
	
</body>
</html>