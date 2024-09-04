package com.sep4;

public class A {
	public static void main(String[] args) {
		System.out.println(4/2);
		System.out.println(10/5);
		try {
			System.out.println(4/0);
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			System.out.println("Infinity");
		}
//		finally {
//			System.out.println("Infinity");
//		}
		
			
		System.out.println(4/10);
	}

}
