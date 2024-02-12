<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Added Numbers</title>
</head>
<body>
<p>the total is...<br />
${userNumbersHolder.getTotal()}<br />
</p>
<a href="index.jsp">Enter New Numbers</a>
</body>
</html>