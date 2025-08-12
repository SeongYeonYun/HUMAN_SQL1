

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello_Servlet
 */
@WebServlet("/Hello.human") //url patterns의 값만 입력해도 된다. 알아서 URL patterns로 인식됨
public class Hello_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	//별표 두개는 하이퍼 링크라고 생각하면 됨? 
    public Hello_Servlet() {
        super();
        System.out.println("Hello Servelt Create");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

    	//한글 꺠짐 방지| 안됨 해결할것, 먼저 호출되어야 한다.
    	response.setContentType("text/html;charset=utf-8");

    	request.getRequestDispatcher("/WEB-INF/NewFile.jsp");	
//		response.getWriter().append("Served at:").append(request.getContextPath());
    	PrintWriter out =   response.getWriter();
    	

    	
//    	out.println("<h1>");
//    	out.print("Hello2 서블릿");
//    	out.println("<h1>");
//    	out.println("<a href = 'www.naver.com'>sdsd</a>");
    	
    	for(int i = 0; i<10; i++) {
    		if(Math.random() <0.5) {
    			out.println(i);
    			out.println("<br>");
    		}
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
