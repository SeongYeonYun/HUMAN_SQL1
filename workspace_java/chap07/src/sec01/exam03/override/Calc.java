package sec01.exam03.override;

public class Calc {
	
	double areaCirlcle(double r) {
		
		System.out.println("Calc의 areaCircle");
		return r*r*Math.PI;
		
		
				
				
				
	}
	//클래스에 final을 붙히면 상속 금지
	
	public int plus(int x, int y) {
		System.out.println("plus실행");
		return x+y;
	}

}
