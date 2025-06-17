package src.sec04exam03;

public class StudentExam {
	/*
	 * 학생의 이름과 나이는 하나의 묶음이다.
	 * 때문에 하나의 배열로 받아 입력받는다.
	 * dictionary 가능할듯,hashmap이란게 자바에 있다.
	 */
	

	//String [이름, 나이]
	String [][] n_g;
	
	
	void set_list(String[][] a) {
		n_g = a;
		return;
	}
		
	void print_name_age(String[][] n_g) {

		for( int x = 0; x < n_g.length;x++) {
			System.out.println(
					String.format("%s의 나이는 %s살 입니다.",
							n_g[x][0],n_g[x][1]));
			}
		
		return;
		}
	///////////////////////////////////////////////
	String name;
	int age;
	void setName(String n) {
		name = n;
		return;
	}
	
	//이름 필드의 값을 돌려주는 메소드
	String getName() {
		return name;
	}
	
	void setInfo(String n, int a) {
		name = n;
		age = a;
	}
	String getInfo() {
		//String[] w = {name,""+age};
		return name +","+age;
	}
}

