package com.assign5;
import java.util.*;

public class Assignment6 {
       final static  double PI = 3.14;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		double r=sc.nextInt();
		sc.close();
		double area = PI * Math.pow(r, 2);
        double circumference = 2 * PI * r;
        System.out.println(area);
        System.out.println(circumference);
	}

}
