package sce02.exam01;

public class Cat extends Animal{
	int age = 3;
	//static 은 static만 실행할수 있지만 new를 함으로써 패싱 가능
	
	@Override
	void eat() {
		System.out.println("와구와구");
	}
	@Override
	void think() {
		System.out.println("배고프다");
	}
	
	void clean() {
		System.out.println("일본 후 처리");
	}
	
	void grooming() {
		System.out.println("고양이 세수한다");
	}

	
}
