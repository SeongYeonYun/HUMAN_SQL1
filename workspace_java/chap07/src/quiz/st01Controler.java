package quiz;

public class st01Controler extends student{
	/*지시하는 역할*/
//	무슨 일을 할지 , 식사, 휴식, 공부 등
	st01Service st01Service = new st01Service();
	st01Controler(){
		super("st01");
	}
	
	@Override
	String answer(String q) {
		String result = st01Service.getinfo(q);
		return result;
	}
	
	
	
}

