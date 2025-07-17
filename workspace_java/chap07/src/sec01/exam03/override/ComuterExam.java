package sec01.exam03.override;

public class ComuterExam {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calc calc = new Calc();
		Computer computer = new Computer();
		System.out.println(calc.areaCirlcle(10));
		
		System.out.println("정답은 "+ computer.plus(10,20)+"입니다");
	}

}
