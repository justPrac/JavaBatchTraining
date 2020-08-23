<%@page import="com.java.model.User"%>
<%@page import="com.java.service.UserServiceImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
</head>
<body>



<%
	String msg = null;

	if(request.getParameter("signup") != null)
	{
		String name = (String)request.getParameter("name");
		String username = (String)request.getParameter("username");
		String email = (String)request.getParameter("email");
		String password = (String)request.getParameter("password");
		
		if(name != null && username != null && email != null && password != null)
		{
			UserServiceImp userService = new UserServiceImp();
			User u = new User();
			
			u.setName(name);
			u.setPassword(password);
			u.setEmail(email);
			u.setUsername(username);
			
			if(userService.addUser(u))
			{
				msg = "<p align='center'> <font color='green'>User Added Successfully! </font> </p>";
				session.setAttribute("msg", msg);
				response.sendRedirect("login.jsp");
			}
			else
			{
				msg = "<p align='center'> <font color='red'>Username already registered! Please try again!</font> </p>";
			}
		}
	}
%>



		<h2 align="center"><font color="orange">Friends Book</font></h2>
		<h3 align="center"><font color="blue"> Create a User Account </font></h3>
		
		<form method="post" action="signup.jsp">
			<table align="center">
			
			<%
				if(msg != null) 
				{
					out.print("<tr><td colspan=2>" + msg + "</td></tr>");
				}
			%>
			
				<tr>
					<td>Username</td>
					<td><input required type="text" name="username"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input required type="text" name="name"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input required type="password" name="password"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input required type="email" name="email"></td>
				</tr>
				<tr>
					<td><input type="submit" name="signup" value="Create Account"/></td>
					<td><button onclick="location.href='login.jsp'">Cancel</button></td>
				</tr>
			</table>
		</form>
</body>
</html>