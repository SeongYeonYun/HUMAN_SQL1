package kr.or.human2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human2.service.MemberService;

@Controller
//@Controller이 MemberController을 bean으로 등록함, 2 /member 를 실행하기 위해 속해있는 녀석을 먼저 생성
public class MemberController { 
	
	@Autowired
	MemberService memberService;
	
	MemberController(){
		System.out.println("멤버 컨트롤러 생성자 실행");
	}	
	
	@RequestMapping("/member") //1 먼저 여길 찾음
	//    /member라는 주소로 들어오면 아래것들이 실행됨
	String listMember() {
		System.out.println(" MemberController listMember 실행 ");

		
//		MemberService = new MemberService();
		List list = memberService.getList();
		System.out.println("list : " + list);
		
		
		return "home";
		// 3 마지막으로 실행됨
		

		
	}

}
