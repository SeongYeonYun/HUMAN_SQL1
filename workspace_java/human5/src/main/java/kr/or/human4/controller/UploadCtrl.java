package kr.or.human4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadCtrl {
	
	@RequestMapping("/upload.view")
	public String view() {
		
		return "uploadForm";
		
	}
	
}
