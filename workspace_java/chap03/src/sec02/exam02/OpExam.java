package sec02.exam02;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		
//		x++;
//		
//		System.out.println("x : " + x);
//		
//		++x;
//		System.out.println("x : " + x);
//		
//		x= x+3 ;//x +=3,	x++(1을 증가할떄만)
//		System.out.println("x : " + x);
//		
//		y--;
//		--y;
//		System.out.println("y : " + y);
//		
		int z;
//		System.out.println("z : " + z);
//		
//		x= 10;
//		z = x++;
//		System.out.println("z : " + z);
//		System.out.println("x : " + x);
//		
//		x = 10;
//		System.out.println("x++ : " + x++);
//		System.out.println("++x : " + ++x);
//		System.out.println("x : " + x);
//		
///////////////////////////////////////////////////////////////////////////		
		x = 10;
		z = x++ + ++x; 
		/*
		 * ----------------연산순서---------------------------------
		 * x의 값이 10이 z에 대입된다. 
		 * x값이 1커진다.(x++), x = 11, z = 10
		 * x의 값이 1 증가한후 연산된다(++x), x = 12, z = 10 + 12 
		 * 
		 */
		System.out.println("x : " + x);
		System.out.println("z : " + z);
		System.out.println("----------------------------------");
		x = 1;
		//z = x++ - --x * x++ - x--;	 
		int v1 = --x * x++;
		System.out.println("v1 : " + v1);
		System.out.println("x : " + x);
		
		int v2 = x++ - v1;
		System.out.println("v2 : " + v2);
		System.out.println("x : " + x);
		
		int v3 = v2 - x--;
		System.out.println("v3 : " + v3);
		System.out.println("x : " + x);
		
		System.out.println("x : " + x);
		//System.out.println("z : " + z);
			
		/*
		 * z = -2  x = 1  단항 연산자 먼저 연산한후 곱셈먼저 연산한다.
		 * 
		*/
		System.out.println("----------------------------------");	
		boolean a = false ;
		a = !a;
		System.out.println("a : " + a); // ! is mean not
		
		double d = 7.3;
		double e = d/0;
		System.out.println("e : " + e);
		
		boolean f = true;
		System.out.println("f : " + f);
		boolean w = (0.1==0.1f);
		System.out.println(w); //소수점을 비교 할떄는 같은 타입을 비교
		
		String s1 = "s1";
		String s2 = "s1";
		String s3 = "s1"+1;
		
		System.out.println(s1 == s2);
		System.out.println("s3 = "+ s3);
		System.out.println(s1.equals(s2)); //String을 비교할떄 무조건 equals로 비교한다.
		
		//퀴즈
//		돈이 만원 있다.
//		1.4500원짜리 프라포치노 를 최대 몇잔 살수 있는가?
//		2.그리고 나은 돈
		
		int money = 10000;
		int price = 4500;
		System.out.printf("나는 프라포치노를 %d잔 살수 있다.", (money/price));
		System.out.printf("\n나는 %d원 남았다", (money%price));
		
		//만약 몫을 구하고 싶은게 아닌 소수점자리까지 구하고 깊은경우 
		//int가 아닌 다른 형태로 바꾼후 포멧형을 바꿔야 한다.
		
		//올리브영에 꿀홍차가 8000원가 15%세일중이다. 그럼 나는 얼라믈 줘야 할까??
		int honey_tea = 8000;
		double honey_price  = honey_tea * (85/100.0);
		
//		double honey_price  = honey_tea - (honey_tea * 0.15);
		System.out.printf("\n나는 %f원을 내야 한다.", honey_price);
		
		double discnt_ratio = (double) 15/100;
		System.out.printf("\n" + discnt_ratio); //????????????????????????
		
		
		int score = 87;
		System.out.println("\n내 점수는 80~90사이다");
		System.out.println(score >=80 && score<=90);
		//소수점 셋쨰자리 까지
		double value1 = 1000.0;
		double value2 = 794.0;
		
		System.out.println(Math.round((value1/value2)*1000)/1000.0); //정답
		System.out.println((int)((value1/value2)*1000)/1000.0);
		
		int score2 = 95;
		char grade = (score2 > 90) ? 'A' : 'B'; 
		System.out.println(grade);
	}

}
