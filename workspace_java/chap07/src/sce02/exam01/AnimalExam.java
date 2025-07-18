package sce02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.think();
		a1.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.grooming();
		
		Animal a2 = (Animal)cat; //부모타입으로 형변환
		Animal a3 = cat; // 형변환 연산자 생략 가능, cat이란 녀석이 Animal을 상속하기 떄문이다
		
		a2.eat();
//		a2.clean(); 부모인 에니멀에는 clean이란 녀석이 없기떄문에 사용할수 없다.
//		부모는 자식으로 형변환이 안되는거 같다
		
		Animal a4 = new Dog();
		a4.think();
		
		catMom(cat);
		animalMom(a4);
		animalMom(cat);
		
		
		
		

	}
	
	static void catMom(Cat cat) {
		cat.eat();
		cat.grooming();
	}
	Animal a4 = (Animal) new Dog();
	
	static void animalMom(Animal animal) {
		System.out.println("age : " + animal.age);
		animal.eat();
		animal.think();
	
	}
	
	

}
