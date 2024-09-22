package com.test;

public class Circle extends Shape{
	int res;
	public Circle(int r) {
		res=(int) (3.14*(r*r));
	}
	int area() {
		return res;
	}

}
