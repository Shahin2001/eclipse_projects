package com.sep12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Movies {
	public static void main(String[] args) {
		Map<String,List<String>> moviedb=new HashMap<String,List<String>>();
		
		List<String> castingstree2=new ArrayList<String>();
		castingstree2.add("Rajkumar");
		castingstree2.add("Shraddha");
		castingstree2.add("Pankaj");
		
		List<String> castinggolmaal=new ArrayList<String>();
		castinggolmaal.add("Kareena Kapoor");
		castinggolmaal.add("Ajay Devgan");
		castinggolmaal.add("Shreyas Talpade");
		
		
		moviedb.put("Stree2", castingstree2);
		moviedb.put("Golmaal", castinggolmaal);
		
		System.out.println(moviedb);
		
		List<String>arr=moviedb.get("Golmaal");
		System.out.println(arr);
		
		//Set<String> names=moviedb.keySet();
		
//		for(String s:names) {
//			System.out.println(s);
//		}
		

//		System.out.println(names);
//		
//		for(String s:names) {
//			System.out.println(s+"------>"+moviedb.get(s));
//		}
		
		
//		Set<String> names=moviedb.keySet();
//		for(String s:names) {
//			System.out.println(s);
//			
//			for(String an:moviedb.get(s)) {
//				System.out.println(an);
//			}
//		}
		
		
		Set<String> names=moviedb.keySet();
		for(String s:names) {
			System.out.println(s);
			
			for(String an:moviedb.get(s)) {
				for(int i=0;i<an.length();i++) {
					System.out.println(an.charAt(i));
				}
				System.out.println("==================");
			}
		}
	}

}
