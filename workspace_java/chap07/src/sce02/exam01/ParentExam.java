package sce02.exam01;

public class ParentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1_1_0 parent1_1_0 = new Parent1_1_0();
		Parent1_1 p1_1 =  (Parent1_1)parent1_1_0;
		
		Parent1 p1 = p1_1;
		p1 = parent1_1_0;
		
		
		Parent1 pp1 = new Parent1_1_0();
		
		////////////////////////////////////////////////////////
		Parent1_2 p1_2 = new Parent1_2();
		Parent1 ppp1 = p1_2;
		pp1 = ppp1;
		//어차피 parent1이니까
		
		Parent1_2 pp1_2 = (Parent1_2)ppp1;
		//부모가 자식이 될떄는 가능하지만 그 반대는 연산자 생략 가능
		
		//runtime error 실핼해봐야 알수 있다
		Parent1_2 ppp1_2 =(Parent1_2)pp1;
		String a = null;
		System.out.println(a.length());
		
		
		

		

		

	}

}
