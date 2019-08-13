<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>

<c:forEach var="student" items="${students}" >
	<c:out value="${student.name}"></c:out>
	<c:out value="${student.id}"></c:out>
	<c:out value="${student.address}"></c:out>
	<c:out value="${student.phNo}"></c:out>
</c:forEach>
<a href="./index.html">Home Page</a>
</body>
</html>