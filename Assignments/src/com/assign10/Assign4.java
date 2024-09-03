package com.assign10;
import java.util.Arrays;

public class Assign4 {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int merge[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			merge[i]=a[i];
		}
		for(int i=0;i<a.length;i++) {
			merge[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(merge));
		
	}

}
