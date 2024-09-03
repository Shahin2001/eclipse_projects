package com.assign9;

public class AAA {
	private int roll;
	
	AAA(){
		roll=100;
	}
	AAA(int r){
		this();
		roll=roll+r;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public static void main(String[] args) {
		AAA a=new AAA(12);
		System.out.println(a.getRoll());
		AAA a1=new AAA(15);
		System.out.println(a1.getRoll());
//		a.setRoll(15);
//		System.out.println(a.getRoll());
	}

}
