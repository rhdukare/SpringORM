<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

First Name:<c:out value="${param.firstName}"></c:out><br/> 
Last Name:<c:out value="${param.lastName}"></c:out><br/>
City pincode:<c:out value="${param.city*param.city}"></c:out>
</body>
</html>