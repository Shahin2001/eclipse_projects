package com.aug13;

public class StudentTest {
	public static void main(String[] args) {
		OverloadStudent s1=new OverloadStudent();
		OverloadStudent s2=new OverloadStudent(23);
		OverloadStudent s3=new OverloadStudent(34,"sha");
		OverloadStudent s4=new OverloadStudent(56,"abc",78);
		
		s1.m1();
		s1.m1(45);
		
		OverloadStudent.m2();
		OverloadStudent.m2(45);
		
	}
	
	public static void main(int
			[] args) {
		OverloadStudent s1=new OverloadStudent();
		OverloadStudent s2=new OverloadStudent(23);
		OverloadStudent s3=new OverloadStudent(34,"sha");
		OverloadStudent s4=new OverloadStudent(56,"abc",78);
		
		s1.m1();
		s1.m1(45);
		
		OverloadStudent.m2();
		OverloadStudent.m2(45);
		
	}

}
