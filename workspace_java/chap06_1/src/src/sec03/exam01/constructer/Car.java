package src.sec03.exam01.constructer;

public class Car {
	//생성자는 클래스 이름과 동일하게 사용, 그럼return타입이 없어도 됨
//	Car(){
//		System.out.println("Car 실행");
//	}
	
/////////////////////////////////////////////////////////////////////////////////
//	String color;				                                               //					//////////////////////////////
//	Car(){                                                                     //  ==============	//String model = "aventa";	//
//		color = "red";                                                         // 					//							//			
//		                                                                       //  ==============   //String color = "red";		//
//	}//아무런 역할도 없는경우 생략가능 ==생성자를 생략한 경우 기본 생성자가 자동완성된다.   //					//////////////////////////////
/////////////////////////////////////////////////////////////////////////////////	
	
	String model = "aventa";
	String color;
	int maxspeed;
	CarExam carExam = new CarExam(); 
	
	Car(String m ,String c,int ms ){
		model = "아반떄";
		color = c;
		maxspeed = 240;
		
		
	}
	
	Car(String c){
		this("as",c,44);
		c = "red";
	}
	
	void setColor(String color) {
		this.color = "red";
		
	}
	

	
}
