package com.assign9;

public class F {

	public F() {
		System.out.println("default");
	}
	F(int n){
		this();
		System.out.println("1default");
	}
	F(int n,String s){
		this(5);
		System.out.println("2default");
	}
	F(int n,int m,int t){
		this(5,"abc");
		System.out.println("3default");
	}
	public static void main(String[] args) {
		F f=new F(2,8,9);
	}
	

}
