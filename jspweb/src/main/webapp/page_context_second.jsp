<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context Second</title>
</head>
<body style="text-align: center; background: teal;">

<%
out.println("<br>");
out.println("<br>");
out.println("<br>");
out.println(pageContext.getAttribute("role",PageContext.SESSION_SCOPE));
%>

</body>
</html>