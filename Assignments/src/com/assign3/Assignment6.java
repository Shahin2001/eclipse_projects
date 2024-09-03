package com.assign3;

public class Assignment6 {
	int x=10, y=20;
	float z;
	
	void add() {
		z=x+y;
		System.out.println(z);
	}
	
	void sub() {
		z=x-y;
		System.out.println(z);
	}
	
	void mul() {
		z=x*y;
		System.out.println(z);
	}
	
	void div() {
		z=x/y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Assignment6 a=new Assignment6();
		a.add();
		a.sub();
		a.mul();
		a.div();
	}
	

}
