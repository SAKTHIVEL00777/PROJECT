<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- <style type="text/css">

.error{

      color: red;
}
</style> -->
</head>
<jsp:include page="header.jsp"></jsp:include>
<body style="background-color:gray; ">

<form:form action="editstudent" modelAttribute="studentBo" method="post">


StudId:<form:hidden path="studId"/><br><br>

Name:<form:input path="name" />
 <form:errors path="name" class="input_error"/> <br><br>

Email:<form:input path="email"/>
 <form:errors path="email" class="input_error"/> <br><br>

Password:<form:input path="password"/>
 <form:errors path="password" class="input_error"/> <br><br>

Mobile:<form:input path="mobile"/>
 <form:errors path="mobile" class="input_error"/> <br><br>

User Role

 <form:select path="userRole"><br>

<form:option value="userRole">Select User Role</form:option>

<form:option value="admin">Admin</form:option>

<form:option value="staff">Staff</form:option>

<form:option value="student">Student</form:option>

</form:select>
  <form:errors path="userRole" class="input_error"/> 

<form:button value="register">Update</form:button><br><br><br>
</form:form>
</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>