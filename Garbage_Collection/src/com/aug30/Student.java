package com.aug30;

public class Student {
	Student(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	@Override
	protected void finalize(){
		System.out.println("Akhari Icchha");
	}
	

}
