<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
</head>
<body>
    <div class="container-fluid">
       <form:form action="saveProduct" modelAttribute="addProduct">
            <table align="center">
            <tr>
              <td><label class="control-label">Product ID:</label></td>
               <td><form:input path="id" class="form-control"/></td>
             </tr>
             
             <tr>
              <td><label>Product Name:</label></td>
               <td><form:input path="product_name" class="form-control"/></td>
             </tr>
             
             <tr>
              <td><label >Manufacturer:</label></td>
               <td><form:input path="manufacturer" class="form-control"/></td>
             </tr>
             
              <tr>
              <td><label>Stock:</label></td>
               <td><form:input path="stock" class="form-control"/></td>
             </tr>
             
              <tr>
              <td><label>Description:</label></td>
               <td><form:textarea path="description" class="form-control"/></td>
             </tr>
              
             <tr>
             <td></td>
              <td><br><input type="submit" value="Add Product" align="middle" class="btn btn-outline-dark btn-lg"></td>
             </tr>
            </table>
       </form:form>
     </div>
     
     <table border="1px">
				<tr>
					<th>ID</th>
					<th>Product Name</th>
					<th>Manufacturer</th>
					<th>Stock</th>
				    <th>Description</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach items="${theProdut}" var="product">
				<tr>
				   <td>${product.id}</td>
				</tr>
				
				</c:forEach>
	</table>			
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" ></script>
</html>