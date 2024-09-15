package com.service;

import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {
	
	StudentDao dao=null;
	
	public List<Student> getAllStudentService(){
		
		
		dao=new StudentDao();
		List<Student> db=dao.getAllStudentDao();
		return db;
		
	}

}
