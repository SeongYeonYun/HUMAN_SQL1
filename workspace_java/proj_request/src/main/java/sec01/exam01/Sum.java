package sec01.exam01;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum
 */
@WebServlet("/Sum")
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DO get 실행");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2"); 
		String sd = request.getQueryString();
		
		System.out.println(sd);
		//		
//		<h1>NUM1 ${parm.num1}</h1><br>
//		<h1>NUM2 ${parm.num2}</h1><br>
//		<h1>SUM ${Integer.parseInt(param.num1)} +${Integer.parseInt(param.num2)} </h1>
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
