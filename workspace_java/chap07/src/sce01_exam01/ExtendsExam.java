package sce01_exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//child를 new하고 print 이름 실행
			Child a = new Child();
//			a.getName();
			a.printName();
			a.setName("바뀐이름");
			System.out.println(a.name);
			
			parent p = new parent();
			p.getName();
			System.out.println(p.name);
			
			
		
		

	}

}
