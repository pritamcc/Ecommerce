<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin page</title>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<br/>
	<h3>Administrator page</h3>
	This is the administrator  page
	<hr>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	        <h2>
	            Welcom:${pageContext.request.userPrincipal.name}|<a href="<c:url value="/login?logout"/>">Logout</a>
	        </h2>
	</c:if>
	<h3>
	<a href='<c:url value="/admin/productInventory"/>'>Product Inventory</a>
	</h3>
	<p>
	    here you can check and modify the product inventory
	</p>
</body>
</html>