package todo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import todo.DTO.TodoDTO;

// DAO : Data Access Object 
public class TodoDAO {

	// tbl_todo의 모든 항목을 돌려주는 메소드
	// 메소드명 : selectAll
	// 전달인자 : 없음
	// 리턴타입 : List<TodoDTO>
	public List<TodoDTO> selectAll() {

		List<TodoDTO> list = new ArrayList<TodoDTO>();

		try {
			// JNDI 방식으로
			// context.xml에 있는 DB 정보를 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// DB 접속
			Connection conn = dataFactory.getConnection();

			// SQL 준비
			String query = "select * from emp";
			String whquery = query + String.format("where(empno == %d)", text);
			PreparedStatement ps = conn.prepareStatement(query);

			


			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			ResultSet rs2 = pswh.executeQuery();

			// 결과 활용
			while (rs.next()) {
				// 전달인자로 컬럼명(대소문자 구분없음)
				int tno = rs.getInt("tno");
				System.out.println("tno : "+ tno);
				String title = rs.getString("title");
				Date duedate = rs.getDate("duedate");
				int finished = rs.getInt("finished");
				
//				Map map = new HashMap();
//				map.put("tno", tno);
//				map.put("title", title);
//				map.put("duedate", duedate);
//				map.put("finished", finished);
//				list.add(map);
				
				TodoDTO todoDTO = new TodoDTO();
				todoDTO.setTno(tno);
				todoDTO.setTitle(title);
				todoDTO.setDuedate(duedate);
				todoDTO.setFinished(finished);
				
				list.add(todoDTO);
			}

			rs.close();
			ps.close();
			conn.close(); // 커넥션 풀로 반환
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
	
	Connection GetConnection() {
		Connection conn = null;

		try {
			// JNDI 방식으로
			// context.xml에 있는 DB 정보를 가져온다
			Context ctx = new InitialContext();
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");

			// DB 접속
			Connection conn = dataFactory.getConnection();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	} 
	//자료삽입
	//메소드명 : insert
	//전달인자 : todoDTO
	public void insert(TodoDTO dto) {
		int result = -1;
		try {
			//.접속
			Connection conn = GetConnection();
			
			//SQL준비
			String query = "insert into tbl_todo ";
			query += "(tno, title, duedate, finished) " + "values(seq_tbl_todo.nextval,?,?,?";
			//sql injection 방지와 효율성을 고려했을떄 보다 효율적인 방법 ?,?,?,
			int result = ps.executeUpdate();
			System.out.println(result + "행이가 삽입되었습니다.")
			ps.setString(1,dto.getTitle());
			ps.setDate(2,dto.getDuedate());
			ps.setInt(3, getFinished());
			//실핼 및 결과 확보
			
			//delete tablename where 조건문

		} catch (Exception e ) {
			e.printStackTrace();
		}
		return result;
	}
}
