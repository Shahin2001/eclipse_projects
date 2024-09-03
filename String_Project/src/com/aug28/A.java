package com.aug28;

public class A {
	public static void main(String[] args) {
		String s=new String("Hello");
		String s2=new String("Hello");
		String s1;
		s1=s;
		System.out.println(s);//from heap memory
		System.out.println(s.intern());//from hcp
		System.out.println(s==s.intern());//false
		System.out.println("Hello"=="Hello");//true
		
		System.out.println(s==s1);//true
		System.out.println(s==s2);//false
		System.out.println(s.equals(s2));//true
		System.out.println(s.equals(s.intern()));//true
		
		
		StringBuilder s3=new StringBuilder("byeeeee");
		System.out.println(s3);
		System.out.println(s3.hashCode());//check memory
		s3.append("All");
		System.out.println(s3);
		System.out.println(s3.hashCode());
		
		StringBuffer s4=new StringBuffer("bye");
		System.out.println(s4);
		System.out.println(s4.hashCode());//check memory
		s4.append("All");
		System.out.println(s4);
		System.out.println(s4.hashCode());
		
	}

}
