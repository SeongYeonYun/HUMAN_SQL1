package DTO;

import java.sql.Date;

public class DTO {
	private  String ename;
	private Date hiredate; 
	private int empno;
	
	public String getename() {
		return ename;
	}
	public void setename(String ename) {
		this.ename = ename;
	}
	
	public Date gethiredate() {
		return hiredate;
	}
	public void sethiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	
	public int getempno() {
		return empno;
	}
	public void setempno(int empno) {
		this.empno = empno;
	}

	@Override
	public String toString() {
		return "DTO [ename=" + ename + ", hiredate=" + hiredate + ", empno=" + empno+"]";
	}
	

}
