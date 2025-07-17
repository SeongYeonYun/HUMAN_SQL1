package sec01.exam03.override;

public class Computer extends Calc {
	@Override // 부모에 똑같은 메서드가 선언되어 있는지 검사해줌
	double areaCirlcle(double r) {
		System.out.println("Computer areaCircle");
		return r*r*Math.PI;
				
				
				
	}
	
	
	
	@Override
	
	public int plus(int x , int y) {
		int result = super.plus(x,y);
		System.out.println("plus-----실행");
		System.out.println("정답은 "+ (x+y)+"입니다");
		return result;
		
	}

}
