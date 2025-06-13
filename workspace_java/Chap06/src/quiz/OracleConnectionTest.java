package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionTest {
	public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 포트/서비스명은 상황에 맞게
        String user = "your_username";  // 오라클 계정
        String password = "your_password";

        try {
            // 드라이버 로딩 (JDK 6 이하일 때만 필요)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Oracle DB 연결 성공!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Oracle DB 연결 실패!");
            e.printStackTrace();
        }
    }
		
}
