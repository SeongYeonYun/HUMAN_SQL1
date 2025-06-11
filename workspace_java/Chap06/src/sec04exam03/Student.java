package sec04exam03;

public class Student {
	public static void main(String[] args){
		StudentExam stud = new StudentExam();
		
		//학생 명부
		String[][] n_g = {{"sdsd", "10"},
				{"sㄴㅇㄴ", "40"},
				{"sdsㄴd", "10"}};
		
		//명부 입력
		stud.set_list(n_g);
		
		//명부 출력
		stud.print_name_age(n_g);
		
	//////////////////////////////////////////
		StudentExam stud2 = new StudentExam();
		stud2.name = "dbsd";
		stud2.age = 20;
		System.out.println(stud2.name);
		System.out.println(stud2.age);
		
		StudentExam stud3 = new StudentExam();
		stud3.name = "dbssd";
		stud3.age = 200;
		System.out.println(stud3.name);
		System.out.println(stud3.age);
		
		stud2.setName("ㄴㅇㄴ");
		System.out.println(stud2.name);
		
		String name = stud2.getName();
		System.out.println(name);
	}
}
