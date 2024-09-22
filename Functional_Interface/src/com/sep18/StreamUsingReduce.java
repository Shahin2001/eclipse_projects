package com.sep18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsingReduce {
	public static void main(String[] args) {
		
			List<Integer> marks=Arrays.asList(50,20,10,80);
			List<Integer> marks2=Arrays.asList(50,20,10,80);
			
			Integer sum1=marks.stream().reduce(0,(a,b)->a+b);
			Integer sum2=marks.stream().reduce(sum1,(a,b)->a+b);
			
			System.out.println(sum2);
		
	}

}
