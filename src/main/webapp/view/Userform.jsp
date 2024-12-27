<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>

<form action="/submitUser" method="post">

    <label>Name:</label>
    <input type="text" name="Name" value="${user.name}">
    <br>

    <label>Email:</label>
    <input type="text" name="email" value="${user.email}">
    <br><br>

    <button type="submit">SUBMIT</button>
</form>

<a href="/">Back To Home</a>

</body>
</html>
