package sec01.exam01;


import java.io.IOException;
import java.io.PrintWriter;

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
		try {
			System.out.println("DO get 실행");
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int n3 = n1+ n2;
			
			System.out.println(n1);
			
			PrintWriter out = response.getWriter();
			out.println("<h1>NUM1 =" + n1 + "</h1>");
			out.println("<h1>NUM2 =" + n2 + "</h1>");
			out.println("<h1>NUM3 =" + n3 + "</h1>");
			
			
			
//			response.getWriter().append("Served at: ").append(request.getContextPath());
	
			/*
			 * String num1 = request.getParameter("num1"); String num2 =
			 * request.getParameter("num2"); String sd = request.getQueryString();
			 * 
			 * System.out.println(sd);
			 */
			//		
	//		<h1>NUM1 ${parm.num1}</h1><br>
	//		<h1>NUM2 ${parm.num2}</h1><br>
	//		<h1>SUM ${Integer.parseInt(param.num1)} +${Integer.parseInt(param.num2)} </h1>
		} catch(Exception e) {
			
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
