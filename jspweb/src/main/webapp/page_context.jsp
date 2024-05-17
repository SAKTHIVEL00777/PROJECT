<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context</title>
</head>
<body style="text-align: center; background: yellow;">

<%

out.println("<br>");
out.println("<br>");
out.println("<br>");

pageContext.setAttribute("name", "Suresh Raina");
pageContext.setAttribute("email", "sr03@gmail.com");
pageContext.setAttribute("native", "Ranchi");


out.println(pageContext.getAttribute("name"));
out.println("<br>");
out.println(pageContext.getAttribute("email"));
out.println("<br>");
out.println(pageContext.getAttribute("native"));


pageContext.setAttribute("role", "Left Hand Batter",PageContext.SESSION_SCOPE);

%>
<br><br><br>

<a href="page_context_second.jsp">Page Context Second</a>

</body>
</html>