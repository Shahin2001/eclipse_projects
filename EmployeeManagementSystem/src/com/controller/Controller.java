package com.controller;

import com.entity.Employee;
import com.service.Service;

public class Controller {
	Service service;

	public Employee control() {
		service = new Service();
		Employee e2 = service.s1();
		return e2;
	}
	
	
	
	Service service1;
	public Employee[] controll() {
		service1=new Service();
		Employee[] e2=service1.s2();
		return e2;
	}

}
