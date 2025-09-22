package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;

@Service
public interface EmpService {
	public List<EmpDTO> getEmpList();
	public EmpDTO getEmpOne();
	public Map getEmpOneMap();
	public EmpDTO getEmpno(int empno);
	
//	@Autowired
//	EmpDAO empDAO;
//	public List<EmpDTO> getEmpList(){
//		List<EmpDTO> result = empDAO.selectEmplist();
		
	}


