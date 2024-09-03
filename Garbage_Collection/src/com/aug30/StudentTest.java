package com.aug30;

public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student(1,55);
		s=null;
		
		System.gc();
		
		
	}

}
