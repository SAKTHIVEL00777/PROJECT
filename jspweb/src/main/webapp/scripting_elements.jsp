<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.techietact.jspweb.bo.StudentBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.techietact.jspweb.bo.StudentBo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scripting Elements</title>
</head>
<body style="text-align: center; background: lime;">


<%!
     String company="SOFTTWIG";

     public int add(int x, int y){
    	 return x+y;
     }
 
%>

<%
out.println("<br>");
out.println("<br>");
out.println("Scriptlet tag called...!");
out.println("<br>");
out.println(company);
out.println("<br>");
out.println(add(27,23));

%>
<br>
Expression Tag:<%= company  %>


<br>
<%
StudentBo bo=new StudentBo();
List<String> list=new ArrayList<>();

bo.setStudId(7);
bo.setStudName("DHONI");
bo.setEmail("dhono@gmail.com");

out.println(bo.getStudId());
out.println("<br>");
out.println(bo.getStudName());
out.println("<br>");
out.println(bo.getEmail());

%>


</body>
</html>