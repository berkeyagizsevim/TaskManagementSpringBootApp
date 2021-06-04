<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>${user.fullName}</title>
</head>
<body>
	<h2>Assigned User: ${user.fullName}</h2>

	<p><b></b></p>

	<c:choose>
		<c:when test="${fn:length(user.tasks) > 0}">
			<ul>
				<c:forEach items="${user.tasks}" var="task">
					<li>Task Id: ${task.id}</li>
					<li>Task Title: ${task.taskTitle}</li>
					<li>Task Title: ${task.taskTitle}</li>
					<li>Task Description: ${task.taskDescription}</li>
					<li>Task Status: ${task.taskStatus}</li>
					<hr>
				</c:forEach>
			</ul>
		</c:when>
		<c:otherwise>
			<p class="small-italic">There is no available task in here.</p>
		</c:otherwise>
	</c:choose>
</body>
</html>