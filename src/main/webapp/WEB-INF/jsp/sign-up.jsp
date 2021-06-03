<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Sign Up Page</title>
</head>
<body>
	<h1>Sign Up</h1>
	
	<form:form action="/send-signup-form" method="POST" modelAttribute="signupData">
		<table>
			<tr>
				<td>Full Name:</td>
				<td><form:input path="fullName"/></td>
				<td style="width:500px"><form:errors path="fullName" cssClass="error" /></td>
			</tr>
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
				<td>Phone Number:</td>
				<td><form:input path="phoneNumber"/></td>
				<td style="width:500px"><form:errors path="phoneNumber" cssClass="error" /></td>
			</tr>	
			<tr>
				<td>Date Field:</td>
				<td><form:input path="dateOfBirth" /></td>
				<td style="width:500px"><form:errors path="dateOfBirth" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Sign Up"></td>
			</tr>
		</table>	
	</form:form>
</body>
</html>