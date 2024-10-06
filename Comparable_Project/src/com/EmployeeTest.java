package com;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"shaina",45000);
		Employee e2=new Employee(5,"shan",5000);
		Employee e3=new Employee(2,"shanaya",55000);
		Employee e4=new Employee(3,"neil",500000);
		Employee e5=new Employee(4,"piya",51000);
		ArrayList<Employee> a=new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		Collections.sort(a);
		System.out.println("Sorted by id");
		for(Employee emp:a) {
			System.out.println(emp);
		}
		System.out.println("Sorted by salary");
		SortBySal sortBySal = new SortBySal();  // Instantiate SortBySal
        Collections.sort(a, sortBySal);
		
		for(Employee emp:a) {
			System.out.println(emp);
		}
	}

}
