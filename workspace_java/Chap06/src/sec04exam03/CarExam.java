package sec04exam03;

public class CarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		boolean status = car.isLeftGas();
		System.out.println("가스 남았나?" + status);
		
		car.gas = 3;
		car.setGas(3);
		status = car.isLeftGas();
		if(status) {
//			if( car.isLeftGas() ) {
				System.out.println("출발~!");
				car.run();
			}
		Car2 c2 = new Car2();
		c2.setGas(3);
		c2.run();
		
		
		
	
	}
}
		

