package sec01.exam01;

import java.util.Comparator;

public class ComparetorImpl implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		MemberDT0 dto1 = (MemberDT0)o1;
		MemberDT0 dto2 = (MemberDT0)o2;
		
		int result = dto1.age -dto2.age; //오름차순
		
		return result;
	}
	
}
