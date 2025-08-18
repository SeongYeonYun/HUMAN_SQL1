package proj3_dbcp;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBinfo {
	public static void main(String[] args) {
		
		try {
			//JNDI 방식으로 가져오는 법 XML파일 정보 로드
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle"); //object return
			//factory pattern 
			Connection conn = dataFactory.getConnection();
			conn.close(); //커넥션 풀로 반환, 재활용 가능
			
			
		}
		catch (Exception e) {
			
		}
		//tomcat정보를 가져와야 해서 main으로 안되고 servlet만들어서 실행해야 한다. 
		
		
	}
	
	

}
