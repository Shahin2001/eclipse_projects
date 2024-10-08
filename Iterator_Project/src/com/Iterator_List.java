package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_List {
	public static void main(String[] args) {
		List<Integer> s=new ArrayList();
		s.add(5);
		s.add(8);
		s.add(1);
		s.add(3);
		s.add(6);
		System.out.println(s);
		
		for(int i:s) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
//		Iterator<Integer> itr=s.iterator();
//		while(itr.hasNext()) {
//			Integer i=itr.next();
//			
//			if(i==6) {
//				itr.remove();
//			}
//		}
//		System.out.println(s);
		
		
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			
			
			if(itr.next()==6) {
				itr.remove();
			}
		}
		System.out.println(s);
	}

}
