<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>
<html>
<head>

</head>
<body>
     <%@ include file="navbar.jsp"%>
	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1>Product Detail</h1>

				<p class="lead">Here is the detail information of the product!</p>
			</div>
           <hr/>
			<div class="container">
				<div class="row">
					<div class="col-md-5">
						<img src='<c:url value="/resource/images/${products.id}.png"/>' class="img-fluid" alt="image" 
					     style="width:63%;height:80%" />
					</div>

					<div class="col-md-5">
						<h3>${products.productname}</h3>
						<strong>Description:</strong><p style="background-color:#f1c40f;border-radius: ;padding: 10px">${products.description}</p>
     					<p>
						<strong>Category</strong> : ${products.category}
						</p>
						<p>
						<strong>Manufacturer</strong> : ${products.manufacturer}
						</p>
						<%-- <p>
							<strong>Condition</strong> : ${product.productCondition}
						</p> --%>
						<h4><i class="fa fa-inr fa-1x" aria-hidden="true"></i>${products.price}</h4>
						
					</div>
				</div>
			</div>
</body>
</html>







