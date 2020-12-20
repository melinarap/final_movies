<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Movie Database</title>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
</head>

<body>
	<div class="page">
		<div class="header">
			<h1>The Ultimate Movie Database</h1>
			<h2>by Georgia Vlantou & Melina Raptaki</h2>
		</div>
		<form:form action="/moviesApp/user/register" cssClass="registration"
			method="get">
			<span id="register_txt">Why aren't you a member yet? Register here!</span>
			<button class="btn">Register</button>
		</form:form>
	</div>
</body>
</html>
