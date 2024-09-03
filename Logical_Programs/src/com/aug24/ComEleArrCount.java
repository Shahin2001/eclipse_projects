package com.aug24;

public class ComEleArrCount {
	public static void main(String[] args) {
		int a[]= {6,1,3,3,4,3,3};
		int count=0,res;
		for(int i=0;i<a.length;i++) {
			//count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					//a[count]=a[i];
					count++;
					break;
				}
				
				
			}
			
			
		}
		System.out.println(count);
		
	}

}
