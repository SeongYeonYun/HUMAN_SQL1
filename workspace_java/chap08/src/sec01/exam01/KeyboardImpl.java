package sec01.exam01;

public class KeyboardImpl implements Keyboard{
	//인터페이스를 상속받은 경우 보통 class명에 Impl을 붙힘
	
	@Override
	public String press(int keyCode) {
		if(keyCode == 13) {
			return "enter";
		}
		return "뭔가 눌림";
	}
}
