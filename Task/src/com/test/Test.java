package com.test;

public class Test {
	public static void main(String[] args) {
		Shape s=new Rectangle(5, 6);
		Shape s1=new Circle(6);
		System.out.println(s.area());
		System.out.println(s1.area());
	}

}
