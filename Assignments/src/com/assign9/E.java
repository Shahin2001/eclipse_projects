package com.assign9;

public class E extends D {
	void show() {
		System.out.println("child");
	}
	
	void add() {
		show();
		super.show();
	}
	public static void main(String[] args) {
		E e=new E();
		e.add();
		e.show();
	}

}
