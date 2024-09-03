package com.aug23;

public class AA implements A {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("111  ");
		
	}
	public static void main(String[] args) {
		AA a=new AA();
		a.add();
		System.out.println(A.a);
		//System.out.println(5/0);
	}

}
