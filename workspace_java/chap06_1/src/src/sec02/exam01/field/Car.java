package src.sec02.exam01.field;

public class Car {
	 // 공용변수 선언 static String company = "현대자동차";
	//필드의 선언과 동시에 초기화
	String company = "현대자동차";
	String model = "그랜저";
	String color = "black";
	int maxSpeed = 400;
	
	//필드 선언
	//초기화하지 않은경우  생성할떄 0. false,null 로 초기화 된다.
	int speed;
	//speed = 50; 불가능, 필드 여역에선 실행 할수 없다.
	//speed값을 50으로 바꾸는 행동을 한거기 떄문에 불가능.
	
	
}
