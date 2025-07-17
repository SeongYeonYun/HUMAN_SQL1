package sce01_exam01;

public class Child extends parent{
	//extend 상속받고자 하는 클래스
	void printName() {
		System.out.println("Child의 Prdintnname실행");
		System.out.println("name : " + name);
		System.out.println("this.name = " + this.name);
		String pName = getName();
		System.out.println("pNAme : " + pName);
	}
	//전달인자가 필드를 가리는 현상을 shadow현상이라고 한다.
	void setName(String name) {
		System.out.println("set this name :" +name);
		this.name = name;
		//this.name을 주석처리 할경우 이 메서드에서만 바뀌네 
		//주석처리를 안할경우 메서드 안에서 바뀐 내용이 name값으로 출력되네
		//그럼 this라는 녀석은 말 그대로 필드값에 덮어쓰기 하는건가???
		System.out.println("set this name :" +name);
	}
	
	//부모의 필드를 가리는 현상
	String name = "Child의 name";
	
	
	

}
