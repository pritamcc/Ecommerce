<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<html>
<head>
</head>
<title>Product Inventory</title>
<body>
	<%@ include file="navbar.jsp"%>
	<br />
	<h3>All Products</h3>
	
	<table class="table table-sm ">
		<thead class="thead-light">
			<tr>
				<th>Photo Thumb</th>
				<th>Product Name</th>
				<th>Manufacturer</th>
				<th>Description</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="addproduct" items="${products}">
                
                <!-- construct an "detail" link with customer id -->
				<c:url var="getid" value="/listProduct/viewProduct/">
					<c:param name="productId" value="${addproduct.id}" />
				</c:url>

				<!-- construct an "delete" link with customer id -->
				<c:url var="deleteLink" value="/admin/productInventory/deleteProduct">
					<c:param name="productId" value="${addproduct.id}" />
				</c:url>

				<tr>
					<td><img src="#" alt="image" /></td>
					<td>${addproduct.productname}</td>
					<td>${addproduct.manufacturer}</td>
					<td>${addproduct.description}</td>
					<td>${addproduct.price}</td>
					<%-- <spring:url value="/listProduct/viewProduct/${addproduct.id}" var="url1"></spring:url> --%>

					<td>
					<a href="${getid}"><i class="fa fa-info"></i></a>
					<a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete Product?'))) return false"><i class="fa fa-trash-o"></i></a>
					</td>
				</tr>
				</c:forEach>
		</tbody>
	</table>
	<a href='<c:url value="/admin/productInventory/addProduct"/>' class="btn btn-primary">Add Product</a>
</body>
</html>