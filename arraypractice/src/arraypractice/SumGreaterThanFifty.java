package arraypractice;

import java.util.Scanner;

public class SumGreaterThanFifty {
	
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter n value:");
    	 int n=sc.nextInt();
    	 int a[]=new int[n];
    	 System.out.println("Enter array elements:");
    	 for(int i=0;i<a.length;i++) {
    		a[i]=sc.nextInt() ;
    	 }
    	 for(int i=0;i<a.length;i++) {
     		System.out.println(a[i]);
     	 }
    	 
	
     }
}
