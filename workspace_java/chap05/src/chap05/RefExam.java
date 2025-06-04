package chap05;

public class RefExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = a;
		
		
		String c = "윤성연";
		//을 기준으로 오른쪽 먼지 실행된다.
		//"윤성연"을 heap영역의 비어있는 번지에 할당
		//stack 영역의 변수 c에 방금 그 번지를 저장
		System.out.println(a==b);
		// ==이나 !=은 무조건 stack값을 본다.

		
		
		System.out.println(String.format("a = %d , b = %d",a ,b));
		String d = new String("윤성연"); //new는 무조건 새로운 자리에 행성
		
		System.out.println( String.format("c =d : %b" , c==d));
		System.out.println(c.equals(d));
		//String값 비교는 무조건 equals를 사용한다.
		
		String e =d; // =은 스택의 값을 이동시키는 역할을 한다
		System.out.println(String.format("e =c : %b" , e==c));
		System.out.println(e==c);
		System.out.println(c.equals(e));
		System.out.println(c.equals(d));
		String f = "윤" + "성" + "연";
		System.out.println(c==f);
		String h ="";
	
		String g = null; //java.lang.NullPointerException
		System.out.println("g == null " + (g == null));
		System.out.println("g + 'abc' : " + (g + "abc"));
		System.out.println("h.equals' : " + (h.equals(g)));
		if(g != null) { //방어 코딩
			System.out.println("g.equals' : " + (g.equals(h)));
		}
		
		
		
		System.out.println(c==d);
		System.out.println(f.equals(c));
		//a는 다른것을 참조하지 않는 기본타입 이기 떄문에 a=null이 뷸가능하다.
	      //참조타입은 null을 넣을수 있다.
		
	
	}

}
