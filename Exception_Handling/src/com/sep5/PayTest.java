package com.sep5;

public class PayTest {
	public static void main(String[] args) {
		GPay g=new SBI();
		
		try {
			g.payNow(500);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		
	}

}
