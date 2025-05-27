package sec01.exam01;

public class TypeCastingExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 200;
		int b = (int)a;
		byte c = (byte)b;
		System.out.println(a + "\n" +  b + "\n" + c);
		
		double d = 3.14;
		int i = (int) d;
		System.out.println("d = " + d + "\ni = " + i);
		
		int i2 = 100;
		long li = (long)i2;
		long l2 = i2;
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7; //(double)i7+d7
		System.out.println("d8 = " + d8);
		
		//double d9 = 10/4; //10/4는 인트형의 연산 이기 때문에 2의 값을 반환함
		//double d9 = (double)10 / (double)4;
		double d9 = (double)10/4;
		System.out.println("d9 = " + d9);

		String s1 = "123";
		//int i8 = (int)s1; 숫자형 끼리 밖에 안딤
		
		int i8 = Integer.parseInt(s1); //String -> integer
		String s2 = ""+ i8;
		System.out.println("s2 = " + s2);
		
		
		
		String ss = "sdsd";
		ss = ss + i7;
//		int i10 = ss + i7; , 문자 + 숫자는 문자로 반환되기 떄문에 조심
		
		System.out.println(ss);
		
		//만약 내가 코드 짜다가 변수가 어느 타입인지 모를때 확인하는 법, 레퍼 클래스를 반환한다.
		Character CHR = 's';
		String s = "hello";
		System.out.println(CHR.getClass());          // class java.lang.String
		System.out.println(s.getClass().getName()); // java.lang.String
		
		Object boxed = d;
		System.out.println(boxed.getClass().getName()); // java.lang.Integer
		System.out.println(s.getClass().getSimpleName());
		
		
		//퀴즈
		//회식비 43000원, 4명일떄 인당 얼마?
		int cnt = 4;
		double price = 4.3;
		double h = (int)price/cnt ;
		double h_1 = price - (h * (cnt-1));
		System.out.println("h_1 = " + h_1);
		System.out.println("h = " + h);
		System.out.println("인당 만원당위로 " + h + "만원입니다");
		System.out.println("주최자는 " + h_1 + "만원입니다");
		//Math.ceil(h_1); 올림처리
		
		}
	}
	//byte < short < int < long < float< double
	
	


