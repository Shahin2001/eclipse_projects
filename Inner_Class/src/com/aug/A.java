package com.aug;

public class A {
	
	void display() {
		
		System.out.println("Outer");
		B b=new B();
		b.display();
	}
	
	class B {
		void display() {
			System.out.println("Inter");
		}
		}
	
	public static void main(String[] args) {
		A a=new A();
		a.display();
	}
}


