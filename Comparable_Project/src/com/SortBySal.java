package com;

import java.util.Comparator;

public class SortBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
//		int s1=o1.getSalary();
//		int s2=o2.getSalary();
		return Integer.compare(o1.getSalary(), o2.getSalary());
	}

}
