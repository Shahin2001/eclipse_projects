package arraypractice;

import java.util.Arrays;

public class Prac {
	public static void main(String[] args) {
		int a[]= {5,8,1,3,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);
	}

}
