package sec01.exam01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward")
public class forward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public forward() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get 실행");
		String text = request.getParameter("text");
		System.out.println("text = " + text);
		response.getWriter().println("another");
		//forward 방식 => get으로 들어오면 get으로 post로 들어오면 post로
		RequestDispatcher dispatcher =request.getRequestDispatcher("another");
		dispatcher.forward(request,response);
		
		response.getWriter().println("another");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do post 실행");
		String text = request.getParameter("text");
		System.out.println("text = " + text);
		response.getWriter().println("another");
		//forward 방식 => get으로 들어오면 get으로 post로 들어오면 post로
		RequestDispatcher dispatcher =request.getRequestDispatcher("another");
		dispatcher.forward(request,response);
		
		response.getWriter().println("another");
	}

}
