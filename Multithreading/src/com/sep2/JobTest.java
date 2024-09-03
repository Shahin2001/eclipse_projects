package com.sep2;

public class JobTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Method run");
		System.out.println(Thread.currentThread().getName());
		
		
		
		Job j=new Job();
		j.setName("Amazon");
		j.start();
		Job2 j1=new Job2();
		j1.setName("Flippy");
		j1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Ssss");
			Thread.sleep(500);
		}
		
		
		System.out.println("Main complete");
	}

}
