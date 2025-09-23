package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> getEmpList(){
		List<EmpDTO> result = empDAO.selectEmpList();
		
		return result;
	}
	
	@Override
	public List<EmpDTO> selectEmp(EmpDTO dto){
//		List<EmpDTO> result = empDAO.selectEmpList();
		if(dto.getType().equals("1")) {
			dto.setEname(dto.getKeyword());
		} else if(dto.getType().equals("2")) {
			dto.setJob(dto.getKeyword());
		}
		
		return empDAO.selectEmp(dto);
	}
	
	
	@Override
	public EmpDTO getEmp(EmpDTO dto){
		
		
		
		if(dto.getType().equals("1")) {
			dto.setEname(dto.getKeyword());
		} else if(dto.getType().equals("1")) {
			dto.setJob(dto.getKeyword());
		}
		
		
		return dto;
	}
	
	@Override
	public Map getEmpMap(){
		Map result = empDAO.selectOneEmpMap();
		
		return result;
	}

	@Override
	public List getEmpno(int empno) {
		return empDAO.selectEmpno(empno);
	}
	
	@Override
	public List getEname(String ename) {
		return empDAO.selectEname(ename);
	}
	
	@Override
	public List selectDelete(int empno) {
		return empDAO.selectDelete(empno);
	}
	
	
//	@Override
//	public int selectJoin(EmpDTO empdto) {
//		return empDAO.selectJoin(empdto);
//	}
//	public List<EmpDTO> selectEmp(EmpDTO dto){
//		return empDAO.selectEmp(dto);
//	}
	
	
//	@Override
//	public int selectJoin(EmpDTO empdto) {
//		return empDAO.selectJoin(empdto);
//	}
	
	
//	@Override
//	public List<EmpDTO> getEmp1(){
//		if(dto.getType().equals("1")) {
//			dto.setEname(dto.getKeyword());
//		} else if(dto.getType().squals("1")) {
//			dto.
//		}
//		
//		return empDAO.selectEmp();
//	}
	
}
