package pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	private long empno;
	private String ename;
	private String job;
	private long mgr;
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private long deptno;

	public Empleado() {
	}
	
	public Empleado(long empno, String ename, String job, long mgr,
			Date hiredate, BigDecimal sal, BigDecimal comm, long deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public long getEmpno() {
		return this.empno;
	}

	public void setEmpno(long empno) {
		this.empno = empno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public long getMgr() {
		return this.mgr;
	}

	public void setMgr(long mgr) {
		this.mgr = mgr;
	}	

	public Date getHiredate() {
		return this.hiredate;
	}	
	
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}	

	public BigDecimal getSal() {
		return this.sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	
	public BigDecimal getComm() {
		return this.comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public long getDeptno() {
		return deptno;
	}

	public void setDeptno(long deptno) {
		this.deptno = deptno;
	}
	
	

}
