<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Config Page</title>
</head>
<body style="text-align: center; background: fuchsia;">

<%

   out.println("<br>");
   out.println("<br>");
  String college= config.getInitParameter("college");
  out.println(college);

%>

</body>
</html>