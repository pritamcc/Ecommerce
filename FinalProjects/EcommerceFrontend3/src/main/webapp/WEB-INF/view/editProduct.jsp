<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>
<%@ page isELIgnored="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <link href="<c:url value="/resource/css/admin.css"/>" rel="stylesheet"></link>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"> 
 <link rel="stylesheet" type="text/css" href="//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.2.0/css/font-awesome.css" />
<title>Admin page</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
<br>
<div class="container" id="border" align="center" style=" background-color:#ecf87f">
<br>
    <%-- <c:url var="url" value="${pageContext.request.contextPath}/admin/productInventory/addProduc"/> --%>
<%-- ${pageContext.request.contextPath}/admin/productInventory/addProduct --%>
<%-- <url:url var="url" value="${pageContext.request.contextPath}/admin/productInventory/addProduct"></url:url> --%>
	<form:form action="${pageContext.request.contextPath}/admin/productInventory/editProduct" modelAttribute="product" 
	  method="POST" enctype="multipart/form-data">
	    <form:hidden path="id" value="${product.id}"/>
		<table>
			<tr>
				<td><label>Product Name:</label></td><form:errors path="productname" cssStyle="color:#ff0000"/>
				<td><form:input path="productname" class="form-control" value="${product.productname}"/></td>
				&nbsp;&nbsp;
				<td><label>Manufacturer:</label></td>
				<td><form:input path="manufacturer" class="form-control" value="${product.manufacturer}" /></td>
			</tr>
			<tr>
				<td><label>category:</label></td>
				<td><form:input path="category" class="form-control" value="${product.category}" /></td>
				&nbsp;&nbsp;
				<td><label>Stock:</label></td><form:errors path="stock" cssStyle="color:#ff0000"/>
				<td><form:input path="stock" class="form-control" value="${product.stock}" /></td>
			</tr>
			<tr>
				<td><label>Description:</label></td>
				<td><form:textarea path="description" class="form-control" value="${product.description}" /></td>
				&nbsp;&nbsp;

				<td><label>Price:</label></td><form:errors path="price" cssStyle="color:#ff0000"/>
				<td><form:textarea path="price" class="form-control" value="${product.price}" /></td>
			</tr>
			<tr>
			   <td><label>Upload Image:</label></td>
			   <td><form:input path="productImage" type="file" class="form:input-large"/></td>
			</tr>
			<tr>
             <td></td>
              <td><br><input type="submit" value="Add Product" align="middle" class="btn btn-outline-dark btn-lg"></td>
             </tr>
		</table>
	</form:form>
	<br/>
	</div>
	<a href="productDetail">Product Detail</a>
</body>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script> 
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" ></script>
</html>