package emp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

/**
 * Servlet implementation class EmpRemoveController
 */
@WebServlet("/remove")
public class EmpRemoveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EmpRemoveController() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		0. 삭제 버튼을 눌렀을떄 동작
		
//		1. 삭제되는 값을 받아와(empno)
		
//		2. DTO에 담아주기
		EmpDTO empDTO = new EmpDTO();
		
		
//		3. DB 커넥트
		EmpService empService = new EmpService();
		int result = empService.DelOneEmp(empDTO);
		System.out.println(result + "만큼 삭제 되었습니다.");
//		4. 전체목록 페이지 표시
		
		
		
		
	}

}
