package com.controller;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeDao d=new EmployeeDao();
	    System.out.println("All Employee Details");
		d.showAllEmp();
		System.out.println();
		
		System.out.println("Employee Details by Id");
		Employee e1=d.showById(11);
		System.out.println(e1);
		System.out.println();
		
		System.out.println("Max Salary Employee Details");
		Employee e2=d.empMaxSal();
		System.out.println(e2);
		System.out.println();
		
		System.out.println("Min Salary Employee Details");
		Employee e3=d.empMinSal();
		System.out.println(e3);
		System.out.println();
		
		System.out.println("Employee Details by Role");
		d.empByRole("hr");
		System.out.println();
		
		System.out.println("Employee Details in Ascending order");
		Employee[] e4=d.empAsc();
		for(Employee e:e4) {
			System.out.println(e);
		}
		System.out.println();
		
		System.out.println("Employee Details in Descending order");
		Employee[] e5=d.empDesc();
		for(Employee e:e5) {
			System.out.println(e);
		}
		
		
		
		}
	}


