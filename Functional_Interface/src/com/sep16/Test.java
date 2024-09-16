package com.sep16;

public class Test {
	public static void main(String[] args) {
		
//		First way
		MyFunction obj=new MyFunction() {
			
			public int compute(int a,int b) {
				return a+b;
			}
			};
			//int sum=obj.compute(10,20);
			System.out.println(obj.compute(10,20));
			
			
			
//	Second way		
			MyFunction o=(int a,int b)->a*b;
			System.out.println(o.compute(10, 10));
			
			
			MyFunction ob=(int a,int b)->{if(a>b) {return a-b;}else{return b-a;}};
			System.out.println(ob.compute(50, 10));
	}
	
}
