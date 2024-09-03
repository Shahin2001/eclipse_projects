package com.assign3;

public class Assignment11 {
	double simpleInterest(double p, double r, double t) {
		return (p*r*t)/100;
	}
	public static void main(String[] args) {
		Assignment11 a=new Assignment11();
		double z=a.simpleInterest(3, 5,2);
		System.out.println(z);
	}

}
