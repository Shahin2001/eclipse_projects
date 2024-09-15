package com.sep10;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student("abc",2,45666);
		Student s1=new Student("abcd",9,45000);
		Student s2=new Student("abcde",4,45788);
		Student s3=new Student("abcdef",8,456);
		
		List<Student> show=new ArrayList<Student>();
		
		show.add(s);
	    show.add(s1);
		show.add(s2);
		show.add(s3);
		
		System.out.println(show);
		
		for(Student i:show) {
			System.out.println(i);
		}
	}

}
