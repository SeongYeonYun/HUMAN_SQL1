package kr.or.human3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/main")
	// public void main(Model model, HttpServletRequest req) {  // 이전: void라 return 사용 불가
	public String main(Model model, HttpServletRequest req) {   // 수정: 뷰 이름을 반환하려면 String
		System.out.println("/main");
		
		model.addAttribute("id", "abcd"); // id에 abcd값을 담음
		HttpSession Session = req.getSession();
		Session.setAttribute("level", "admin");
		
		// return "main"   // 이전: 세미콜론 누락 + 위가 void면 컴파일 에러
		return "main";     // 수정: 뷰리졸버 설정 기준으로 main.jsp로 포워드
	}
}

