<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="javatime" uri="http://sargue.net/jsptags/time" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h2>Result</h2>
	<table class="bordered">
		<tr>
			<td>Numeric Field 1:</td>
			<td>${formData.numericField1}</td>
		</tr>
		<tr>
			<td>Numeric Field 2:</td>
			<td><fmt:formatNumber value="${formData.numericField2}" minFractionDigits="2" maxFractionDigits="4"></fmt:formatNumber></td>
		</tr>		
		<tr>
			<td>Text Field 1:</td>
			<td>${formData.textField1}</td>
		</tr>
		<tr>
			<td>Text Field 2:</td>
			<td>${formData.textField2}</td>
		</tr>
		<tr>
			<td>Text Field 3:</td>
			<td>${formData.textField3}</td>
		</tr>
		<tr>
			<td>Drop Down Menu:</td>
			<td>${formData.dropDownMenu}</td>
		</tr>
		<tr>
			<td>Date Field:</td>
			<td><javatime:format value="${formData.dateField}" pattern="dd.MM.yyyy"/></td>
			<td></td>
		</tr>
		<tr>
			<td>Check Box:</td>
			<td>
			<c:forEach items="${formData.checkBoxSelection}" var="item" varStatus="i">
			<c:if test="${!i.last}"> ${item},</c:if>
			<c:if test="${i.last}"> ${item}.</c:if>
			
			</c:forEach>
			
			<c:choose>
				<c:when test="${!i.last}">${item}.</c:when>
				<c:otherwise>${item}.</c:otherwise>
				
			</c:choose>
			</td>
		</tr>
		<tr>
			<td>Radio Button:</td>
			<td>${formData.radioButtonValue}</td>
		</tr>
	</table>
</body>
</html>