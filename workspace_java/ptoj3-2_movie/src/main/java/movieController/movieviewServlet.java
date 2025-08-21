package movieController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import movieDTO.movieDTO;
import movieService.movieService;

/**
 * Servlet implementation class movieviewServlet
 */
@WebServlet("/view")
public class movieviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public movieviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html; charset=UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    
	    
		System.out.println("view get 실행");
		try {
			movieService movieService = new movieService();
	//		System.out.println("movieService = " + movieService);
			List<movieDTO> list = movieService.getAllmovies();
			int cnt = movieService.countrows();
			System.out.println("cnt = " + cnt);
	//		System.out.println("list = " + list);
			
			PrintWriter out = response.getWriter();
	
			out.println("<form method = 'get' action = 'remove'>");
			out.println("데이터 출처 : <a href = https://www.kobis.or.kr/kobis/business/mast/mvie/searchMovieList.do>"
					+ "KOBIS"
					+ "</a>");
			out.println("<input type = 'submit' name = 'ds'>");
			out.println("<table border=1>");
			out.println("	<tr>");
			out.println("		<th>title</th>");
			out.println("		<th>title_en</th>");
			out.println("		<th>status</th>");
			out.println("		<th>code</th>");
			out.println("		<th>country</th>");
			out.println("		<th>open</th>");
			out.println("		<th>genre</th>");
			out.println("		<th>chk</th>");
			out.println("	</tr>");
			for(movieDTO dto : list) {
	//			System.out.println(dto);
				
				out.println("<tr>");
				out.println("	<td>"+ dto.getTitle() +"</td>");
				out.println("	<td>" + dto.getTitle_en() +"</td>");
				out.println("	<td>"+ dto.getStatus() +"</td>");
				out.println("	<td>"+ dto.getCode() +"</td>");
				out.println("	<td>"+ dto.getCountry() +"</td>");
				out.println("	<td>"+ dto.getOpen() +"</td>");
				out.println("	<td>"+ dto.getGenre() +"</td>");
				out.println("<td><input type = 'checkbox' name = 'chk' value = '"+dto.getCode()+"'></td>");
	
	
	
				out.println("</tr>");	
			}
			out.println("</table>");
			out.println("</form>");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
