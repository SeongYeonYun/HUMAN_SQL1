package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//jsp는 request값이 내부적으로 들어가 있다.
/**
 * Servlet implementation class input2Servlet
 */
@WebServlet("/input2")
public class input2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public input2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println("to get start");
			
			System.out.println("-----------------------데이터 연산중-------------------------");			
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			int num3 = Integer.parseInt(num1) + Integer.parseInt(num2);
			System.out.println("-----------------------데이터 연산끝-------------------------");		
			
			
			System.out.println("-----------------------데이터 전송중-------------------------");
			PrintWriter out = response.getWriter();
			out.println("<h1> num1 = " + num1 + "</h1>");
			out.println("<h1> num2 = " + num2 + "</h1>");
			out.println("<h1> num3 = " + num3 + "</h1>");
			System.out.println("------------------------ 전송 종료 --------------------------");
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
