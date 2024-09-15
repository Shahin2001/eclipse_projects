package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {
	
	public List<Student> getAllStudentDao(){
		
		List<Student> db=new ArrayList<Student>();
		
		db.add(new Student("Shaina",2,45000));
		db.add(new Student("Sha",3,15000));
		db.add(new Student("Abc",8,55000));
		db.add(new Student("Abcde",7,5000));
		db.add(new Student("Shahin",1,45500));
		
		return db;
		
	}

}
