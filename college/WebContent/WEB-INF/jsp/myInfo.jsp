<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list</title>
<style type="text/css">

td {
	background-color: aqua;
	border: 1px solid;
}
th {
	background-color: teal;
    border: 1px solid;
}


</style>

</head>
<body>
<table style="width:100; ">
<tr>

 <th>STUDID</th>
 <th>NAME</th>
 <th>EMAIL</th>
 <th>PASSWORD</th>
 <th>MOBILE</th>
 <th>USER ROLE</th>
     <th>EDIT</th>
     <th>DELETE</th>
     </tr>
     
     <tr style="background-color: white;">
     
     <td>${s.studId}</td>
      <td>${s.name}</td>
       <td>${s.email}</td>
        <td>${s.password}</td>
         <td>${s.mobile}</td>
          <td>${s.userRole}</td>
     
   <td style="border:1px solid ; "><a href="editstudent?studId=${s.studId}"><i class="fa fa-edit" style="font-size:24px;"></i>EDIT</a></td>
<td style="border:1px solid ; "><a href="deletestudent?studId=${s.studId}"><i class="fa fa-trash-o" style="font-size:24px ;color:red;"></i>DELETE</a></td>
     
     </tr>

</table>

</body>

</html>