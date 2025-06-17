package src.sec04exam03;

public class Car2 {
	
	int gas;
	void setGas(int g) {
		gas = g;
	}
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("no gas");
		return false;
		} else { //else가 있다는건 무조건 한번은 실행된다
			System.out.println("exit gas");
			return true;
			}
	}
	
	boolean isLeftGas2() {
		boolean result = false;
		if(gas ==0) {
			System.out.println("no gas");
			result =  false;
		} else {
			System.out.println("exit gas");
			result =  true;
			
		}
		return result;
		
	}
	
	boolean isLeftGas3() {
		return gas !=0;
	}
	
	void run() {
		while(true) {
			if(gas >0) {
				System.out.println("달립니다. ㅍ! 잔량 : " + gas);
				gas --;
				setSpeed(gas*10);
				
			}else {
				System.out.println("stop. ㅍ! 잔량 : " + gas);
				return;
			}
		}
	}
	
	void setSpeed(int s) {
		int speed = s;
		System.out.println(
				String.format("속도를 %d로 만듭니다.", speed)
				);
	}
	
	
}
