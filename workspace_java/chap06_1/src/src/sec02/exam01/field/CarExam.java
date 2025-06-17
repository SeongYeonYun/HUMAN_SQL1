package src.sec02.exam01.field;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		//car1에 동적 메모리를 할당한다.   
		String car2 = "현대자동차";
		System.out.println(car1.company == car2);
		System.out.println(car1.company.equals(car2));
		//왜 둘다 true가나오지?????
		//주소값과 값이 같아서
		System.out.println("제작회사 : "+ car1.company);
		
		Car car3 = new Car();
		System.out.println(car1.company == car3.company);
		System.out.println(car1.company.equals(car3.company));
		String car4 = car3.company;
		System.out.println(car3.company == car4);
		System.out.println(car3.company.equals(car4));
		
		car3.company = "한화";
		car4 = car3.company;
		System.out.println(car4);
		System.out.println(car3.company);
		System.out.println(car3.company == car4);
		System.out.println(car3.company.equals(car4));
		

	}

}
