<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page here</title>
</head>
<body>

	<fieldset name="Add Product">
		<form action="addProduct">
			Name <input name="name"> <br> Price <input name="price">
			<br> QoH <input name="qoh"> <br> <input
				type="submit" value="Add">
		</form>
	</fieldset>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
			<th>QoH</th>
			<th>Action</th>
		</tr>
		<c:forEach var="p" items="${productList}">
			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${p.price}</td>
				<td>${p.qoh}</td>
				<td>Remove</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>



