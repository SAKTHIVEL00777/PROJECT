<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body style="text-align: center;background: aqua;">

<br>

 WELCOME JSP <br><br>
 
  <a href="scripting_elements.jsp">Scripting Elements</a>  <br><br>
 
 <a href="student_form.jsp">Request And Response Implicit Objects</a>   <br><br>
 
 <a href="response.jsp">Response Implicit Objects</a>    <br><br> 

<a href="servletConfig" >Servlet Config.</a>   <br><br>

<% application.setAttribute("companyAddress", "CHENNAI");  %>

<a href="servlet_context.jsp">Servlet Context</a>   <br><br>

<a href="page_context.jsp">Page Context</a>   <br><br>

<a href="division.jsp">Exception</a>   <br><br>

<a href="student">EL (Expression Language)</a>  <br> <br>

<a href="employee">Employee</a>   

</body>
</html>