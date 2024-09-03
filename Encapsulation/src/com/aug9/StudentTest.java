package com.aug9;

public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student(1, "abc", 55);
		System.out.println(s.setMarks(100,1234));
		System.out.println(s.getMarks(1234));
		System.out.println(s.setRoll(11,123));
		System.out.println(s.getRoll(123));
		System.out.println(s.setName("Shahin",1234));
		System.out.println(s.getName(1234));
	}

}
