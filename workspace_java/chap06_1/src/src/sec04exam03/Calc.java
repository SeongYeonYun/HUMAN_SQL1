package src.sec04exam03;

public class Calc {
	//두수를 입력받아 더힌 결과를 덜려주는 plus
	
	/** 
	 * @param x 
	 * @param y
	 * @return x+y
	 */
//	int plus(int x,int y) {
//		System.out.println("int int 실행");
//		System.out.println(x+y);
//		return x+y;
//	}
	

	
	//오버로딩, 전달인자가 다를경우 해당된다.
	double plus(double x, double y) {
		System.out.println("더블 더블 실행");
		System.out.println(x+y);
		return x+y;
	}
	double plus(int x, double y) {
		System.out.println("int 더블 실행");
		System.out.println(x+y);
		return x+y;
	}
	
	
	/** 
	 * @param x 
	 * @param y
	 * @return result = (x+y)/2
	 */
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute(int a1, int a2) {
		double result = avg(a1,a2);
		System.out.println(a1 + "과"+ a2 + "의 평균은" + result);
		
	} 
	
}
