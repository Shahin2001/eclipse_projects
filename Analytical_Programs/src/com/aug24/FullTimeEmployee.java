package com.aug24;

public class FullTimeEmployee extends Employee {
	int hra=10000,da=20000;
	void display() {
//		this.hra=hra;
//		this.da=da;
		//super.display();
		
		int totalsalary=basicsalary+hra+da;
		System.out.println("Total salary is:"+totalsalary);
		
	}

}
