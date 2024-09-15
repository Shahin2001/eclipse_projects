package com.sep13;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str="Programming";
		String result="";
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			boolean duplicate=false;
			
			for(int j=0;j<result.length();j++) {
				if(c==result.charAt(j)) {
					duplicate=true;
					break;
				}
			}
			if(!duplicate) {
				result=result+c;
			}
			
		}
		System.out.println(result);
	}

}
