package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import DTO.Emp_DTO;

public class Emp_DAO {
	
	//DB 접속	
	private Connection getConn() {
		Connection conn = null;
		try {
			// JNDI 방식으로 : 글씨로 정보를 가져오는 방식을 말한다.
			// context.xml에 있는 DB 정보를 가져온다
			Context ctx = new InitialContext();
			System.out.println("ctx = " + ctx); //접근 성공
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			System.out.println("dataFactory = " + dataFactory); //데이터 팩토리 생성 실패

			// DB 접속
			conn = dataFactory.getConnection();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public List<Emp_DTO> SelectallEmp() {
		List<Emp_DTO> list = new ArrayList<Emp_DTO>();
		try {
			//DB접속
			Connection conn = getConn();
			
			
			//SQL준비
			String query = "select * from emp2";
			PreparedStatement ps = conn.prepareStatement(query);
			
			//SQL실행
			ResultSet rs = ps.executeQuery(query);
			
			
			
			//결과 활용
			while(rs.next()) {
				Emp_DTO dto = new Emp_DTO();
				
				int empno = rs.getInt("empno");
				dto.setEmpno(empno);
				dto.setEname(rs.getString("ename"));
				dto.setSal(rs.getInt("deptno"));
				dto.setSal(rs.getInt("sal"));
				dto.setSal(rs.getInt("sal"));
				dto.setSal(rs.getInt("sal"));
				dto.setSal(rs.getInt("sal"));
				dto.setSal(rs.getInt("sal"));
				
				list.add(dto);
			}
			rs.close();
			ps.close();
			conn.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
			
		}
		
		
		return list;

		
	}
	
	
	//한명만 조회
	public Emp_DTO selectOneEmp(Emp_DTO empDTO) {
		Emp_DTO resultDTO = null;
		try {
			//DB접속
			Connection conn = getConn();
			
			
			//SQL준비
			String query = "select * from emp2";
			query += " where empno = ?"; //sql injecction 방지
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, empDTO.getEmpno());
			
			//SQL실행
			ResultSet rs = ps.executeQuery(query);
			
			
			
			//결과 활용
			while(rs.next()) {
//				Emp_DTO dto = new Emp_DTO();

				
				int empno = rs.getInt("empno");
				resultDTO.setEmpno(empno);
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setSal(rs.getInt("sal"));
				resultDTO.setHiredate(rs.getDate("hiredate"));
				resultDTO.setComm(rs.getInt("comm"));
				resultDTO.setDeptno(rs.getInt("deptno"));
				
			}
			rs.close();
			ps.close();
			conn.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
			
			
		}
		
		return resultDTO;
	}
	
	
	
}
