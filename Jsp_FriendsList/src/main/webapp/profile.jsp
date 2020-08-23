<%@page import="com.java.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>
</head>
<body>

	<%
		User user = (User)session.getAttribute("user");
		if(user == null) response.sendRedirect("login.jsp");
	%>
	<jsp:include page="heading.jsp"/>
	
	<h3 align="center"><%=user.getName()%>'s Profile info! </h3>

	<table align="center">
		<tr>
			<td>Username: </td> <td><%=user.getUsername()%></td>
		</tr>
		<tr>
			<td>Name: </td> <td><%=user.getName()%></td>
		</tr>
		<tr>
			<td>Email: </td> <td><%=user.getEmail()%></td>
		</tr>
	</table>

</body>
</html>