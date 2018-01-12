<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head></head>
<body>
     <%@ include file="navbar.jsp"%>
	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>Product Detail</h1>

				<p class="lead">Here is the detail information of the product!</p>
			</div>
           <hr/>
			<div class="container" ng-app = "cartApp">
				<div class="row">
					<div class="col-md-5">
						<img src='<c:url value="/resource/images/${products.id}.png"/>' alt="image" 
					     style="width:90%;height:90%" />
					</div>

					<div class="col-md-5">
						<h3>${products.productname}</h3>
						<p>${products.description}</p>
						<p>
							<strong>Manufacturer</strong> : ${products.manufacturer}
						</p>
						<p>
							<strong>Category</strong> : ${products.category}
						</p>
						<%-- <p>
							<strong>Condition</strong> : ${product.productCondition}
						</p> --%>
						<h4><i class="fa fa-inr fa-1x" aria-hidden="true"></i>${products.price}</h4>
					     <c:set var="role" scope="page" value="${param.role}" />
					      <c:set var="url" scope="page" value="/listProduct" />
					       <c:if test="${role='admin'}">
                             <c:set var="url" scope="page" value="/admin/productInventory" />
                           </c:if>
                           
                           <p ng-controller="cartCtrl">
                        <a href="<c:url value="${url}" />" class="btn btn-default">Back</a>
                        <a href="#" class="btn btn-warning btn-large"
                           ng-click="addToCart('${products.id}')">Order Now</a>
                        <a href="<c:url value="/cart" />" class="btn btn-lights"><span class="glyphicon glyphicon-hand-right"></span>View Cart</a>
                         </p>
					</div>
				</div>
			</div>
</body>
<script src="<c:url value="/resource/js/controller.js" />"></script>
</html>







