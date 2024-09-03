package firstproject;

import java.util.Scanner;

public class A {
	
	public static class Add{
		
		int addition(int num1, int num2) {
			return num1+num2;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		
		Add ad=new Add();
		int result=ad.addition(a,b);
		System.out.println(result);
		sc.close();
	}

}
