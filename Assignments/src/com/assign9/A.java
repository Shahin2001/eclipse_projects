package com.assign9;

public class A {
	int num1;
	int num2;
	
	A(){
		num1=10;
		num2=20;
		System.out.println("1 Constructor");
	}
	A(int a){
		num1=a;
		System.out.println("2 Constructor");
	}
	A(int a,int b){
		num1=a;
		num2=b;
		System.out.println("3 Constructor");
	}
	void display() {
		System.out.println("Num1:"+num1);
		System.out.println("Num2:"+num2);
	}
	
	public static void main(String[] args) {
		A a=new A();
		A a1=new A(30);
		A a2=new A(30,40);
		a.display();
		a1.display();
		a2.display();
	}

}
