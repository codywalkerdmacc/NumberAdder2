<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Welcome to the Java EE World</title>
</head>
<body>
<h1>Number Adder</h1>
<form action="getNumbersServlet" method="post">
Enter a number:
<input type="text" name="userNumber1" size="10">
Enter a number:
<input type="text" name="userNumber2" size="10">
Enter a number:
<input type="text" name="userNumber3" size="10">
<input type="submit" value="Add Numbers" />
</form>
</body>
</html>