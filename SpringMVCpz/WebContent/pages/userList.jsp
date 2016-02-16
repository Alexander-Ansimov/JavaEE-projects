<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Users</title>
</head>
<body>
Hi !!!!!!!!<br>

<table>
	<tr>
		<td>User id</td>
		<td>First name</td>
		<td>Last Name</td>
		<td> Age </td>
		<td>E-mail</td>
	</tr>
	
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.id}</td>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
			<td>${user.age}</td>
			<td>${user.email}</td>	
		</tr>		
	</c:forEach>
	
	
</table>

</body>
</html>