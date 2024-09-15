package com.sep13;

public class PalindromeString {
	public static void main(String[] args) {
		String str="Nayan";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
