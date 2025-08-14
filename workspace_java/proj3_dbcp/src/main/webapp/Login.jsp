<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
	
<form method = "get" action = "login">
	ID <input type = "text" name = "ID"><br>
	<h1><%= request.getAttribute("message1") != null ? request.getAttribute("message1") : "" %></h1>
	PW <input type = "text" name = "PW"><br>
	
	<h1><%= request.getAttribute("message2") != null ? request.getAttribute("message2") : "" %></h1>
	<a href = "pizza.jsp"><input type = "submit" name = "login_btn" value = "login"></a> 
	
	<button name = "회원가입"><a href = "Makeaccount.jsp">회원가입</a></button>
</form>




	

</body>
</html>