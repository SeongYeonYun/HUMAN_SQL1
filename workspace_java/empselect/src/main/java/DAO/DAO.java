package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import DTO.DTO;

public class DAO {

	// tbl_todo의 모든 항목을 돌려주는 메소드
	// 메소드명 : selectAll
	// 전달인자 : 없음
	// 리턴타입 : List<TodoDTO>
	public List<DTO> selectAll() {

		List<DTO> list = new ArrayList<DTO>();

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
			PreparedStatement ps = conn.prepareStatement(query);
			


			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();

			// 결과 활용
			while (rs.next()) {
				// 전달인자로 컬럼명(대소문자 구분없음)
//				int tno = rs.getInt("tno");
//				System.out.println("tno : "+ tno);
				String ename = rs.getString("ename");
				System.out.println(ename);
				Date hiredate = rs.getDate("hiredate");
				int empno = rs.getInt("empno");
				
//				Map map = new HashMap();
//				map.put("tno", tno);
//				map.put("title", title);
//				map.put("duedate", duedate);
//				map.put("finished", finished);
//				list.add(map);
//				
				DTO DTO = new DTO();
//				DTO.setTno(empno);
				DTO.setempno(empno);
				DTO.setename(ename);
				DTO.sethiredate(hiredate);
				
				list.add(DTO);
			}

			rs.close();
			ps.close();
			conn.close(); // 커넥션 풀로 반환
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}

