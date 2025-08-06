package sec01.exam01;

public class KeyboardExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyboardImpl k1 = new KeyboardImpl();
		Keyboard k2 = (Keyboard) new KeyboardImpl();
		KeyboardImpl k3 = new KeyboardImpl();
		
		System.out.println(k3.press(13));
		System.out.println(k2.press(13));
		System.out.println(k1.press(1));
		
		Keyboard k5 = new Keyboard() {

			@Override
			public String press(int keyCode) {
				// TODO Auto-generated method stub
				
				if(keyCode == 13) {
					return "enter";
				}
				return "뭔가 눌림";

			}
		
		

		};

	}
}
