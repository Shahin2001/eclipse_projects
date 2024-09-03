package com.aug13;

public class OverloadStudent {
	int roll;
	String name;
	int marks;
	
	OverloadStudent(){
		System.out.println("zero parameter"); 
	}
	
	OverloadStudent(int r){
		System.out.println("one parameter"+r); 
	}
	
	OverloadStudent(int r, String n){
		System.out.println("two parameter"+r+n); 
	}
	
	OverloadStudent(int r, String n, int m){
		System.out.println("three parameter"+r+n+m); 
	}
	
	void m1() {
		System.out.println("zero parameter method"); 
	}
	
    void m1(int p) {
    	System.out.println("one parameter method"+p); 
	}
    
    static void m2() {
    	System.out.println("zero parameter static method"); 
    }
    
    static void m2(int p) {
    	System.out.println("one parameter static method"+p); 
    }


}
