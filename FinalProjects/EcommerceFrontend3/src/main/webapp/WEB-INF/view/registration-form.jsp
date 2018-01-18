<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">

<style type="text/css">
  
</style>
<title>Registration Form</title>
</head>


<body style ="background-color: #FDF4E3">
    	    <%@ include file="navbar.jsp"%>
	<h3>Registration Form</h3>
	<div class="container" style="background-color:/*  #FF8457 */">
		<form:form action="SaveCustomer" modelAttribute="customer"
			method="POST">
			<div>
				<strong><center>User Details</center></strong>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>First Name</label>
					<form:errors  path="firstName" cssStyle="color:#ff0000"/>
					<form:input path="firstName" class="form-control"
						placeholder="Enter name" />
				</div>
				<div class="form-group col-md-6">
					<label>Last Name</label>
					<form:errors  path="lastName" cssStyle="color:#ff0000"/>
					<form:input path="lastName" class="form-control"
						placeholder="Last name" />
				</div>

				<div class="form-group col-md-6">
					<label>Email Id</label>
					<form:input path="users.emailId" class="form-control"
						placeholder="@xyz.com" />
				</div>
				<div class="form-group col-md-6">
					<label>Contact</label>
					<form:errors  path="customerPhone" cssStyle="color:#ff0000"/>
					<form:input path="customerPhone" class="form-control"
						placeholder="" />
				</div>
			</div>
			<hr>
			<strong><center>Shipping Address</center></strong>
			
			<div class="form-group">
				<label>Address</label>
				<form:errors path="shippingAddress.address" cssStyle="color:#ff0000"/>
				<form:textarea path="shippingAddress.address" class="form-control"
					placeholder="Address" />
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label>City</label>
					<form:errors path="shippingAddress.city" cssStyle="color:#ff0000"/>
					<form:input path="shippingAddress.city" class="form-control"
						placeholder="City" />
				</div>
				<div class="form-group col-md-6">
					<label>State</label>
					<form:errors path="shippingAddress.state" cssStyle="color:#ff0000"/>
					<form:input path="shippingAddress.state" class="form-control"
						placeholder="State" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Country</label>
					<form:input path="shippingAddress.country" class="form-control"
						placeholder="Country" />
				</div>
				<div class="form-group col-md-6">
					<label>Zipcode</label>
					<form:input path="shippingAddress.zipcode" class="form-control"
						placeholder="Zipcode" />
				</div>
			</div>
			<hr>
			<strong><center>Billing Address</center></strong>
			<div class="form-group">
				<label>Address</label>
				<form:input path="billingAddress.address" class="form-control"
					placeholder="Address" />
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label>City</label>
					<form:input path="billingAddress.city" class="form-control"
						placeholder="City" />
				</div>
				<div class="form-group col-md-6">
					<label>State</label>
					<form:input path="billingAddress.state" class="form-control"
						placeholder="State" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Country</label>
					<form:input path="billingAddress.country" class="form-control"
						placeholder="Country" />
				</div>
				<div class="form-group col-md-6">
					<label>Zipcode</label>
					<form:input path="billingAddress.zipcode" class="form-control"
						placeholder="Zipcode" />
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Password</label>
					<form:password path="users.password" class="form-control"
						placeholder="********" id="pass" />
				</div>
				<div class="form-group col-md-6">
					<label>Password</label>
					<form:password path="users.password" class="form-control"
						placeholder="********" id="confirmpass" />
				</div>
			</div>
			<div class="form-actions">
				<center><button type="submit" class="btn btn-lg btn-info"
					onclick="return Validate()">Submit</button></center>
			</div>

		</form:form>
	</div>
	<!-- Validating Password -->
	<script type="text/javascript">
		function Validate() {
			var password = document.getElementById("pass").value;
			var confirmpass = document.getElementById("confirmpass").value;
			if (password != confirmpass) {
				alert("Password does Not Match.");
				return false;
			}
			return true;
		}
	</script>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</html>