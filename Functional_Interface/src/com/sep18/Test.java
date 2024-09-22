package com.sep18;

import java.util.function.Predicate;

public class Test {
	public static void main(String[] args) {
		Predicate<Integer> iseven= num->num%2==0;
			System.out.println(iseven.test(11));
			
			Predicate<Integer> isgreater= num->num>10;
			System.out.println(isgreater.test(15));	
			
			Predicate<Integer> isevenisgreater= iseven.and(isgreater);
			System.out.println(isevenisgreater.test(12));
		
	}

}
