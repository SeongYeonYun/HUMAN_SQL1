package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/Req")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("DO get 실행");
		
		String num1 = request.getParameter("num1"); //브라우저에서 해당 값을 가져오기
		System.out.println("num실행=" + num1);
		
		String[] chks = request.getParameterValues("chk");
//		String chk = request.getParameters("chk");
		System.out.println(chks);
		
		
		String hival = request.getParameter("hidden");
		System.out.println(hival);
		
		String radio = request.getParameter("radio1");
		System.out.println(radio);
		
		String date = request.getParameter("date1");
		System.out.println(date);
		
		String number = request.getParameter("number");
		
		System.out.println(number);
		
		
		
		String div = request.getParameter("div1"); //전송 안됨
		String select = request.getParameter("select1");
		System.out.println(select);
		
		String text  = request.getParameter("textarea");
		System.out.println(text);
		
		
		
		response.getWriter().println("{\"k\" : 1}");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//url에 노출되지 않음
		System.out.println("DO post 실행");
		doGet(request, response);
		
		String num2 = request.getParameter("num2");
		System.out.println(num2);
	}

}
