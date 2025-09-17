package kr.or.human2.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("dao1") //만약에 이름이 없으면 앞글자만 소문자이게 빈으로 등록

@Primary //aotuwired 가 가져올수 있는 클래스가 두개 이상인 경우, 유일하게 primary가 붙은 클래스를 찾는다.


public class MemberDAOImpl implements MemberDAO {

	@Override
	public List select() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);

		
		return list;
	}


}
