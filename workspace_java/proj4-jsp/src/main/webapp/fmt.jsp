<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import = "java.util.Date"%>

<!-- fmt호출  -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	new Date() : <%= new Date() %>
	
	<hr>
	
	<fmt:formatDate value = "<%= new Date() %>" 
	pattern = "yyyy/mm/dd a hh시 mm분 ss.SSS초" />

</body>
</html>