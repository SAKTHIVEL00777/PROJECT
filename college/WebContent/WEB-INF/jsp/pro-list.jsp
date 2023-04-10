<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product list</title>
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
<table style="width: 100%;">

<tr>
  
   <th> PRODUCTID</th>

    <th>PRODUCTNAME</th>
    
    <th>PRICE</th>
    
    <th>MODELONE</th>
    
    <th>MODELTWO</th>
    
       <th>EDIT</th>
       <th>DELETE</th>
       
       </tr>
       
       <c:forEach items="${ref}" var="s">
       
        <tr style="background-color: white;">
        
        <td>${s.productId}</td>
        
         <td>${s.productName}</td>
         
          <td>${s.price}</td>
          
           <td>${s.modelOne}</td>
           
            <td>${s.modelTwo}</td>
            
               
   <td style="border:1px solid ; "><a href="editstudent?productId=${s.productId}"><i class="fa fa-edit" style="font-size:24px;"></i>EDIT</a></td>
<td style="border:1px solid ; "><a href="deletestudent?productId=${s.productId}"><i class="fa fa-trash-o" style="font-size:24px ;color:red;"></i>DELETE</a></td>
            
        </tr>
       
       
       </c:forEach> 
</table>

</body>
</html>