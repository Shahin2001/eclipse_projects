package com.controller;

import com.dao.Service;
import com.entity.Student;

public class STest {
	public static void main(String[] args) {
		
		Service service=new Service();
		Student s1=service.s1();
		System.out.println(s1);
	}
	

}
