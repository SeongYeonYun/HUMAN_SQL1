package quiz;

public class st01Service extends st01DAO{
	/*실제 일을 하는 역할*/
	//머리속
	String getinfo(String q) {
		st01DAO st01DAO = new st01DAO();
		String result = st01DAO.selectAnswer(q);
		if(result == null) {
			result = "고민중";
		}else { result = "저는 " + result + "요";}
		return result;
	}
	
	
	
	//gpt
	//notion
	//book
}
