package com.assign9;

public class Child extends Parent {

	public Child() {
		super();
		System.out.println("Sub");
	}
	void display() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
	}
	

}
