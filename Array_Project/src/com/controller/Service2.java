package com.controller;

public class Service2 {
	public int m1(int a[]) {
		int max=0;
		//int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		return max;
		
	}

}
