package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.Emp_DTO;
import service.Emp_service;

/**
 * Servlet implementation class EmpDetailController
 */
@WebServlet("/detail")
public class EmpDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpDetailController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("/detail do get 실행");
		int empno = 0;
		
		//empno를 int로 변환
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno !=null) {
				empno = Integer.parseInt(sEmpno);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Emp_DTO empDTO = new Emp_DTO();
		empDTO.setEmpno(empno);
		
		//DB다녀와서 출력
		try {
			Emp_service empService = new Emp_service();
			Emp_DTO empDTO2 = empService.getOneEmp(empDTO);
			PrintWriter out = response.getWriter();
			out.println("<table border = 1>");
			out.println("<tr><td>empno/td></td>" + empDTO2.getEmpno() + "</td><tr>");
			out.println("<tr><td>ename/td></td>" + empDTO2.getEname() + "</td><tr>");
			out.println("<tr><td>job/td></td>" + empDTO2.getJob() + "</td><tr>");
			out.println("<tr><td>mgr/td></td>" + empDTO2.getMgr() + "</td><tr>");
			out.println("<tr><td>hiredate</td></td>" + empDTO2.getHiredate() + "</td><tr>");
			out.println("<tr><td>deptno</td></td>" + empDTO2.getDeptno() + "</td><tr>");


			out.println("</table>");

			
			

			
			
		}catch(Exception e) {
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
