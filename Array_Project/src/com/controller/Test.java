package com.controller;

public class Test {
	public static void main(String[] args) {
		int b[]= {10,20,30};
		
//		Service s=new Service();
//		int res=s.s1(a);
//		System.out.println(res);
//		
//		
//		Service2 s2=new Service2();
//		int result=s2.m1(a);
//		System.out.println(result);
		
		
		Service3 s3=new Service3();
		int[] result1=s3.m2(b);
		for(int i=0;i<b.length;i++) {
			System.out.println(result1[i]);
			
			
		}
		
	}

}
