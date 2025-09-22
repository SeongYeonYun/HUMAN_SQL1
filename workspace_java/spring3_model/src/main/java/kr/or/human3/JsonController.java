package kr.or.human3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			
			@RequestBody //get은 안됨,
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
	
	
	@RequestMapping("/ajax3")
	@ResponseBody //가공할게 있으면 가공해서 보낸다???
	public MemberDTO ajax3() {
		MemberDTO dto = new MemberDTO();
		dto.setId("id");
		dto.setPw("pw");
		dto.setName("name");
		dto.setAge(20);
		dto.setTel("010-9696-9696");
//		dto.set 왜 주소 안되지??
		
		return dto;
		}
	
	
	@RequestMapping("/ajax5")
	@ResponseBody //가공할게 있으면 가공해서 보낸다???
	public Map ajax5() {
		MemberDTO dto = new MemberDTO();
		dto.setId("id");
		dto.setPw("pw");
		dto.setName("name");
		dto.setAge(20);
		dto.setTel("010-9696-9696");
//		dto.set 왜 주소 안되지??
		
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", 150);
		map.put("pageNo", 3);
		map.put("keyword", "SCOTT");
		
//		해시 맵은 순서를 보장하지는 않는다.
		
		
		
		return map;
		}
	

		
		
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	

