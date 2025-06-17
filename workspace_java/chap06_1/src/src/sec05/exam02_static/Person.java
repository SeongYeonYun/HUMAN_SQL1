package src.sec05.exam02_static;

public class Person {
	 final String nation = "Korea";
	 final String ssn;
	 String name;
	 
	 public Person(String ssn, String name) {
		 this.ssn = ssn; //파이널이 선언이 되어있지 않은 경우 생성자에서 딱 한번 할당할수 있다.
		 this.name = name;
		 
	 }
	 
	 
	 
}
