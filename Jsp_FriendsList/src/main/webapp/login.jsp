<%@page import="com.java.service.UserServiceImp"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<h2 align="center"><font color="orange">Friends Book</font></h2>
	
	<% 
		String msg = (String)session.getAttribute("msg");
	
		if(msg != null)
		{
			out.print(msg);
		}
	%>
	
	<form method="post" action="validate.jsp">
		<table align="center">
			<tr>
				<td>Username: </td>
				<td><input required type="text" name="username"/></td>
			</tr>
			
			<tr>
				<td>Password: </td>
				<td><input required type="password" name="password"/></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Login"/></td>
				<td><button onclick="location.href='signup.jsp'">Sign Up</button> </td>
			</tr>
		</table>
	</form>
	
	<%
		session.invalidate();
	%>
	
</body>
</html>
