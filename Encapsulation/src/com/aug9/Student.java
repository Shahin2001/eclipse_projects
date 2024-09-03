package com.aug9;

public class Student {
	private int roll;
	private String name;
	private int marks;
	
	Student(int r,String n, int m){
		roll=r;
		name=n;
		marks=m;
	}
	
	public boolean setMarks(int new_marks,int pin) {
		if(pin==1234) {
			marks=new_marks;
			return true;
		}
			else {
				System.out.println();
				return false;
			}
			
		}
	public int getMarks(int pin) {
		if(pin==1234) {
			
			return marks;
		}
			else {
				System.out.println("Invalid Pin..");
				return -1;
			}
			
		}
	
	
	
	public boolean setRoll(int new_roll,int pin) {
		if(pin==1234) {
			roll=new_roll;
			return true;
		}
			else {
				System.out.println();
				return false;
			}
			
		}
	public int getRoll(int pin) {
		if(pin==1234) {
			
			return roll;
		}
			else {
				System.out.println("Invalid Pin..");
				return -1;
			}
			
		}
	
	
	
	public boolean setName(String new_name,int pin) {
		if(pin==1234) {
			name=new_name;
			return true;
		}
			else {
				System.out.println();
				return false;
			}
			
		}
	public String getName(int pin) {
		if(pin==1234) {
			
			return name;
		}
			else {
				System.out.println("Invalid Pin..");
				return  "Invalid";
			}
			
		}
	
	
		
	}

