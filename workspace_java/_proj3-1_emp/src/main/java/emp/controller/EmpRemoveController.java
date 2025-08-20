package emp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
//		0. 삭제 버튼을 눌렀을떄
//		1. 삭제되는 값을 받아와 + 서비스는 거치자
//		2. DAO에서 DB connect
//		3. DAO 파일에서 DELETE문 실행
//		4. 삭제된 값만 지워버려
		
		
		
		
	}

}
