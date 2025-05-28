package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class VarTypeExam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		byte b1; //선언하는 즉시 1바이트를 활용하게됨
		b1 = 127;
		System.out.println("b1 = " + b1);
		
		char c1 = 65;
		System.out.println("c1 = " + c1);		
		c1 = 65 + 2;
		System.out.println("c1 = " + c1);
		
		char c2 = 'F'; //char타입에만 ''을 쓴다.
		System.out.println("c2 = " + c2);
		System.out.println("c2 = " + (c2-c1));
		
		char c3 = '한';
		System.out.println("c3 = " + c3);
		System.out.println("c3 +1 = " + (c3+1));
		System.out.println("c3 +1 = " + c3+1);
			//괄호를 씌무면 숫자로 계산이 된다. (c3+1) -> 54621, c3+1  = 한1
			//char타입은 글씨 하나만 쓸수 있고  string은 여러 글자 쓸수 있다.
		
		String s1 = "윤성연";
		String ss1 = "윤\"\\   \n 성 \t연";
			// 문자열 안에 따옴표 출력 한는법
		System.out.println("s1 = " + ss1);
		
		String s3 = "성연";
		s3 = s3 + "글\n씨" + 3 + 2 +(3+2) + "\n";
		System.out.println("s3 = " + s3);
		
		String s4 = 3+2+"글씨";
		System.out.println("s4 = " + s4);
		
		String s5 = s3+s4;
		System.out.println("s5 = " + s5);
		
		int i1 = 2100000000;
//		int i2 = 2200000000;
		long l1 = 2200000000L; 
		//l이 숫자 뒤에 붙으면 long형이고 안붙히면 int형으로 판단한다.
		
		float f1 = 3.14f;// float도뒤에 f
		double d1 = 3.14;
		System.out.println("f1 = " + f1 );
		System.out.println("d1 = " + d1 );
		
		float f2 =0.123456789f;// float도뒤에 f
		System.out.println("f2 = " + f2 ); 
			//마지막 자리를 반올림 한다. 소수점 7번째 까지만 신뢰가 가능하다(정밀도)
		
		double d2 = 0.12345678946464468486464;
		System.out.println("d2 = " + d2 );
			//double의 경우 소수점 16자리 까지 사용한다.
		
		double i10 = 5e2;
		System.out.println(i10);
		
		
		double i11 = Math.pow(3, 2); //3의 제곱
		System.out.println("i11 = " + i11);
		
		boolean stop = true;
		boolean start = false;
		
		//----------------------- 1번-------------------------------//	
		//내 나이값 저장		
		int myage = 27;
		
		//----------------------- 2번-------------------------------//
		//내 소유의 차가 있다.
		boolean mycar = false;
		
		//----------------------- 3번-------------------------------//
		//우리집에 있는 스마트폰 개수
		int smartphone = 1;
		
		//----------------------- 4번-------------------------------//
		//내이름
		String myname = "윤성연";
		
		//----------------------- 4번-------------------------------//
		//1평은 3.3제봄 미터이다. 5평은?
		double peong1 = 3.3;
		double peong5 = peong1 * 5;
		System.out.println(peong5);
		
		//----------------------- 퀴즈 0번-----------------------------//
		int a = 3;
		int b = 4;
		System.out.println(a + "과" +b);
				//"{}과 {}", a,b); 포멧 되지 않나???????
		System.out.print(String.format("%s 과 %s",a,b));
		
		//----------------------- 퀴즈 1번-----------------------------//
		System.out.println(a + ">" + b + "의 결과는" + (a>b) + "입니다.");
		
		a = 6;
		b = 5;
		System.out.println(a + ">" + b + "의 결과는" + (a>b) + "입니다.");
		
		//----------------------- 퀴즈 2번-----------------------------//
		//시간 더하기 
		int hour = 12;
		int min = 40;
		int min_add = 35;
		//조건문?????안쓰고 되나????
		//35분 더해
		
		hour = ((hour * 60) + min + min_add)/60;
		//사건울 분으로 나눈뒤 다시 시간으로 변환한다.
		
		min = ((hour * 60) + min + min_add)%60; 
		//분을 분으로 반환한다
		
		System.out.println(String.format(hour + "시" + min + "분 입니다"));
		System.out.println(String.format("%s시%s분 입니다",hour,min));
		System.out.printf("%d시%s분 입니다\n",hour,min); //자동 줄바꿈이 안됨
		
		
		//----------------------- 퀴즈 3번-----------------------------//
		int nm = 783;
		System.out.println(
				"백의 자리 : " + nm/100 + 
				"\n십의 자리 : " + (nm%100)/10  +
				"\n일의 자리 : " + nm%10
				);
		
		
		char ci1 = 'a'; //문자 a 는 숫자로 97 
		int ci2 = ci1 + 1; //a1
		char cc3 = (char)ci2;
		
		//만약 char이 아닌 string이었다면 문자 + 1은 문자1 이지만 char은 한자리밖에 반영할수 없기
		//떄문에 숫자형으로 반영된다.
		char cc1 = 'a';
		char cc2 = (char)(cc1 + 1);
		System.out.println(cc2);
		
		System.out.printf("이름 : %s","김자바\n");
		System.out.printf("이름 : %s, 나이 : %d\n","김자바",25);
		System.out.printf("이름 : %6s, 나이 : %04d\n","김자바",25);
		//6s -> 길이를 6으로 LPAD, 04d -> 4자리에 나머진 0으로 LPAD
		System.out.printf("이름 : %s","김자바\n");
		System.out.println(String.format("이름 : %s", "김자바"));
		
		
		
		System.out.println("----------------------------------------");
		//스케너 연습하려고 주석 처리
//		int keyCode1;
//		
//		System.out.println("Keycode를 입력해 주세요");
//		keyCode1 = System.in.read();
//		System.out.println("Keycode = "+ keyCode1);
//		
//		System.out.println("Keycode를 입력해 주세요");
//		keyCode1 = System.in.read();
//		System.out.println("Keycode = "+ keyCode1);
//		
//		keyCode1 = System.in.read();
//		System.out.println("Keycode = "+ keyCode1);
//		
//		
//		keyCode1 = System.in.read();
//		System.out.println("Keycode = "+ keyCode1);
		
		Scanner scan = new Scanner(System.in); //ctrl shift o
//		String inputData = scan.nextLine();
//		System.out.println(inputData);
//		
//		String inputData2 = scan.next(); //next는 띄어쓰기 전까지만 출력한다.
//		System.out.println(inputData2);
//		
//		int inputData3 = scan.nextInt(); 
//		System.out.println("input = " + (inputData3*10));
		int input = scan.nextInt();
		System.out.print("x값을 입력 하세요");
		System.out.println("x = " + (input));
		
		
	} 
	
}


