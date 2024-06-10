<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page errorPage="exception_page.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division Submit Page</title>
</head>
<body style="text-align: center; background: olive;">
<%
   out.println("<br>");
   out.println("<br>");
   out.println("<br>");
   
  String no1=request.getParameter("no1");
  String no2=request.getParameter("no2");
  
  int num1=Integer.parseInt(no1);
  int num2=Integer.parseInt(no2);
  
  int s=num1/num2;
  out.print(s);


%>

</body>
</html>