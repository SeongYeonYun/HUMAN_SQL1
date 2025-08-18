package proj3_dbcp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;








public class AccountCreate {
    public static void main(String[] args) {
    	ORACLE_connect ora = new ORACLE_connect();
//    	String Url = ORACLE_connect ora;
    	String url = ora.url;
    	String user = ora.user;
    	String pw = ora.pw;
    	
//    	
//    	String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe"; 
//    	String user = "scott4_12";
//    	String pw = "tiger";
    	Connection conn = null;
        try {
            // 1. 드라이버 로드 (필수: ojdbc.jar 필요)
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. DB 연결
            conn = DriverManager.getConnection(url, user, pw);
            System.out.println(" Oracle DB 연결 성공");

            // 3. 테이블 생성
            String createTableSQL = "CREATE TABLE accounts ("
                    + "id VARCHAR2(50) PRIMARY KEY, "
                    + "pw VARCHAR2(100) NOT NULL, "
                    + "role VARCHAR2(20) NOT NULL)";
            try (PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {
                pstmt.executeUpdate();
                System.out.println("accounts 테이블 생성 완료");
            }

            // 4. 관리자 계정 추가
            String insertAdminSQL = "INSERT INTO accounts (id, pw, role) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertAdminSQL)) {
                pstmt.setString(1, "admin");
                pstmt.setString(2, "1234"); // 운영 환경에서는 해싱 필요
                pstmt.setString(3, "ADMIN");
                pstmt.executeUpdate();
                System.out.println("관리자 계정(admin) 추가 완료");
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
