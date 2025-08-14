<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method = "get" action = "Makeaccount">
		id : <input type = "text" name = "id" id = "id"><br>
		pw : <input type = "text" name = "pw" id = "pw"><br>
		pw_check : <input type = "text" name = "pw_check" id = "pw_chk">
		<input type = "submit" value = "submit" id = "submit">
	</form>


</body>
<script>
const pwInput = document.getElementById("pw");
const pwChkInput = document.getElementById("pw_chk");

pwChkInput.addEventListener("blur", function() {
    const pw = pwInput.value;
    const pw_chk = pwChkInput.value;

    if (pw != pw_chk) {
        alert("비밀번호가 일치하지 않습니다.");
    }
});
       




</script>
</html>