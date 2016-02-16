<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/save" method="post" >
	<table>
		<tr><td>First name : </td><td><input type="text" name="firstName" value="${user.firstName}"></td></tr>
		<tr><td>Last name : </td><td><input type="text" name="lastName" value="${user.lastName}"></td></tr>
		<tr><td>Age : </td><td><input type="text" name="age" value="${user.age}"></td></tr>
		<tr><td>E-mail : </td><td><input type="text" name="email" value="${user.email}"></td></tr>
		<tr><td>Role : </td><td>
			<select name="role">
				<option value="USER">User</option>
				<option value="ADMIN">Admin</option>
				<option value="SUPER_ADMIN">Super admin</option>
			</select>
		</td></tr>
		<tr><td>
			<c:if test="${user.id != null}">
				<input type="hidden" name="id" value="${user.id}">
			</c:if>		
		</td><input type="submit" value="Add"> </tr>
	</table>
</form>

</body>
</html>