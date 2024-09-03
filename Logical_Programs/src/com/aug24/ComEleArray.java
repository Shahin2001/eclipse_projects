package com.aug24;

public class ComEleArray {
	public static void main(String[] args) {
		int a[]= {2,5,6,4,8};
		int b[]= {1,8,3,5,7};
		int temp[]= new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					temp[count]=a[i];
					count++;
				}
			}
		}
		
		for(int i=0;i<count;i++) {
			System.out.println("Comman Element:"+temp[i]);
		}
		
			
		}

}
