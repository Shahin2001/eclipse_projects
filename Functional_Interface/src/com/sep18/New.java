package com.sep18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class New {
	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(55,66,99,80);
		
		List<Integer> newmarks=new ArrayList();
		
		int res = 0;
		for(int m: marks) {
			
			 res=m+5;
			 newmarks.add(res);
		}
		System.out.println("Updated List");
		
		System.out.println(newmarks);
	}

}
