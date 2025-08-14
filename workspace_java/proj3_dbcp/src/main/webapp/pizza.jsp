<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "get" action = "pizza">
    <select id = "piza_var" name = "pizza_var">
        <option value = "고구마">고구마</option>
        <option value = "감자">감자</option>
        <option value = "치즈">치즈</option>
    </select> <br>
    <div id = "pizza_size">
		big<input type = "radio" value = "big" name = "pizza_size">
		midiun<input type = "radio" value = "midium" name = "pizza_size">
		small<input type = "radio" value = "small" name = "pizza_size">
		</div>
	<br>

    <textarea id ="relist" name = "relist"></textarea>

	<div id = "checkbox_list">
		<h1>토핑 선택</h1>
	    치즈 <input type = "checkbox" value = "치즈" name = "topping" >
	    올리브<input type = "checkbox" value = "올리브" name = "topping">
	    핫소스<input type = "checkbox" value = "핫소스"  name = "topping">
    </div>
	<input type = "submit" value = "전송">    
    
</form>
</body>
</html>