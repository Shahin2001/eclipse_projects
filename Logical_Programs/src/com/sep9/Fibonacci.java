package com.sep9;

public class Fibonacci {
	public static void main(String[] args) {
		int a=0,b=1,n=5,c;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			
		}
	}
	

}
