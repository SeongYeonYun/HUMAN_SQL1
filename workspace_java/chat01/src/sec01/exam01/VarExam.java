package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long value = 3000;
		int result = (int)value;
		//int result = value;		
		//long형의 경우 사용하는 메모리 크기가 더 크기때문에 int로 선언된  변수에는 넣을수가 없다.
		
		System.out.println("결과  : " + result);
		System.out.println("결과  : " + result+1);
		System.out.println("결과  : " + result);
		System.out.println("결과  : " + result);
		System.out.println("결과  : " + result);
		System.out.println("결과  : " + result);
		//ctrl + alt + 위아래 방향키 -> 복사, 붙혀널기
	}
}



//지역변수 : 변수는 성언 이루에 사용사능하다.
//변수의 생명주기, 그 지역이 끝날때까지 사용 가능하다. 지역이란 {}안의 영역을 말한다. 지역 안에 다른 지역이 있더라도
//사용이 가능하다. 선언하지 않은 변수는 사용할수 없다.