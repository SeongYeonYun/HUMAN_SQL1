package service;

import java.util.List;

import DAO.DAO;
import DTO.DTO;

public class service {
	public List<DTO> getList(){
		DAO DAO = new DAO();
		return DAO.selectAll();
	}

}
