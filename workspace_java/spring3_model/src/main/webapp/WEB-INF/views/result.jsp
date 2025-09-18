<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입결과</title>
<!--  jsp는 바뀔수 있는 데이터(동적 데이터), tomcat(was)은 동적 데이터를 처리, apatch(ws)는 정적 데이털르 처리한다.
아파지(ws)에서도 동적 데이터를 다루는 경우가 드물게 있다. AOP(filter) 관점지향 프로그래밍, 인터셉터( 전과 후에 요청과 응답을 참조하거나 가공할수 있는 일종의 필터),
 handler Mapping(요청된 주소를 보고 클레서를 찾아줌), 핸들러 어탭터(메소드를 찾아줌) -->
</head>
<body>

	<h1>어서오세요</h1>
<%-- 	당신의 id  = ${ id} <br> --%>
<%-- 	당신의 id : ${memberDTO["id"]} <br> --%>
	당신의 id : ${memberDTO.id} <br>
	당신의 pw : ${memberDTO.pw} <br>
	당신의 name : ${memberDTO.name}<br> 
	당신의 age : ${memberDTO.age} <br>
----------------------------------------------


	

</body>
</html>