package com.aug9;

public class Employee {
	private int eid;
	private String ename;
	private int esal;
	private String edept;
	public Employee(int id, String name, int sal, String dept) {
		
		eid = id;
		ename = name;
		esal = sal;
		edept = dept;
		
		System.out.println("Eid:"+eid+" Ename:"+ename+" Salary:"+esal+" Dept:"+edept);
	}
	
	public Employee() {
		
	}
	
	
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int id) {
		eid = id;
	}
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String name) {
	   ename = name;
	}
	
	
	public int getEsal() {
		return esal;
	}
	public void setEsal(int sal) {
		esal = sal;
	}
	
	
	
	public String getEdept() {
		return edept;
	}
	public void setEdept(String dept) {
		edept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + esal + ", dept=" +edept + "]";
	}
	
	
	

}
