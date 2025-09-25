<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- nav에서 동적으로 바뀌어야함 -->
<title>	<tiles:insertAttribute name = "title" /></title>






<style>

    /* 기존(주석 처리): flex 비율로 2:8
.side{    /* flex: 2 0 0; */ }
.content{ /* flex: 8 0 0; min-width:0; */ }
*/

/* 공통 */
body{ margin:0; }

/* 컨테이너: 가로 정렬만 담당 */
.main_wrapper{
  display:flex;
  width:100%;
}

/* 디버깅 테두리는 실제 자식에만 */
.main_wrapper > *{
  box-sizing:border-box;
/*   border:1px solid red; */
}

/* 변경: width로 비율 고정 (2:8) */
.side{
  width:20%;
  flex:none;         /* width 그대로 쓰게: 0 0 auto */
}
.content{
  width:80%;
  flex:none;         /* width 그대로 쓰게 */
  min-width:0;       /* 긴 내용 줄바꿈/수축 허용 */
  /* overflow:auto;  // 긴 표/코드에 스크롤 원하면 주석 해제 */
}
    
</style>


<script>
	window.onload = function(){
		alert(1)
	}
	
	window.addEventListener("load", function()){
		
		alert(11)
		
	}

</script>
</head>
<body>

<!-- 기존에 페이지를 불러오던 방식 -->
<%-- <%@import  %> --%>
<%-- <jsp:include page> --%>

<!-- header -->
<header>
	<tiles:insertAttribute name = "header" />
</header>



<!-- main -->	
<section class = "main_wrapper">

	<!-- sidemenu -->

	<aside class = "side">
	<tiles:insertAttribute name = "side" />
	</aside>
	
	<!-- content -->
	<article class = "content">
	<tiles:insertAttribute name = "content" />
	</article>




</section>



<!-- footer -->	

<footer>
	<tiles:insertAttribute name = "footer" />
</footer>

</body>
</html>