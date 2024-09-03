package com.aug8;

public class A {
	 void m1() {
		System.out.println("111");
	}
	
	void m2() {
		System.out.println("222");
	}
	
    A(){
		System.out.println("Constructor A running");
	}
	
	public static void main(String[] args) {
		A a=new A();
		
		a.m1();
	}
	
	


}
