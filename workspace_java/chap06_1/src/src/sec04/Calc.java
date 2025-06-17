package src.sec04;

public class Calc {
	
	//전원 켜기
	void powerOn() {
		System.out.println("전원이 켜짐");
	}
	/**
	 * javadoc 주석
	 * 계획을 적고 실핼하자
	 * 더하기 -> 두 수를 입력받아서 더한 결과를 돌려준다.
	 * 
	 * 메소드명 : add
	 * 전달인자 : double x, double y
	 * 리턴타임 : double
	 * 
	 * @param double x, double y
	 * @return double
	 * @author email
	 * @c 필드나 참조
	 */
	//더하기, 소숫점 세자리
	double add(double x, double y) {
		double result = x + y;
		System.out.printf("%.3f + %.3f = %.3f\n",x,y,result );
		return result;
	}
	//빼기, 소숫점 세자리
	double minus(double x, double y) {
		double result = x - y;
		System.out.printf("%.3f - %.3f = %.3f\n",x,y,result);
		return result;
	}
	//곱하기, 소숫점 세자리
	double multiply(double x, double y) {
		double result = x * y;
		System.out.printf("%.3f * %.3f = %.3f\n",x,y,result);
		return result;
	}
	/**
	 * 나누기 -> 두 수를 입력받아서 더한 결과를 돌려준다.
	 * 
	 * - 나누는 값이 0인 경우
	 * 메소드명 : divide
	 * 전달인자 : int x, int y
	 * 리턴타임 : double
	 * 
	 * -나누는 값이 0이 아닌 경우
	 * * 메소드명 : divide
	 * 전달인자 : int x, int y
	 * 리턴타임 : double double
	 * error code 출력
	 * 
	 * 
	 * @param double x, double y
	 * @return double
	 * 
	 * 
	 */
	//나누기, 소숫점 세자리
	int divide(int x, int y) {
		if(y !=0) {
			double result = (double)x /(double) y ;
			System.out.printf("%d / %d = %f\n",x,y,result);
			return 0;
		} else {
			System.out.println("Y = 0, Division Error"); //0으로 나눌 경우
			return 0;
		}
	}
	
	
		
	//전원 끄기
	void powerOff() {
		System.out.println("전원이 꺼짐");
	}
	//int배열의 모든 값을 더하는 메소드
	void sum(int[] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum = sum + array[i];
		}
	}
	
	
		
	
}
