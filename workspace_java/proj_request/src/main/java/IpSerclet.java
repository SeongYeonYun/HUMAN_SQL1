

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IpSerclet
 */
//@WebServlet("/Ip")

public class IpSerclet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IpSerclet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Ip doget 실행");
		
	
		
		
		String ip = request.getRemoteAddr(); //접속한 사람의 주소값을 가져와 주는 기능
		System.out.println(ip);
		
		//ip 밴
//		String bannedip = "0:0:0:0:0:0:0:1";
//		String bannedip = "localhost"; 
		//이거 왜 안되지?
		
//		if (ip.equals(bannedip)) {
//            response.setStatus(HttpServletResponse.SC_FORBIDDEN); // 403
//            response.getWriter().println("Access Denied: Your IP is banned.");
//            return; // 더 이상 처리 안 함
//        }

		
		//접근 method확인
		System.out.println("getMethod=" + request.getMethod());
		
		//접근 주소 전체 , 단 쿼리 스티링 제외(url을 보면 ?뒤에 나온 것들)
		System.out.println("getRequestURL=" + request.getRequestURI());
		
		//쿼리스트링만 가져오기
		System.out.println("getQueryString=" + request.getQueryString());
		
		System.out.println("getRequestURI=" + request.getRequestURI());
		//URL vs URI
		
		
		
		//프로젝트를 구분하는 주소
		System.out.println("getcontextpath = "+ request.getContextPath() );
		
		//서블릿 주소만
		System.out.println("ServletPath = " + request.getServletPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
