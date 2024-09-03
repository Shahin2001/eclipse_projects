package com.assign9;

public class B {
	int num1;
	int num2;
	
	B(){
		 num1=10;
		 num2=20;
		System.out.println("Constructor");
	}
	
	void display() {
		System.out.println(num1);
		System.out.println(num2);
	}
	public static void main(String[] args) {
		B b=new B();
		b.display();
	}

}
