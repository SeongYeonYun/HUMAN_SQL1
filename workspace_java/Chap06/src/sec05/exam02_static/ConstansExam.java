package sec05.exam02_static;

public class ConstansExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = loginCheck("admin","1234");
		if(result == Constant.LOGIN_SUCESS) {
			System.out.println("로그인 성공");
		}
		
		
	}

	private static int loginCheck(String id, String pw) {
		// TODO Auto-generated method stub
		if("admin".equals(id) && "1234".equals(pw) ) {
			return Constant.LOGIN_SUCESS;
					
		} else {
			return Constant.LOGIN_FAIL;
		}
	}

}
