package quiz;

public class Study {
	void getAnswer(student student, String q) {
		System.out.println(q + "에 대하여");
		System.out.println(student.name + "에게 물어봅니다.");
		System.out.println(student.name + "의 대답은 ."+ student.answer(q));
//		return student.answer(q);//학생별 질문
		
	}

}
