package Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class session
 */
@WebServlet("/session")
public class session extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public session() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html; charset=UTF-8");
    	response.setCharacterEncoding("UTF-8");
        // 기존 세션 있으면 가져오고, 없으면 새로 생성
        HttpSession session = request.getSession();

        // 세션 ID 확인용 출력
        String id = session.getId();
        System.out.println("세션 ID : " + id);

        // 세션이 새로 생성된 건지 여부
        boolean isNew = session.isNew();
        System.out.println("isNew = " + isNew);

        // 파라미터로 받은 id 확인
        String user_id = request.getParameter("id");

        if ("admin".equals(user_id)) {
            session.setAttribute("login", true);
            session.setAttribute("id", "admin");   //  세션에 admin 값 저장
            System.out.println("관리자(admin) 로그인 성공");

            // 로그인 성공 후 마이페이지로 이동
            response.sendRedirect("mypage");
        } else {
            response.getWriter().println("로그인 실패: id 파라미터가 admin이 아님");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
