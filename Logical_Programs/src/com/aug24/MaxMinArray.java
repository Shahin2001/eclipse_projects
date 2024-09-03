package com.aug24;

public class MaxMinArray {
	public static void main(String[] args) {
		int a[]= {4,7,9,2,5,1};
		int max=0;
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Max no:"+max);
		System.out.println("Min no:"+min);
		
	}

}
