package com.sep18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewUsingStreamAPIUsingMapMethod {
	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(55,66,99,80);
		
		List<Integer> newmarks=marks.stream().map(m->{if (m>95) {return m;}else { return  m+5;}}).collect(Collectors.toList());
		System.out.println(newmarks);
	}

}
