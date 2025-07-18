package sec02.exam01.driver;
//extends Object 모든 클래스의 부모, 오브젝트에 한해서 상속 가낭, extends뒤에 있는 녀석이 상속 받는다는 이야기
public class Car {
	Car(){
		super();
		
	}
	
	void start() {
		System.out.println("시동 걸기");
	}
	
	void stop() {
		System.out.println("시동 끄기");
		
	}
	
	
	void run(){
		System.out.println("주행중...");
	}
	
	
}
