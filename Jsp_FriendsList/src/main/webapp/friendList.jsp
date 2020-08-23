<%@page import="com.java.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Friend's List</title>
</head>
<body>

	<%
		User user = (User)session.getAttribute("user");
		if(user == null) response.sendRedirect("login.jsp");
	%>
	<jsp:include page="heading.jsp"/>
	
	<h3 align="center"><%=user.getName()%>'s Friends List! </h3>

	<table align="center">
		<tr>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<%
			for(User friend : user.getFriends())
			{
		%>		
		<tr>
			<td><%=friend.getName()%></td>
			<td><%=friend.getEmail()%></td>
		</tr>
		<%	
			}
		%>
	</table>

</body>
</html>