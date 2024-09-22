package com.test;

public class Rectangle extends Shape {
	int res;
	public Rectangle(int l,int b) {
		 res=l*b;
	}
	int area() {
		return res;
	}
	

}
