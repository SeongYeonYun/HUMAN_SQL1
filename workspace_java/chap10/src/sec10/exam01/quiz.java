package sec10.exam01;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    // 문제1
        // blog.naver.co.kr에서 naver만 추출하기
		String url = "blog.naver.co.kr";
		String name = "naver";
		
		
//		System.out.println(url.indexOf(name));
//		for (int x =url.indexOf(name) ; x < url.indexOf(name)+ name.length(); x++) {
//				//			substring로 다음 "."까지 추출을 하면 됨
//			System.out.print(url.charAt(x));
//			
//		}
		
		//문제 2
//		String text = "Hello World";
//
//		for (int x = 0 ; x <3;x++) {
//
//			if (x == 0) {text = text.substring(1,text.length()) +" "+text.substring(0,1);}
//			else {   text = text.substring(1,text.length()) +text.substring(0,1);}
//			System.out.println(text);
//		}
		
		
		
		
		//문제 3
        // humanec@naver.com 이걸
        // hu*@naver.com 이케이케
        // love@naver.com 이것도
        // lo**@naver.com 이케이케
		String url_1 = "humanec@naver.com";
		String url_2 = "love@naver.com";
		String q = "";
//		String q = "";
		
		System.out.println(url_1.substring(2, url_1.indexOf("@")).length());
		for (int x = 0; x<=url_1.length()-1;x++ ) {
			if(x>=2 && x<url_1.indexOf("@")) {
				q = q +"*";
			} else {q = q+   url_1.charAt(x);}
		}
		System.out.println(q);
		
//		char[] charArray = url_1.toCharArray();  // 문자열을 문자 배열로 변환
	    
		// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=1234&ackey=1oiioasi
	    // 키 query의 값이 검색어
	    // 검색어만 출력 
		String url_3 = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=1234&ackey=1oiioasi";
		System.out.println(url_3.substring(url_3.indexOf("query")+6,url_3.indexOf("ackey") - 1)); //d
//		url_3.indexOf("query") + 5
		
		
		url_3.substring(url_3.indexOf("query"),url_3.indexOf("query") + 5);
		
		
		

	}

}
