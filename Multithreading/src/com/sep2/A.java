package com.sep2;

public class A extends Thread{
	
	static int balance=1000;
	
	public void run() {
		for(int i=0;i<5;i++) {
			payNow(200);
		}
	}

	private static synchronized void payNow(int amt) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		if(amt<=balance) {
			balance=balance-amt;
			System.out.println(balance);
		}
		else {
			System.out.println("insufficient");
		}
		
	}
	

}
