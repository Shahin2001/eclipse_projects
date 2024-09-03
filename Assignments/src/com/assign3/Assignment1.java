package com.assign3;

public class Assignment1 {
	int a;
	float b;
	String str;
	
	public void op1() {
		a=10;
		b=12.20f;
		str="java";
	}
	public void op2() {
		a=11;
		b=13.20f;
		str="Shahin";
	}
	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Assignment1 a=new Assignment1();
		a.op1();
		a.display();
		a.op2();
		a.display();
		
	}

}
