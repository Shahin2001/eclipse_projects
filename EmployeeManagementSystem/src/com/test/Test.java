package com.test;

import com.controller.Controller;
import com.entity.Employee;

public class Test {
	public static void main(String[] args) {
		Controller c = new Controller();
		
		
		System.out.println("Detail of single entity:");
        Employee e3=c.control();
        System.out.println(e3);
		
		
		
		System.out.println("Detail of multiple entities:");
		Employee e[] = c.controll();

//		for (int i = 0; i < e.length; i++) {
//			System.out.println(e[i]);
//		}
		
		
		for(Employee e1:e) {
			//System.out.println(e1);
			//System.out.println(e1.getId());
//			if(e1.getSal()>1000) {
//				System.out.println(e1.getSal());
			if(e1.getSal()>1000) {
				e1.setSal(1000);
				System.out.println(e1.getSal());
			
			}
//			System.out.println(e1.getSal());
		}

	}

}
