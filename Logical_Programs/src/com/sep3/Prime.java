package com.sep3;

public class Prime {
	public static void main(String[] args) {
		
		for(int i=100;i<=200;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println(i);
			}
			
			
		}
		
		
	}

}
