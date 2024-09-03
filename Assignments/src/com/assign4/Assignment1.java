package com.assign4;
import java.util.*;


public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt() ;
		System.out.println("Enter b:");
		int b=sc.nextInt();
		sc.close();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println("Sum is:"+sum);
		System.out.println("Sub is:"+sub);
		System.out.println("Mul is:"+mul);
		System.out.println("Div is:"+div);
	}

}
