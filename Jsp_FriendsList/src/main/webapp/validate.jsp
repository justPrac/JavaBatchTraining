<%@page import="com.java.service.UserServiceImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validation</title>
</head>
<body>
	<% 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username == null || password == null)
		{
			response.sendRedirect("login.jsp");
		}
		UserServiceImp userService = new UserServiceImp();
		if(userService.validateUser(username, password))
		{
			session.setAttribute("user", userService.getUser(username));
			response.sendRedirect("home.jsp");
			
		}
		else
		{
			String msg = "<p align='center'> <font color='red'>Invalid Username/Password. Please try again!</font> </p>";
			session.setAttribute("msg", msg);
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>