package com.assign3;

public class Assignment12 {
	double simpleInterest(double p, double r, double t) {
		return p*Math.pow(1+(r/100) , t)-p;
	}
	public static void main(String[] args) {
		Assignment12 a=new Assignment12();
		double z=a.simpleInterest(3, 5,2);
		System.out.println(z);
	}

}
