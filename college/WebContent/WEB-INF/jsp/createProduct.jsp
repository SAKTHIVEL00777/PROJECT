<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%-- <jsp:include page="header.jsp"></jsp:include> --%>

<body style="background-color:gray; ">

<form:form action="createproduct" modelAttribute="productBo" method="post">

Product Name:<form:input path="productName"  placeholder="Product Name"/><br><br>

Product Price:<form:input path="price"  placeholder="Product Price" /><br><br>

Model One:<form:input path="modelOne"  placeholder="Model One" /><br><br>

Model Two:<form:input path="modelTwo"  placeholder="Model Two" /><br><br>


<form:button value="save">Save</form:button><br><br><br>


</form:form>
<a href="listProduct">List</a><br><br>
</body>
<%-- <jsp:include page="footer.jsp"></jsp:include> --%>
</html>