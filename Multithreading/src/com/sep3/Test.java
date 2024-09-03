package com.sep3;



public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Method run");
		System.out.println(Thread.currentThread().getName());
		
		
		
		Job j=new Job();
		Thread t=new Thread(j);
		t.setName("Amazon");
		t.start();
		Job j1=new Job();
		Thread t1=new Thread(j1);
		t1.setName("Flippy");
		t1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Ssss");
			Thread.sleep(500);
		}
		
		
		System.out.println("Main complete");
	}

}
