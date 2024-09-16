package com.sep16;

import java.util.ArrayList;
import java.util.List;

public class MainCode {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(5);
		li.add(55);
		li.add(11);
		li.add(100);
		
		System.out.println(li);
		
		//li.forEach(c->{if(c%2==0) {System.out.println(c);}});
		
		
		List<Integer> even=new ArrayList<Integer>();
		List<Integer> odd=new ArrayList<Integer>();
		li.forEach(e->{if(e%2==0) {even.add(e);}else{odd.add(e);};});
		
		System.out.println(even);
		System.out.println(odd);
		
		
		
		
//		for(int c:li) {
//			if(c%2==0) {
//				System.out.println(c);
//			}
//		}
	}

}
