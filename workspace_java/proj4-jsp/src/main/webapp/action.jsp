<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <namespace:func> -->
	<jsp:include page = "header.jsp"></jsp:include>
	<jsp:include page = "jsp.jsp">
<%-- 		<jsp:param name = "name" value = "abcd"> </jsp:param> --%>
		<jsp:param name = "name" value = "abcd" /> 
	</jsp:include>
</body>
</html>