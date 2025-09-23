package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human4.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EmpDTO> selectEmpList(){
		List<EmpDTO> resultList = null;
		
		resultList = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("resultList : "+ resultList);
		
		return resultList;
	}
	
	@Override
	public EmpDTO selectOneEmp(){
		EmpDTO dto = null;
		
		dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("dto : "+ dto);
		
		return dto;
	}
	
	@Override
	public Map selectOneEmpMap(){
		Map map = null;
		
		map = sqlSession.selectOne("mapper.emp.selectOneEmpMap");
		System.out.println("map : "+ map);
		
		return map;
	}
	
	@Override
	public List selectEmpno(int empno) {
		return sqlSession.selectList("mapper.emp.selectEmpno", empno);
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		return sqlSession.selectOne("mapper.emp.selectEmpno", empno);
	}
	
	@Override
	public List selectEname(String ename) {
		System.out.println("ename: "+ ename);
		return sqlSession.selectList("mapper.emp.selectEname", ename);
	}
	
	@Override
	public List selectEmpnoEname(EmpDTO dto) {
		return sqlSession.selectList("mapper.emp.selectEmpnoEname", dto);
	}

	@Override
	public int insertEmp2(EmpDTO dto) {
		System.out.println("dto: "+ dto);
		int result = sqlSession.insert("mapper.emp.insertEmp2", dto);
		return result;
	}

	@Override
	public int updateEmp2(EmpDTO dto) {
		System.out.println("dto: "+ dto);
		int result = sqlSession.insert("mapper.emp.updateEmp2", dto);
		return result;
	}

	@Override
	public int deleteEmp2(EmpDTO dto) {
		System.out.println("dto: "+ dto);
		int result = sqlSession.insert("mapper.emp.deleteEmp2", dto);
		return result;
	}
}
