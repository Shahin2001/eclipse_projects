package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class A {
	public static void main(String[] args) {
		Set db=new LinkedHashSet();
		db.add("abc");
		db.add(2);
		db.add(2.5);
		db.add(true);
		db.add(true);
		
		System.out.println(db);
		
		for(Object b:db) {
			System.out.println(b);
		}
	}

}
