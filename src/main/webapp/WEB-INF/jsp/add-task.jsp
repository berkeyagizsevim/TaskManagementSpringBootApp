<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>Add New Task</title>
</head>
<body>
	<h1>Add Task</h1>
	
	<form:form action="/send-task-data" method="POST" modelAttribute="taskData">
		<table>
			<tr>
				<td>Task Title:</td>
				<td><form:input path="taskTitle"/></td>
				<td style="width:500px"><form:errors path="taskTitle" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Task Description: </td>
				<td><form:input path="taskDescription"/></td>
				<td style="width:500px"><form:errors path="taskDescription" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add New Task"></td>
			</tr>
		</table>	
	</form:form>
</body>
</html>