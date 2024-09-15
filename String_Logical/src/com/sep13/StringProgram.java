package com.sep13;

public class StringProgram {
	public static void main(String[] args) {
		String str="java by kiran";
		
		String[] a=str.split(" ");
		String rev="";
		
		
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i]+" ";
			
		
		}
		
		System.out.println(rev);
	}

}
