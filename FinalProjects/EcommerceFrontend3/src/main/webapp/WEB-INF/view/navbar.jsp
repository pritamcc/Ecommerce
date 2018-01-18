<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="shortcut icon"
	href="<c:url value="/resource/images/icon.png"/>" type="image/x-icon" />
<link href="https://fonts.googleapis.com/css?family=Cambo|Joti+One"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<%--    <!-- Main CSS -->
    <link href="<c:url value="/resource/css/main.css" />" rel="stylesheet"> --%>
<title>VoidWatches</title>
<script src="https://use.fontawesome.com/512e7150fb.js" /></script>

<style>
body {
	font-family: font-family : 'Joti One', cursive;
	font-family: 'Cambo', serif;
	height: 80vh;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar navbar-light"
		style="background-color: #FF4500;">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<a class="navbar-brand" href="/EcommerceFrontend3"> <img
		src="<c:url value="/resource/images/logo.png"/>" height="200px"
		width="100px"
		class="d-inline-block align-top img-fluid rounded border border-white"
		alt="Logo">
	</a>

	<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			<li class="nav-item active"><a class="nav-link"
				href="<c:url value="/EcommerceFrontend3"/>">Home</a></li>

			<security:authorize access="hasRole('USER')">
				<li class="nav-item active"><a class="nav-link"
					href="<c:url value="/listProduct"/>">Products</a></li>
			</security:authorize>
			<li class="nav-item active"><a class="nav-link"
				href='<c:url value="index"></c:url>'>About us</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${pageContext.request.userPrincipal.name != null}">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">
						${pageContext.request.userPrincipal.name}</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						
						<security:authorize access="hasRole('USER')">
							<a class="dropdown-item" href="#">Account</a>
							<a href="<c:url value="/cart"/>" class="dropdown-item"><i
								class="fa fa-shopping-cart">My Cart</i></a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="<c:url value="/login?logout"/>">Logout</a>
							<a class="dropdown-item" href="#">Help</a>
						</security:authorize>
					
					</div>
			   </li>


				<security:authorize access="hasRole('ADMIN')">
					<li><a href="<c:url value="/admin"/>" style="color: black"
						class="btn btn-outline-light"> <i class="fa fa-lock fa-1x"></i>Admin
					</a></li>
				</security:authorize>
				<li>
			</c:if>
			&nbsp;&nbsp;
			<c:if test="${pageContext.request.userPrincipal.name == null}">
				<li><a href="<c:url value="/login"/>" style="color: black"
					class="btn btn-outline-light">Sign in</a></li>&nbsp;&nbsp;
			<li><a href="<c:url value="/registrationForm"/>"
					style="color: black" class="btn btn-outline-light"> <i
						class="fa fa-user-plus fa-1x"></i>Sign up
				</a></li>
			</c:if>
		</ul>

	</div>
	</nav>
</body>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</html>