package kr.or.human3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamCtrl {
	// WEB-INF 아래는 직접 URL 접근 불가 (forward로만 접근)

	@RequestMapping("/join1.do") // 해당 주소로 보낸다
	public void joinForm(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/join2.do")
	public ModelAndView joinForm2() {
		ModelAndView mav = new ModelAndView();
		// request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response); 의 앞의 경로를 처리해줌
		mav.setViewName("join");
		return mav;
	}

	@RequestMapping("/join3.do")
	public ModelAndView joinForm3() {
		ModelAndView mav = new ModelAndView();
		// request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response); 의 앞의 경로를 처리해줌
		mav.setViewName("join");
		return mav;
	}

	@RequestMapping("/join2")
	public void join1(HttpServletRequest request, HttpServletResponse response) {


		String id = request.getParameter("id");
		System.out.println("id = " + id);

		request.setAttribute("id", id);

		try {
			request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
//		ModelAndView mav = new ModelAndView("result");
//		mav.addObject("id", id);
//		return mav;
	}
	
	
	@RequestMapping("/join4")
	public ModelAndView join4(HttpServletRequest request) {
	    MemberDTO memberDTO = new MemberDTO();
	    try {
	        String id = request.getParameter("id");
	        String name = request.getParameter("name");
	        String pw = request.getParameter("pw");
	        String sAge = request.getParameter("age");

	        // 수정: null/빈문자 방어 + 숫자 변환 검증
	        if (sAge == null || sAge.isBlank()) {
	            // 원인: age 파라미터 누락 → 이전 NFE의 근본 원인
	            throw new IllegalArgumentException("age 파라미터가 없습니다.");
	        }
	        int age;
	        try {
	            age = Integer.parseInt(sAge.trim());
	        } catch (NumberFormatException e) {
	            throw new IllegalArgumentException("age는 정수여야 합니다.");
	        }

	        // DTO 채우기(이전 코드에 없음 → JSP에서 값 못 씀)
	        memberDTO.setId(id);
	        memberDTO.setName(name);
	        memberDTO.setPw(pw);
	        memberDTO.setAge(age);

	    } catch (Exception e) {
	        e.printStackTrace();
	        // 필요 시 에러 메시지도 JSP로 전달하고 싶으면 ModelAndView에 추가
	        // (뷰에서 ${error}로 표시)
	        // 아래 mav에 addObject("error", e.getMessage()) 추가 가능
	    }

	    // 기존(오타): "reuslt" → 404/뷰매핑 실패 가능
	    // ModelAndView mav = new ModelAndView("reuslt");
	    ModelAndView mav = new ModelAndView("result"); // 오타 수정

	    mav.addObject("memberDTO", memberDTO);
	    // 에러 메시지 전달 원하면 주석 해제
	    // mav.addObject("error", "값을 확인하세요.");
	    return mav;
	}


//	@RequestMapping("/join4")
//	public ModelAndView join4(HttpServletRequest request) {
//		MemberDTO memberDTO = new MemberDTO();
//	try {
//		String id = request.getParameter("id");
//		String name = request.getParameter("name");
//		String pw = request.getParameter("pw");
//		String sAge = request.getParameter("age");
//		int age = Integer.parseInt(sAge);
//	}catch(Exception e) {
//		e.printStackTrace();
//		}
//	
//	
//	ModelAndView mav = new ModelAndView("result");
//	mav.addObject("memberDTO", memberDTO);
//	return mav;
//
//	}
	
	
	
//	@RequestMapping("/join5")
//	public ModelAndView join5(
//			@RequestParam("id")
//			String id,
//			@RequestParam("pw")
//			String pw,
//			
//			//required = false , null값을 허용, 
//			@RequestParam(value = "name", required = false)
//			String name
//			
//			
//			) {
//		System.out.println("id : " + id);
//		System.out.println("pw : " + pw);
//		System.out.println("name : " + name);
//		ModelAndView mav = new ModelAndView("result");
//		return mav;
//		
//	}

//	@RequestMapping(value={"/join5", "/join5.do"}, //두가지 form 둘다 반영 
//    method=org.springframework.web.bind.annotation.RequestMethod.POST)	
	@RequestMapping("/join5")

		public ModelAndView join5(
		        @RequestParam("id") String id,
		        @RequestParam("pw") String pw,
		        @RequestParam(value="name", required=false) String name,
		        @RequestParam(value="age",  required=false) Integer age
		) {
		    System.out.println("id : " + id);
		    System.out.println("pw : " + pw);
		    System.out.println("name : " + name);
		    System.out.println("age : " + age);

		    // 기존: 모델 비어 있음
		    // ModelAndView mav = new ModelAndView("result");
		    // return mav;

		    // 수정: JSP에서 쓸 값 넣기
		    ModelAndView mav = new ModelAndView("result");
//		    mav.addObject("id", id); // ${id}

		    MemberDTO memberDTO = new MemberDTO();
		    memberDTO.setId(id);
		    memberDTO.setPw(pw);
		    memberDTO.setName(name);
		    if (age != null) memberDTO.setAge(age);
		    mav.addObject("memberDTO", memberDTO); // ${memberDTO.id}

		    return mav;
		}
	
////////////////////////////////////////////////////////////////////////////////////	
	@RequestMapping("/join6")

	public ModelAndView join6(
		@ModelAttribute
		MemberDTO dto1,
		
		
		@ModelAttribute("memberDTO")		
		MemberDTO dto2,
		
		
		//@ModelAttribute 생략 가능함, 생략하면 타입(클래스)의 앞글자만 소문자로 변경한 key로 모델에 넣어줌
		MemberDTO dto3
			
			
			
			) {
	    ModelAndView mav = new ModelAndView("result");
		mav.addObject("memberDTO", dto1);
		mav.addObject("memberDTO", dto2);
		System.out.println("dto1 : " + dto1);
		System.out.println("dto2 : " + dto2);
		System.out.println("dto3 : " + dto3);

	    return mav;
	    
	}	

	
	
	@RequestMapping("/join7")
	public void join7(String id, MemberDTO dto) {
		
	}
	
	
	
	
	
	
	
	
	
	
		
		


	
	}
	
	
	
	
	
	
	
	

