<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
  .foo{
        border: 1px solid red;
       }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<br/>
	<h3>All Products</h3>
	
	Check out all the awesome product available now!
	<table  class="table table-sm " >
	  <thead class="thead-light">
		<tr>
		    <th>Photo Thumb</th>
			<th>Product Name</th>
			<th>Manufacturer</th>
			<th>Price</th>
			<th>Detail</th>
		</tr>
	   </thead>	
	   <tbody>
		<c:forEach var="addproduct" items="${products}">
			
			<c:url var="getid" value="/listProduct/viewProduct/">
			     <c:param name="productId" value="${addproduct.id}"/>
			</c:url>
			
			<tr>
			    <td><img src='<c:url value="/resource/images/${addproduct.id}.png"/>' class="img-fluid" alt="image" 
					     style="width:100px;height:100px" /></td>
				<td> ${addproduct.productname} </td>
				<td> ${addproduct.manufacturer} </td>
				<td> ${addproduct.price} </td>
				<%-- <spring:url value="/listProduct/viewProduct/${addproduct.id}" var="url1"></spring:url> --%>
				<td>
				
				<a href="${getid}" class="btn btn-outline-success data-toggle="tooltip""><i class="fa fa-info" ></i></a>
				
                </td>
                <td>
                <a href="<c:url value="/cart/add/${addproduct.id}"/>" class="btn btn-outline-info"><i class="fa fa-shopping-cart"></i></a>
                </td>
			</tr>
				</c:forEach>
			 </tbody>
	</table>
</body>
</html>