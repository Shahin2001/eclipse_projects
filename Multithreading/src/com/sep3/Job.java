package com.sep3;

public class Job implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("Shaina");
			
		}
	}

}
