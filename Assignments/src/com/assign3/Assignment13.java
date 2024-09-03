package com.assign3;

public class Assignment13 {
	void result(double m1,double m2, double m3, double m4,double m5) {
		double percentage=((m1+m2+m3+m4+m5)/500)*100;
		System.out.println(percentage);
		
		
		
		if(percentage>=60) {
			System.out.println("First Division");
		}
		else if(percentage>=50 && percentage<=59 ) {
			System.out.println("Second Division");
		}
		else if(percentage>=40 && percentage<=49 ) {
			System.out.println("Third Division");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	
	public static void main(String[] args) {
		Assignment13 a=new Assignment13();
		a.result(50, 60, 44, 99, 51);
	}

}
