<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="addcart" method="get">
		Name : <input type=text name=name /><br> Price: <input type=text
			name=price /><br> QoH : <input type=text name=qoh /><br>
		<input type=submit value="Add Product">

	</form>

	<tr>
		<thead>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>QoH</th>

		</thead>
		

	</tr>
</body>
</html>