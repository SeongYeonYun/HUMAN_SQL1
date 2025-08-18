package proj3_dbcp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ORACLE_connect ora = new ORACLE_connect();
	
    public loginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = ora.url;
        String user = ora.user;
        String pw = ora.pw;

        try {
        	System.out.println("url = " +  ora.url);
        	System.out.println("user = " +  ora.user);
            String id2 = request.getParameter("ID");
            String pw2 = request.getParameter("PW");
            boolean loginSuccess = false;

            // 1. 입력값 유효성 검사 (DB 접근 전에 처리하는 것이 효율적입니다)
            if (id2 == null || id2.isBlank()) {
                request.setAttribute("message1", "ID를 입력해주세요.");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
                return; // 중요: forward 후 메서드 종료
            } else if (pw2 == null || pw2.isBlank()) {
                request.setAttribute("message2", "비밀번호를 입력해주세요.");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
                return; // 중요: forward 후 메서드 종료
            }

            // 2. JDBC 드라이버 로드 및 DB 연결
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, user, pw);
            System.out.println("로그인 DB 연결 성공");

            // 3. 쿼리 실행
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT id, pw FROM ACCOUNTS WHERE id = '" + id2 + "' AND pw = '" + pw2 + "'");

            // 4. 로그인 성공 여부 확인
            if (rs.next()) {
                // 일치하는 행이 있으면 성공
                loginSuccess = true;
            }

            // 5. 로그인 결과에 따라 한 번만 forward
            if (loginSuccess) {
                System.out.println("로그인 성공");
                request.getRequestDispatcher("pizza.jsp").forward(request, response);
            } else {
                System.out.println("로그인 실패");
                request.setAttribute("message1", "ID 또는 비밀번호가 올바르지 않습니다.");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            // 오류 발생 시 오류 페이지로 forward
            request.setAttribute("error", "로그인 중 오류가 발생했습니다.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } finally {
            // 6. 리소스 해제 (예외 발생 여부와 관계없이 항상 실행)
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}