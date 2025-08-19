package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DTO.DTO;

/**
 * Servlet implementation class Empservlet
 */
@WebServlet("/Empservlet")
public class Empservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Empservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("emp get 실행");
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// 목록 가져오기
		service.service service = new service.service();
		List<DTO> list = service.getList();
		
		PrintWriter out = response.getWriter();
		out.println("<table border=1>");
		// 목록 보여주기
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
			DTO dto = list.get(i);
			out.println("<tr>");
			out.println("	<td>"+ dto.getename() +"</td>");
			out.println("	<td>"+ dto.getempno() +"</td>");
			out.println("	<td>"+ dto.gethiredate() +"</td>");

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
