package com.assign4;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter String");
		String str=sc.nextLine();
		sc.close();
		System.out.println(num);
		System.out.println(str);
		
	}

}
