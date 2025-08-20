package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/detail")
public class EmpDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/detail doGet 실행: 한명의 상세 정보만 조회");
		
		// 파라메터 empno를 int로 형변환
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		// DB 다녀와서 출력하기
		try {
			
			EmpService empService = new EmpService();
			EmpDTO empDTO2 = empService.getOneEmp(empDTO);
			
			PrintWriter out = response.getWriter();
			out.println("<table border=1>");
			out.println("	<tr><td>empno</td><td>"+ empDTO2.getEmpno() +"</td><tr>");
			out.println("	<tr><td>ename</td><td>"+ empDTO2.getEname() +"</td><tr>");
			out.println("	<tr><td>job</td><td>"+ empDTO2.getJob() +"</td><tr>");
			out.println("	<tr><td>mgr</td><td>"+ empDTO2.getMgr() +"</td><tr>");
			out.println("	<tr><td>hiredate</td><td>"+ empDTO2.getHiredate() +"</td><tr>");
			out.println("	<tr><td>sal</td><td>"+ empDTO2.getSal() +"</td><tr>");
			out.println("	<tr><td>comm</td><td>"+ empDTO2.getComm() +"</td><tr>");
			out.println("	<tr><td>deptno</td><td>"+ empDTO2.getDeptno() +"</td><tr>");
			out.println("</table>");
			out.println("<form method = 'post' action = 'remove'>");
			
			out.println("<input type = 'submit' name = 'empno'>");
			out.println("</table>");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
