<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 

</head>
<jsp:include page="header.jsp"></jsp:include>

<body style="background-color:gray; ">

<div  style="height: 315px;">

<h1>NATIONAL COLLEGE TRICHY</h1>

<a href="createstudent">REGISTER</a><br><br>

 <a href="login">LOGIN</a><br><br>
 
 <a href="createproduct">PRODUCT REGISTER</a>

<%-- <form:select path="">

<form:option value="">Select User Role</form:option>
<form:option value="admin">Admin</form:option>
<form:option value="staff">Staff</form:option>
<form:option value="student">Student</form:option>

</form:select> --%>



 <%-- <form action="">

<select >

<option value="">select user</option>
<option value="admin">admin</option>
<option value="staff">staff</option>

</select>
</form> --%>  


</div>
<h2>Welcome To All Students</h2>

</body>

<jsp:include page="footer.jsp"></jsp:include>
</html>