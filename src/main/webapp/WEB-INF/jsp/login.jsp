<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<h1>Login</h1>
	
	<form:form action="/check-login" method="POST" modelAttribute="loginData">
		<table>
			<tr>
				<td>Email:</td>
				<td><form:input path="email"/></td>
				<td style="width:500px"><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password"/></td>
				<td style="width:500px"><form:errors path="password" cssClass="error" /></td>
			</tr>	
			<tr>
				<td colspan="3"><input type="submit" value="Login"></td>
			</tr>
		</table>	
	</form:form>
</body>
</html>