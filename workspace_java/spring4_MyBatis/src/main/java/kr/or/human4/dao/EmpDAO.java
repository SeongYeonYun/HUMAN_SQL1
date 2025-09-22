package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpDAO {

	public List<EmpDTO> selectEmplist();
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
	public EmpDTO selectEmpno(int empno);
	public EmpDTO selectEname(String ename);
	
}
