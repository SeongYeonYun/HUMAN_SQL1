package sec01.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDT0 m1 = new MemberDT0();
		MemberDT0 m2 = new MemberDT0();
		MemberDT0 m3 = new MemberDT0();
		
		m1.name = "이름 1";
		m1.age = 25;
		m2.name = "이름 2";
		m2.age = 32;
		m3.name = "이름 3";
		m3.age = 19;
		
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Comparator c1 = new ComparetorImpl();
		Comparator c2 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				MemberDT0 dto1 = (MemberDT0)o1;
				MemberDT0 dto2 = (MemberDT0)o2;
				
				int result = dto1.age -dto2.age; //오름차순
				
				return result;
				}		
			};
			

		}
	}
