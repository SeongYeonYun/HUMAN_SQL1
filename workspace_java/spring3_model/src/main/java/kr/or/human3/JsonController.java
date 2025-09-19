package kr.or.human3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {
	
	
	@RequestMapping("/ajax.do")
	public String ajax() {
		return "ajax";
	}
	
	
	@RequestMapping("/ajax1")
	public String ajax1(
			@RequestParam(value = "id", required = false)
			String id,
			
			@RequestBody //get은 안됨
			MemberDTO dto
			
			) {
		
		System.out.println("id = " + id); //키가 없기떄문에 해석을 못함
		System.out.println("dto = " + dto); //키가 없기떄문에 해석을 못함
		return "ajax";
	}
	
	
	
	
	@RequestMapping("/ajax2")
	@ResponseBody //가공할게 있으면 가공해서 보낸다???
	public String ajax2() {
		
		
		return "ajax";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
