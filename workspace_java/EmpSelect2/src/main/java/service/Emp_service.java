package service;

import java.util.List;

import DAO.Emp_DAO;
import DTO.Emp_DTO;

public class Emp_service {
	//서비스는 물류 창고라고 생각하자
	public List<Emp_DTO> getALLEmp(){
		Emp_DAO empdao = new Emp_DAO();
		List list = empdao.SelectallEmp();
		return list;		
		
	}

}
