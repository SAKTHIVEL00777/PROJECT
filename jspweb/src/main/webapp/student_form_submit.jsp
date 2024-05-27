<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Page</title>
</head>
<body style="text-align: center; background: orange;">


<br>
<br>

<%

String studName=request.getParameter("studName");

String email=request.getParameter("email");

out.print(studName);

session.setAttribute("email", email);

%>
<%= studName %>
<br>
<%= email %>
<br><br>
<a href="session.jsp">Session implicit objects</a>



</body>
</html>