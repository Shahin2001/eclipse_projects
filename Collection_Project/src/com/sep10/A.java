package com.sep10;

import java.util.ArrayList;
import java.util.List;

public class A {
	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<Integer>();
		
		int a[]=new int[5]; 
		
		//marks.add(88.7);
		//marks.add('a');
		//marks.add("Jay");
		//marks.add("Viru");
		marks.add(88);
		marks.add(777);
		
		System.out.println(marks.size());
		
		for(int i=0;i<marks.size();i++) {
			System.out.println(marks.get(i));
		}
		
		for(int i:marks) {
			System.out.println(i);
		}
	}

}
