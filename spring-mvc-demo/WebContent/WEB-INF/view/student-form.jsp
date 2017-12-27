<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/>
			<br><br>
		Last name(*): 
			<form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error" />
			<br><br>
		Country:
			<form:select path="country">
				<form:options items="${theCountryOptions}" />
			</form:select>
			<br><br>
		Favourite Language:
			Java <form:radiobutton path="favouriteLanguage" value="Java" />
			C# <form:radiobutton path="favouriteLanguage" value="C#" />
			Perl <form:radiobutton path="favouriteLanguage" value="Perl" />
			Monkey <form:radiobutton path="favouriteLanguage" value="Monkey" />
			<br><br>
		Operating Systems:
			Windows <form:checkbox path="operatingSystems" value="Windows" />
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			<br><br>
			
		<input type="submit" value="Submit" />
			<br><br>
	</form:form>
	
</body>
</html>