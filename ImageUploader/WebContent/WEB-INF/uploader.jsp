<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>title here</title>
</head>
<body>
	 <form method="post" action="/ImageUploader" enctype="multipart/form-data">
		<input type="file" name="fileImg" >
		<input type="submit" value="Upload">
	</form>
	<br><br>

	<img alt="image" src="saved_image/image1.jpg" style="width:304px;height:228px;"> 
	
	${path}
	<c:forEach var="name" items="${pageScope.names}">
		<p>${name}</p>
    	<%--  <img src="${name} style="width:304px;height:228px;">  --%>
	</c:forEach>  
	
</body>
</html>