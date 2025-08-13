package proj3_dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class OracleJDBCExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe"; 
		String user = "scott4_12";
		String pw = "tiger";
//		String dbname = "oracle"; 오라클은 하나밖에 안써서 굳이 넣을 필요가 없음
		
		
		Connection conn = null;
		
		
		try {
			//JDBC드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			url +=dbname;
			System.out.println(url);
			//드라이버 세팅
			conn = DriverManager.getConnection(url,user,pw);
			if (conn !=null) {
				System.out.println("\n--------db연결 성공---------");
			} else {
				System.out.println("\n--------db연결 실패---------");
			}
			
			
			
			
		}  catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			
			//객체 생성
			Statement stmt = conn.createStatement();
			
			//내가 원하는 sql문 실행하는법
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
		
			//메타 데이터를 가져와서
			ResultSetMetaData meta = rs.getMetaData();
			System.out.println("meta = " + meta);
			System.out.println("테이블명: " + meta.getTableName(1));
			System.out.println("스키마명: " + meta.getSchemaName(1));
			System.out.println("카탈로그명: " + meta.getCatalogName(1));
			
			//메타 데이터의 칼럼수 조회
			int columnCount = meta.getColumnCount();
			System.out.println("columnCount = " + columnCount);

			//칼럼 수만큼 반복해서 가져오기
			while (rs.next()) {
			    for (int i = 1; i <= columnCount; i++) {
			    	
			    	//getString -> 데이터를 스트링 값으로 가져온다
			        System.out.print(rs.getString(i) + "\t");
			    }
			    System.out.println();
			}
			
			rs.close();
			stmt.close();
			conn.close();
			System.out.println("\n--------데이터 베이스 접속 종료----------");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

		
		
		
	}

}
