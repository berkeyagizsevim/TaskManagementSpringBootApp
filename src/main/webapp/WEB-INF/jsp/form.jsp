<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<h2>Form Processing</h2>
	<form:form method="post" action="/send-form-data" modelAttribute="formData">
		<table class="bordered">
			<tr>
				<td>Numeric Field 1:</td>
				<td><form:input path="numericField1" /></td>
				<td style="width:500px"><form:errors path="numericField1" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Numeric Field 2:</td>
				<td><form:input path="numericField2" /></td>
				<td style="width:500px"><form:errors path="numericField2" cssClass="error" /></td>
			</tr>			
			<tr>
				<td>Text Field 1:</td>
				<td><form:input path="textField1" /></td>
				<td style="width:500px"><form:errors path="textField1" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Text Field 2:</td>
				<td><form:input path="textField2" /></td>
				<td style="width:500px"><form:errors path="textField2" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Text Field 3:</td>
				<td><form:input path="textField3" /></td>
				<td style="width:500px"><form:errors path="textField3" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Drop Down Menu:</td>
				<td><form:select path="dropDownMenu">
						<form:option value="" label="-- Please Select --" />
						<form:option value="Item 1" label="Item 1" />
						<form:option value="Item 2" label="Item 2" />
						<form:option value="Item 3" label="Item 3" />
					</form:select>
				</td>
				<td style="width:500px"><form:errors path="dropDownMenu" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Date Field:</td>
				<td><form:input path="dateField" /></td>
				<td style="width:500px"><form:errors path="dateField" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Check Box:</td>
				<td><form:checkbox path="checkBoxSelection" value="Item 1" label="Item 1" /><br> 
					<form:checkbox path="checkBoxSelection"	value="Item 2" label="Item 2" /><br> 
					<form:checkbox path="checkBoxSelection" value="Item 3" label="Item 3" /><br>
				</td>
				<td style="width:500px"><form:errors path="checkBoxSelection" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Radio Button:</td>
				<td><form:radiobutton path="radioButtonValue" value="Item 1" label="Item 1" /><br> 
					<form:radiobutton path="radioButtonValue" value="Item 2" label="Item 2" /><br> 
					<form:radiobutton path="radioButtonValue" value="Item 3" label="Item 3" /><br>
				</td>
				<td style="width:500px"><form:errors path="radioButtonValue" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Send"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>