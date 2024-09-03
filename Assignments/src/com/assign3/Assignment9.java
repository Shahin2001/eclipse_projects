package com.assign3;

public class Assignment9 {
	int length;
	int breadth;
	
	void rectangle(int l, int b) {
		length=l;
		breadth=b;
	}
	 
	int getArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		Assignment9 a=new Assignment9();
		a.rectangle(30, 6);
		System.out.println(a.getArea());
	}

}
