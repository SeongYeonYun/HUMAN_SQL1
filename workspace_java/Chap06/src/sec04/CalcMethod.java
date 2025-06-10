package sec04;

public class CalcMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		calc.powerOn();
		double sum = calc.add(10, 3);
		System.out.println(sum);
		calc.divide(10, 4);
		calc.powerOff();
	}

}
