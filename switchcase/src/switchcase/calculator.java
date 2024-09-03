package switchcase;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean calculator =true;
		
		while(calculator) {
			System.out.println("1.Addition   2.Subtraction    3.Multiplication     4.Division");
			System.out.println("Enter a choice:");
			int ch=sc.nextInt();
			
			if(ch==5) {
				calculator=false;
				System.out.println("End!!!!!!!!!!!!!!");
				break;
			}
			if(ch>=1 && ch<=4) {
				
			
			System.out.println("Enter value of a:");
			int a=sc.nextInt();
			System.out.println("Enter value of b:");
			int b=sc.nextInt();
			
			
			switch(ch) {
			case 1:
				int add=a+b;
				System.out.println("Result is:"+add);
				break;
				
				
			case 2:
				int sub=a-b;
				System.out.println("Result is:"+sub);
				break;
				
				
			case 3:
				int mul=a*b;
				System.out.println("Result is:"+mul);
				break;
				
				
			case 4:
				int div=a/b;
				System.out.println("Result is:"+div);
				break;
				
			}
			}
				
			else {
				
				System.out.println("Invalid input");
			}
				
			
		}}
			
		}
		
	


