package proj3_dbcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Makeaccount")
public class makeaccServelt extends HttpServlet {
    private static final long serialVersionUID = 1L;

  
    private static final String URL  = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
    private static final String USER = "scott4_12";
    private static final String PASS = "tiger";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String pw_chk = request.getParameter("pw_check");
        try {
        	System.out.println("id blank test = " +id);
        	System.out.println("pw blank test = " +pw);
        	System.out.println("pw_chk blank test = " +pw_chk);
	        if (id == null || id.isBlank() || pw == null || pw.isBlank() || 
	        		pw_chk == null || pw_chk.isBlank()) {

	            out.println("id와 pw를 전달하세요.");
	            return;
	        } else if(!pw_chk.equals(pw)) {
	        	out.print("비밀번호를 확인해 주세요");
	        	return;
	        	
	        }
        } catch(Exception e) {
        	e.printStackTrace();
        }
        

        try {
            Class.forName("oracle.jdbc.OracleDriver"); // 드라이버 로드(확실히)

            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
                out.println("DB 연결 성공");

                // 1) 중복 아이디 존재 여부 확인 (가장 빠르고 안전)
                String existsSql = "SELECT 1 FROM accounts WHERE id = ?";
                try (PreparedStatement ps = conn.prepareStatement(existsSql)) {
                    ps.setString(1, id);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) { //  next() 후 getXxx()
                            response.setStatus(HttpServletResponse.SC_CONFLICT);
                            out.println("같은 계정이 존재합니다. 아이디를 바꿔 주세요.");
                            return;
                        }
                    }
                }

                // 2) 계정 삽입
                String insertSql = "INSERT INTO accounts (id, pw, role) VALUES (?, ?, ?)";
                try (PreparedStatement ps = conn.prepareStatement(insertSql)) {
                    ps.setString(1, id);
                    ps.setString(2, pw);       
                    ps.setString(3, "USER");
                    int n = ps.executeUpdate();
                    if (n == 1) {
                        out.println("계정(user) 추가 완료");
                    } else {
                        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                        out.println("계정 추가에 실패했습니다.");
                    }
                }

            }
        } catch (SQLIntegrityConstraintViolationException e) {
            // 유니크 제약조건 위반 등

            out.println("이미 존재하는 아이디입니다. 다른 아이디를 사용하세요.");
        } catch (Exception e) {

            e.printStackTrace(out);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }
}
