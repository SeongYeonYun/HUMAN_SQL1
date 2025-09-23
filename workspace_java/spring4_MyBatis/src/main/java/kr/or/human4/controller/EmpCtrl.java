package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EmpCtrl {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		
		List<EmpDTO> list = empService.getEmpList();
		model.addAttribute("list", list);
		
		
		
		
		
		/////////////////////////////////////////////////
		
		
		return "emp";
		
		
	}
	
	
	
	@RequestMapping("/EmpOne")
	public String empOne(Model model) {
		
		EmpDTO empDTO = empService.getEmpOne();
		model.addAttribute("list", empDTO);
		
		
		
		
		
		/////////////////////////////////////////////////
		
		
		return "emp";
		
		
	}
	
	
	
	@RequestMapping("/EmpOneMap")
	public String empOneMap (Model model) {
		
		Map map = empService.getEmpOneMap();
		model.addAttribute("list", map);
		
		
		
		
		
		/////////////////////////////////////////////////
		
		
		return "emp";
		
		
	}
	
	
	
	@RequestMapping("/getempno")
	public String getEmpno (Model model, int empno) {
		
		EmpDTO empdto = empService.getEmpno(empno);
		model.addAttribute("list", empdto);
		
		
		
		
		
		/////////////////////////////////////////////////
		
		
		return "emp";
		
		
	}
	
	
	@RequestMapping("/getempnoename")
	public String getempnoename (Model model, String ename , int empno) {
		
		EmpDTO empdto = empService.selectEmpnoEname(empno, ename);
		model.addAttribute("list", empdto);
		
		
		
		
		
		/////////////////////////////////////////////////
		
		
		return "emp";
		
		
	}
	
	
}
