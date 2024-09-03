package com.test;

import com.dao.Dao;

public class Test {
	public static void main(String[] args) {
		Dao d=new Dao();
		String [] s=d.m1();
		
		
//		int length=s.length;
//		
//		for(int i=0;i<length;i++) {
//	       String s1=s[i];
//			
//	       for( int j=0;j<s1.length();j++) {
//	    	   System.out.println(s1.charAt(j));
//	    	   
//	       }
//	       System.out.println();
//		}
		
		
		
		
		for(String n:s) {
//			if(n.startsWith("S")) {
//				System.out.println(n);
//			}
			
			if(n.endsWith("a")) {
				System.out.println(n);
			}
			
			
			
		}
		
	}

}
