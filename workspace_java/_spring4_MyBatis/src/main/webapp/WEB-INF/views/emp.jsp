<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp2 회원 목록</title>
</head>
<body>
<div>
	<form method = "get" action = "search">
		<select name = "type">
			<option value = "1">ename</option>>
			<option value = "2">job</option>>
			
		</select>
	
	
		<input type = "text" name = "keyword"><br>
<!-- 		<input type = "text" name = "job"><br> -->
		<input type = "submit" value = "검색">
	</form>
</div>

<table border = 1>


	<tr>
		<th>emono</th>
		<th>ename</th>
		<th>sal</th>
		<th>job</th>
	
	</tr>
	<c:if test = "${not empty list}">
		<c:forEach var = "empDTO" items = "${list}">
			<tr>
				<td> ${empDTO.empno} </td> 
				<td> ${empDTO.ename} </td> 
				<td> ${empDTO.sal}</td> 
				<td> ${empDTO.job}</td> 
			</tr>		
	
	
		</c:forEach>

		
			
	</c:if>
		<c:if test = "${empty list}">
		<tr>
			<td colspan = "4">조회 내역이 없습니다.</td> 
		</tr>
		
			
	</c:if>
	
	
	
	
	
	
	
</table>

<!--  delete  -->
<!-- <form method = GET action = "/human4/delete"> -->
<!-- 	<input type = "submit" value = "삭제하기" > -->
<!-- 	<input type = "text" name = "empno"> -->
<!-- </form> -->


<!--  insert -->
<!-- <form method = post action = "/human4/join"> -->
<!-- 	<input type = "submit" value = "추가하기" > -->
<!-- </form> -->


<!--  update  -->

</body>
</html>