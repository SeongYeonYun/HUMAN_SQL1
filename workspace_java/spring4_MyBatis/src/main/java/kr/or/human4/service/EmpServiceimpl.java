package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;
@Service
public class EmpServiceimpl implements EmpService{
	

		
//		
//		@Autowired
//		EmpDAO empDAO;
//		public List<EmpDTO> getEmpList(){
//			List<EmpDTO> result = empDAO.selectEmplist();
	
		@Autowired
		EmpDAO empDAO;
		public List<EmpDTO> getEmpList(){
			List<EmpDTO> result = empDAO.selectEmplist();
			
			
			return result;
			
		

	}	
		
		
		@Autowired
//		private EmpDAO empDAO1;
		public EmpDTO getEmpOne(){
			EmpDTO result = empDAO.selectOneEmp();
			
			
			return result;
			
		

	}	
		
		
		
		@Autowired
//		private EmpDAO empDAO1;
		public Map getEmpOneMap(){
			Map result = empDAO.selectOneEmpMap();
			
			
			return result;
			
		

	}	
		@Autowired
//		private EmpDAO empDAO1;
		public EmpDTO getEmpno(int empno){
			EmpDTO empdto = empDAO.selectEmpno(empno);
			
			
			return empdto;
			
			
			
		}	
		
		
		
		@Autowired
		public EmpDTO selectEmpnoEname(EmpDTO empno, EmpDTO ename){
			EmpDTO empdto = empDAO.selectEmpnoEname(empno, ename);
			
			
			return empdto;
			
			
			
		}	
		
}
