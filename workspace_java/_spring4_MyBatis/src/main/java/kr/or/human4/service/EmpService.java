package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> getEmpList();
	public EmpDTO getEmp(EmpDTO dto);
	public Map getEmpMap();
	public List getEmpno(int empno);
	public List getEname(String ename);
	public List selectDelete(int empno);
	public int selectJoin(EmpDTO empdto);
	public List<EmpDTO> selectEmp(EmpDTO dto);
//	public List<EmpDTO> select2Emp(EmpDTO dto);
}
