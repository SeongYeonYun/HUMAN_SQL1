

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fowardServlet
 */
@WebServlet("/Forward")
public class fowardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fowardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a = 10;
		List list  = new ArrayList();
		list.add(7);
		list.add("abc");
		
		Map map = new HashMap();
		map.put("k1", 9);
		map.put("k2", "word");
		
		String arr[] = {"z","y", "s"};
		request.setAttribute("a", a);
		request.setAttribute("list", list);
		request.setAttribute("map", map);
		request.setAttribute("arr", arr);
//		request.setAttribute("dto", response)
		
		
		request.getRequestDispatcher("el_3.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
