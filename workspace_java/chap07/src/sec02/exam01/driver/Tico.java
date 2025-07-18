package sec02.exam01.driver;

public class Tico extends Car{
	@Override
	void run(){
		System.out.println("TICO 주행중...");
	}
	
	void autoRun() {
		System.out.println("자율주행을 시작합니다");
	}


}
