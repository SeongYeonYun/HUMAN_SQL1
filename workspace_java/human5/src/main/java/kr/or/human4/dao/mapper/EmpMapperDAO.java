package kr.or.human4.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human4.dto.EmpDTO;

@Mapper
public interface EmpMapperDAO {
	
	List<EmpDTO> selectEmp();
	
	@Select("select * from emp where empno = #{empno}")
	EmpDTO detail(@Param("empno") int empno);
	//param의 내용은 #{}안의 것과 unt empno가 같으면 생략이 가능하다.
	
	@Select("select * from emp where empno = #{empno}")
	EmpDTO detail2(int empno);
	//param의 내용은 #{}안의 것과 unt empno가 같으면 생략이 가능하다.
	
	
}
