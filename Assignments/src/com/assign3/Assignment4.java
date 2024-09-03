package com.assign3;

public class Assignment4 {
	boolean a=true;
	
	void check() {
		if(a==true) {
			a=false;
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Assignment4 b=new Assignment4();
		b.check();
		System.out.println(b.a);
	}

}
