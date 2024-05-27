<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Page</title>
</head>
<body style="text-align: center; background: orange;">

<jsp:include page="/header.jsp"></jsp:include>

 <br>
<i><b><c:out value="HELLO WORLD"></c:out> </b></i>
  <br>
  <br>
<b><c:out value="${name}"></c:out></b>
<br>
<c:set var="price" value="17000"></c:set>
<br>
<b><c:out value="${price}"></c:out></b>
<br><br>

<b><c:if test="${userType == 'Student'}"> Welcome To Student</c:if></b>
<c:if test="${userType == 'Admin'}"> Welcome To Admin</c:if><br><br>

<c:choose>

 <c:when test="${userType == 'Student'}">Welcome To Student DashBoard from choose tag</c:when> 
  <c:otherwise>Welcome To Admin DashBoard from choose tag</c:otherwise>
  
</c:choose>
<br>
<br>
<c:forEach items="${list}" var="employee">

 <b>  <c:out value="${employee.empId}"></c:out>   </b>
  <b>  <c:out value="${employee.firstName}"></c:out>    </b>
  <b>  <c:out value="${employee.lastName}"></c:out>     </b>
</c:forEach>
<br>

   <jsp:include page="/footer.jsp"></jsp:include>
   
<%--    <jsp:forward page="/footer.jsp"></jsp:forward>
 --%>   

</body>
</html>