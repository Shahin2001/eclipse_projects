package com.sep5;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		try {
			// System.out.println("Enter age");
			int age = sc.nextInt();
			
				try {
					if (age <= 18) {
						AgeTooLow e = new AgeTooLow();
						throw new AgeTooLow();
					}
					
				}
				catch(AgeTooLow e) {
					System.out.println("Toooooo Low");
					
				}

				

			try{
				 if (age >= 75) {
				
					AgeTooHigh e1 = new AgeTooHigh();
					throw new AgeTooHigh();

			    } 
			}
			catch(AgeTooHigh e) {
				System.out.println("Toooo High");
			}
			
			
			if(age>=18&& age<=75){
				System.out.println("Welcome to RTO");
			}
		} catch (Exception e) {
			System.out.println("Enter correct input");
		}
		

	}

}
