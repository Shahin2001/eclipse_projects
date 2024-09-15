package com.set;

import java.util.Set;
import java.util.TreeSet;

public class B {
	public static void main(String[] args) {
		Set<Integer> db=new TreeSet<Integer>();
		Set<Integer> db1=new TreeSet<Integer>();
		db.add(6);
		db.add(2);
		db.add(2);
		db.add(5);
		db.add(9);
		db.add(1);
		db.add(0);
		db.add(7);
		db1=db;
		
		
		System.out.println(db);
		
		for(Object b:db) {
			System.out.println(b);
		}
	}

}
