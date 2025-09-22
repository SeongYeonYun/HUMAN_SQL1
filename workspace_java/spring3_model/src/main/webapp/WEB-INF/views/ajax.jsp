<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1> ajax.jsp 연습 </h1>
	<button type = "button" id = "btn">ajax 실핼</button>
	<script>
	
	document.querySelector("#btn").addEventListener("click", function(){
		console.log("click")
		
		let data = {
			id : "abcd"
// 			pw : "sdsd"
			
			
		}
		
		console.log(data)
		console.log('' + data) //그냥 json을 보냈을떄 서버가 받는 글씨
		console.log(JSON.stringify(data))
		
		
		
		
		const xhr = new XMLHttpRequest()
// 		xhr.open('post' , 'ajax1')
		xhr.open('post' , 'ajax5')
		xhr.setRequestHeader('Content-type', 'application/json')
		xhr.send(JSON.stringify(data))
		xhr.onload = function(){
			 console.log(xhr.responseText)
		}
		
	})
	
	</script>


</body>
</html>