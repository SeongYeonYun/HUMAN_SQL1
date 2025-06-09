package chap05;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1호점 
		String [] menu =new String[2];
		menu [0] = "자바칩푸라푸치노";
		menu [1] = "말차라때";
		
		//2호점
		//얕은 복사
		String[] menu2 = new String[3];
		menu2[0] = menu [0];
		menu2[1] = menu [1];
		menu2[2] = "딸기라떄";
		
		//Array list사용법
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(menu);
		//system.out.println(Arrays.toString(list));
		System.out.println("list size = " + list.size());
//		if(list.get(2) == null) {
//			System.out.println("sdsdd");
//		}
//		
		System.out.println(list);
		//만약 배열이 들어간다면 배열의 길이 만큼 에러
		//length  메서드 불가능
		
		for (int i = 0; i< list.size();i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList <String> list2 = new ArrayList();
		list2.add("sd");
		list2.add("QFSD");
		//자료형 확인 list2.add(111);
		
		for(String data : list2) {
			System.out.println(data);
		}
		
		
		
		//2호점에서 메뉴 추가
		
		
	}

}
