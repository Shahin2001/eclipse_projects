package com.test;

import java.util.List;

import com.controller.StudentController;
import com.entity.Student;

public class Test {
	public static void main(String[] args) {
		StudentController s=new StudentController();
		List<Student> ss=s.getAllStudentController();
		System.out.println(ss);
	}

}
