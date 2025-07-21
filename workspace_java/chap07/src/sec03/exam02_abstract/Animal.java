package sec03.exam02_abstract;

public abstract class Animal {
	 String kind;
	 void breathe() {
		 System.out.println("숨쉬기");
	 }
	 
	 abstract void sound(); 
	 //추상이기 떄문에 "{}생성자"가 있으면 안됨
	  
	 void love() {
		 
	 }
}
