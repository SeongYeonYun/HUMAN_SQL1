package sec02.exam01.driver;

public class Driver {
	
	void driveTico(Tico tico) {
		System.out.println("only tico");
		tico.run();
		tico.autoRun();
	}
	
	void drive(Car car) {
		System.out.println("악셀 밟습니다 손님");
		car.start();
		car.run();
		car.stop();
		//autorun이 없다.
		
		
		//티코도 Car로 잡는법, 부모를 가지
		//고 어떤 자식을 통해온 부보인지 알아봅는 방법
		if (car instanceof Tico ) {
			Tico tico =  (Tico) car;
			tico.autoRun();
			
			((Tico)car).autoRun(); //변수를 가져오는것이 아닌 클래스만 가져오는것
			
		}
		
//자바  버전 16이상부터는 검사와 캐스팅을 동시에 할수 있다.		
//		if (car instanceof Tico tico) {
//			
//			tico.autoRun();
//			
//			((Tico)car).autoRun(); //변수를 가져오는것이 아닌 클래스만 가져오는것
//			
//		}
		
		
		
	}
	


}









/////////////////////////////   instanceof 예제   /////////////////////////
//class Animal {}
//class Dog extends Animal {}
//class Cat extends Animal {}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal a = new Dog();
//
//        System.out.println(a instanceof Dog);   // true
//        System.out.println(a instanceof Cat);   // false
//        System.out.println(a instanceof Animal); // true
//        System.out.println(a instanceof Object); // true
//    }
//}
