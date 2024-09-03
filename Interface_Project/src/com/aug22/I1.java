package com.aug22;

public interface I1 {
	
	public static final int a=10;
	 static final int b=10;
	 final int c=10;
	 int d=10;
	
public abstract void m1();
 abstract void m2();
 void m3();
 
 static void m4() {
	 System.out.println("111");
 }
	
 default void m5() {
	 System.out.println("2222");
 }
	

}
