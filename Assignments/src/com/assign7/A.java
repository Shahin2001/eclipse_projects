package com.assign7;

public class A {
	private void m1() {
		System.out.println("111");
	}
	 void m2() {
		System.out.println("1111");
	}
	protected void m3() {
		System.out.println("11111");
	}
	public void m4() {
		System.out.println("111111");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}

}
