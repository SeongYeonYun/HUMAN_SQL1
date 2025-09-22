package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human4.dto.EmpDTO;

@Repository
public class EmpDAOimpl implements EmpDAO {

	
	@Autowired
	//mybatis 실행
	SqlSession sqlSession;
	

	@Override
	public List<EmpDTO> selectEmplist() {
		// TODO Auto-generated method stub
		List<EmpDTO> resultlist = null;
		
		resultlist = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("resultlist : " + resultlist);
		
		return resultlist;
	}
	
	
	@Override
	public EmpDTO selectOneEmp() {
		// TODO Auto-generated method stub
		EmpDTO dto = null;
		
		dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("dto : " + dto);
		
		return dto;
	}
	
	
	
	
	
	
	
	
	@Override
	public Map selectOneEmpMap() {
		// TODO Auto-generated method stub
		Map map  = null;
		
		map = sqlSession.selectOne("mapper.emp.selectOneEmpMap");
		System.out.println("map : " + map);
		
		return map;
	}
	
	
	
	@Override
	public EmpDTO selectEmpno(int empno) {
		// TODO Auto-generated method stub
		EmpDTO empdto = null;
		
		empdto = sqlSession.selectOne("mapper.emp.selectEmpno", empno);
		System.out.println("dto : " + empdto);
		
		return empdto;
	}	
	
	
	@Override
	public EmpDTO selectEname(String ename) {
		// TODO Auto-generated method stub
		EmpDTO empdto = null;
		
		empdto = sqlSession.selectOne("mapper.emp.selectEmpno", ename);
		System.out.println("dto : " + empdto);
		
		return empdto;
	}
	
	
	

}
