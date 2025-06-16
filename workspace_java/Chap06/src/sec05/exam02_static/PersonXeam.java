package sec05.exam02_static;

public class PersonXeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("sdsds","tjduds");
		
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
		p1.name = "성연";
		System.out.println(p1.name);
	}

}
