package com.controller;

import java.util.List;

import com.entity.Student;
import com.service.StudentService;

public class StudentController {
	
StudentService service=null;
	
	public List<Student> getAllStudentController(){
		
		
		service=new StudentService();
		List<Student> db=service.getAllStudentService();
		return db;
		
	}

}
