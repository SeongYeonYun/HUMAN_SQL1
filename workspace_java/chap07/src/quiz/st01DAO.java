package quiz;

import java.util.HashMap;

public class st01DAO {
	/*DB전용*/
	HashMap map = new HashMap();
	
	st01DAO(){
		map.put("사탕", "청포도");
		map.put("점심", "달식당");
		map.put("회식", "어디가요?");
		map.put("휴식", "네!!");
	}
	
	String selectAnswer(String q) {
		return (String)map.get(q);
		
	}
	
}
