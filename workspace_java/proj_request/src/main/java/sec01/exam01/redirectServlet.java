package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class redirectServlet
 */
@WebServlet("/redirect")
public class redirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public redirectServlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("redirectservlet do get");
		
		//요청할떄 한글 꺠짐 방지
		request.setCharacterEncoding("utf-8");
		
		//응답할떄 한글 꺠짐 방지
		response.setContentType("text/html;charset=utf-8");
		
		
		String text = request .getParameter("text");
		System.out.println("text : " + text);
		
		response.sendRedirect("/proj_request/another"); 
		//주소를 브라우저가 이해하고 넘어가기 때문에 브라우저 기준으로 적는다
	}
	
	//forward 방식은 내용을 전달할수는있지만 url이 바뀌지 않고 
	//redirect방식은 url이 바뀌지만 내용이  전달되지 않는다. re


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("redirectservlet do post");
		String text = request .getParameter("text");
		System.out.println("text : " + text);
		
		response.sendRedirect("/proj_request/another"); 
		// -> get방식으로 받아짐
		//주소를 브라우저가 이해하고 넘어가기 때문에 브라우저 기준으로 적는다
	}

}
