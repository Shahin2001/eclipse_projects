package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Map<Integer,String> s=new HashMap<Integer,String>();
		
		while(true) {
			System.out.println("Student Management System");
			System.out.println("1.Add Student Record");
			System.out.println("2.Delete Student Record");
			System.out.println("3.Display all Student Record");
			
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Student RollNo:");
				int roll=sc.nextInt();
				
				System.out.println("Enter Student Name:");
				String nm=sc.next();
				
				s.put(roll, nm);
				System.out.println("Student Record Added Successfully");
				break;
				
			case 2:
				System.out.println("Enter Student RollNo To Remove:");
				 roll=sc.nextInt();
				 if(s.containsKey(roll)) {
					 s.remove(roll);
					 System.out.println("Student Removed Successfully");
				 }
				 else {
					 System.out.println("Student not found");
				 }
				 break;
				 
			case 3:
				System.out.println("All Students Record:");
				 if (s.isEmpty()) {
                     System.out.println("No records found.");
                 } else {
                     
                     for (Map.Entry<Integer, String> entry : s.entrySet()) {
                         System.out.println("RollNo: " + entry.getKey() + ", Name: " + entry.getValue());
                     }
                 }
                 break;

             default:
                 System.out.println("Invalid choice. Please try again.");
				
			}
		}
	}

}
