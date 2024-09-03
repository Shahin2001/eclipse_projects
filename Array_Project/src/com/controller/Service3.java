package com.controller;

public class Service3 {
	public int[] m2(int a[]) {
		int l=a.length;
		int b[]=new int[l];
		 
		for(int i=0;i<a.length;i++) {
			  b[i]=a[i]*a[i];
			  
		}
		return b;
		
		
		
		
	}

}
