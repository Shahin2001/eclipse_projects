package com.dao;

import com.entity.Employee;

public class Dao {
	public Employee e() {
		return new Employee(101, "Shaina", 20000);
	}

	
	
	public Employee[] e(int size){
		Employee db[]=new Employee[size];
		db[0]=new Employee(101,"abc",1000);
		db[1]=new Employee(102,"abcd",10000);
		db[2]=new Employee(103,"abcde",110000);
		return db;
		
	}
}
