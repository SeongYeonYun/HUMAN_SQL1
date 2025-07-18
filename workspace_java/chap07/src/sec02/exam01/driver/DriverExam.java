package sec02.exam01.driver;

public class  DriverExam {
	public static void main(String[] args) {
		
		Tico tico = new Tico();
		Driver driver = new Driver();
		driver.driveTico(tico);
		
		Porsche911 p = new Porsche911();
		Car c1 = (Car) p;
		driver.drive(c1);
		
		BmwM4 b = new BmwM4();
		driver.drive((Car)b);
		
		driver.drive( (Car) new Tico());
		
		
		
		
		
	}
}
