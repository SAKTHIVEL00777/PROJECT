<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Context Page</title>
</head>
<body style="text-align: center; background: orange;">

<%

     out.println("<br><br>");
     out.println("<br><br>");
      String  company= application.getInitParameter("company");
      out.println(company);
     
     out.println("<br><br>");

      String  companyAddress=(String)application.getAttribute("companyAddress");
      out.println(companyAddress);
    

%>
</body>
</html>