package com.service;

import com.dao.Dao;
import com.entity.Employee;

public class Service {
	Dao d;

	public Employee s1() {
		d = new Dao();
		Employee e1 = d.e();
		return e1;
	}
	

	
	Dao d1;
	public Employee[] s2() {
		d1=new Dao();
		Employee[] e1=d1.e(3);
		return e1;
	}

}
