package kr.or.human3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody



@RestController //위 둘을 합한것과 같다

public class Rest_Ctrl {
	
	@RequestMapping("/a")
//	@ResponseBody 생략가능
	
	public String a() {
		
		return "a";
	}
	
	
	
	
	
	@RequestMapping("/b")
//	@ResponseBody 생략가능
	
	public String b() {
		
		return "b";
	}
	
	
	
	
}
