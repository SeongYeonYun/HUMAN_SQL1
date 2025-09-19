package kr.or.human3;

import java.lang.System.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mes") //클래스 위에 쓰면 무조건 이리로 들어옴
public class MesController {
//	@RequestMapping("/mes/bom")
//	public String bom() {
//		return "bom";
//	}
//	
//	
//	@RequestMapping("/mes/standard")
//	public String standard() {
//		return "standard";
//	}
	
	
	//CSR : Client Side Rendering -> 클라이언트를 분할해서 그린다
	
	
	
	//SSR : Server Side Rendering -> 서버를 분할해서 그린다.
	
	@RequestMapping("/bom")
	public String bom() {
		System.out.println("bom start");
		return "bom";
	}
	
	
	@RequestMapping("/standard")
	public String standard() {
		System.out.println("standard start");
		return "standard";
	}
	
	
	
	
	
	
	
	
}
