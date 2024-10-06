package com;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example {
	public static void main(String[] args) {
		Map<Integer,String> m=new LinkedHashMap<>();
		m.put(1,"ram");
		m.put(5,"sham");
		m.put(4,"ravan");
		m.put(2,"mayan");
		m.put(3,"amesh");
//		System.out.println(m);
//		for(Integer k:m.keySet()) {
//			System.out.println(k+m.get(k));
//		}
//		for(Map.Entry<Integer, String> k:m.entrySet()) {
//			System.out.println(k.getKey()+k.getValue());
//		}
//		
//		Iterator<Entry<Integer, String>> k=m.entrySet().iterator();
//		while(k.hasNext()) {
//			Entry<Integer,String> e=k.next();
//			System.out.println(e.getKey()+e.getValue());
//		}
		
		

		m.entrySet().iterator().forEachRemaining(e->System.out.println(e.getKey()+e.getValue()));
		
	}

}
