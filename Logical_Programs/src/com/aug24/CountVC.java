package com.aug24;
import java.util.*;

public class CountVC {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		
		//String str="Shaina";
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)==('a'))||(str.charAt(i)==('e'))|(str.charAt(i)==('i'))||(str.charAt(i)==('o'))|(str.charAt(i)==('u')) ){
				vowels++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Vowels Count:"+vowels);
		System.out.println("Consonants Count:"+consonants);
	}

}
