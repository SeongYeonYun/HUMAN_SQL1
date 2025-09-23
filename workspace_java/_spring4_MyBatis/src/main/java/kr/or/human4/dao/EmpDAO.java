package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpDAO {

	public List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
	public List selectEmpno(int empno);
	public List selectEname(String ename);
	public List selectDelete(int empno);
//	public int selectJoin(EmpDTO dto);
	public List<EmpDTO> selectEmp(EmpDTO dto);
	
}
