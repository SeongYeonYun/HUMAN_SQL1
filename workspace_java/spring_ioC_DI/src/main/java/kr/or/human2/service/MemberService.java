package kr.or.human2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human2.DAO.MemberDAO;
import kr.or.human2.DAO.MemberDAOImpl;


@Service  //dao는 레초지터리, 서비스는 빈으로 등록시키는 컴포넌트 역할을 해준다.
public class MemberService {
	
	
	//DAO CALL 강한 의존
//	public List getList() {
//		MemberDAOImpl memberDAO = new MemberDAOImpl();
//		return memberDAO.select();
//	}
	
	//전달 받아서 의존성을 낮춘상태
	public List getList() {
		return memberDAO.select();
	}
	
	@Autowired	
	@Qualifier("dao1")  //한정자, 이 빈 이름을 쓰게됨

	// Q : 등록된 빈들을 어덯게 보더라???
	//자동으로 엮어준다. 스프링에 등록된 빈들중에서 밑에 있는거로자동 형변환 된느것을 찾아 new해서 넣어줌
	
	
	private MemberDAO memberDAO = null;
//	public void serMemberDAO(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//		
//	}

}
