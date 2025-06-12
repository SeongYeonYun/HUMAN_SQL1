package quiz;

public class FruitsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits_2 fruits = new Fruits_2();
		fruits.ask("banana",3);
		fruits.pay("banana",3 , 10000);
		fruits.deliver();
		fruits.pay("apple",2 , 10000);
		fruits.deliver();
		fruits.income("apple",5);
	}

}
