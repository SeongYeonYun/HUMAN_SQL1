package sec05.exam02_static;

public class CalcExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calc,pi = "+Calc.pi);
		
		System.out.println(Calc.a);
		Calc c1 = new Calc();
		c1.color = "black";
		c1.pi = 3.141592;
		System.out.println("c1,pi = "+c1.pi);
		
		Calc c2 = new Calc();
		c1.color = "red";
		System.out.println("c1,pi = "+c1.pi);
		
		System.out.println("Calc,pi = "+Calc.pi);
	}

}
