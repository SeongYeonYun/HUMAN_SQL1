package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.Emp_DTO;
import service.Emp_service;

/**
 * Servlet implementation class emp_listcontroller
 */
@WebServlet("/emp_listcontroller")
public class emp_listcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public emp_listcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("/list do get test");
		//DB조회
		Emp_service empser = new Emp_service();
		List<Emp_DTO> list = empser.getALLEmp();
		for(Emp_DTO dto : list) {
			System.out.println(dto);
		}
		
		///////////////////////////////////////////////////////////////////////////
		//화면에 출력
		PrintWriter out = response.getWriter();
		out.println("<table border = 1>");
		out.println("<tr>");
		out.println("<th>empno</th>");
		out.println("<th>ename</th>");
		out.println("<th>sal</th>");
		out.println("</tr>");
		
		for(Emp_DTO dto : list) {
			out.println("<tr>");
			out.println("<td>" + dto.getEmpno() + "</td>");
			out.println("<td>" + dto.getEname() + "</td>");
			out.println("<td>" + dto.getSal() + "</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
