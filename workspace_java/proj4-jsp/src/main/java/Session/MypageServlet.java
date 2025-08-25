package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MypageServlet
 */
@WebServlet("/mypage")
public class MypageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public MypageServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8"); 

        HttpSession session = request.getSession(false); // 기존 세션만 가져오기

        if (session == null) {
            System.out.println("아예 처음 방문");
            response.sendRedirect("cookie_5.jsp");
        } else {
            Boolean login = (Boolean) session.getAttribute("login");
            String userId = (String) session.getAttribute("id");  //  세션에서 id 꺼냄

            if (login == null || !login) {
                System.out.println("로그인 안함");
                response.sendRedirect("cookie_5.jsp");
            } else {
                response.getWriter().println("로그인 해야 올수 있는곳<br>");
                response.getWriter().println("아이디 : " + userId);  // admin 출력
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
