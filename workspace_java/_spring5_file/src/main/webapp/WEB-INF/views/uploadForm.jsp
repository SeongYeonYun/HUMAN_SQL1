<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h1>파일 한개</h1>
	<form method="post" action="upload" enctype="multipart/form-data" accept-charset="utf-8">
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		파일첨부 : <input type="file" name="file1"><br>
		
		<input type="submit" value="등록">
	</form>
	
	
	
	
	
	
	 <h1>파일 여러개</h1>
		<form method="post" action="upload" enctype="multipart/form-data" accept-charset="utf-8">
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		파일첨부 : <input type="file" name="file1" multiple = "multiple"><br> <!--  여러개 선택 가능 -->
		
		<input type="submit" value="등록">
	</form>
	
	
	
	

</body>
</html>