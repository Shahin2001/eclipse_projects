package com.assign5;
import java.util.*;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=sc.nextInt();
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		sc.close();
		int area=l*b;
		System.out.println(area);
	}

}
