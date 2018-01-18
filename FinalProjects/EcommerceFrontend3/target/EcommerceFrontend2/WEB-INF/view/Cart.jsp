<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>

<%@ include file="navbar.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title></head>
<body>



<div class="container">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
						    
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center">Subtotal</th>
							<th style="width:10%">Actions</th>
						</tr>
					</thead>
					<tbody>
					    
					    <c:forEach items="${cartList}" var="cart">
	

												
					    
						<tr>
						
							<td data-th="product">
								<div class="row">
									<div class="col-sm-2 hidden-xs">
									
	<url:url value="/resources/images/${cart.product_id}.png" var="url"></url:url>
<img src="${url }" height="50" width="50">
									
									<!--  <img alt="$ {}"  src="<url:url value="/resources/images/${cart.cart_id}.png" var="url"></url:url>"  class="img-responsive"/></div>-->
									<div class="col-sm-10">
										<h4 class="nomargin">${cart.product_name}</h4>
									
									</div>
								</div>
							</td>
							<td data-th="Price">${cart.price}</td>
							<td data-th="Quantity">
								<input type="number" class="form-control text-center" value='${cart.quantity}'>
							</td>
							<td data-th="Subtotal" class="text-center">${cart.price * cart.quantity}</td>
							
								
								<button onclick="cart/deleteCart/${cart.cart_id}" class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i></button>
							   <td align="left"><a href="<c:url value='cart/deleteCart/${cart.cart_id}'/>">Delete</a></td>
							
							<!--<url:url value="cart/deleteCart/${product.id}" var="url20">
							<td><a href="${url20 }"><span class="glyphicon glyphicon-trash"></span></a></url:url></td>-->
							
							
							</td>
						</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr class="visible-xs">
							<td class="text-center"><strong> Rs.</strong></td>
						</tr>
						<tr>
							<td><a href="/EcommerceFrontend3" class="btn btn-warning"><i class="fa fa-angle-left"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total Rs. ${totalAmount}</strong></td>
							<td><a href="CheckOut" class="btn btn-success btn-block">Checkout <i class="fa fa-angle-right"></i></a>
			
					</td>
						</tr>
					</tfoot>
				</table>
</div>
</body>

</head>
</html>
