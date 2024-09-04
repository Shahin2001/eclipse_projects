package com.sep4;

public class Factorial {
	
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		//Factorial f=new Factorial()
		//int n=5;
		//int result=;
		System.out.println(Factorial.fact(5));
		
		
		
		
		
		
		
		
//		int n=4,fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
	}

}
