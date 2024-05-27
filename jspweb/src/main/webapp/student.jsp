<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Page</title>
</head>
<body style="text-align: center; background: aqua;">
<br>
<h1 style="color: blue;">${name} </h1> <br>
<h2 style="color: green;">${successMessage}</h2>  <br>
<h3 style="color: red;">${errorMessage} </h3> <br>

<b>Session Value is:  ${loggedInUser} </b>  <br>

${bo.studId} <br>

${bo.studName} <br>

${bo.email} <br>

<input type="text" name="studId" value="${bo.studId}">   <br>
<input type="text" name="studName" value="${bo.studName}">  <br>
<input type="text" name="email" value="${bo.email}"> 
</body>
</html>