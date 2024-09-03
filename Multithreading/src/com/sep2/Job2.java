package com.sep2;

public class Job2  extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("Shainaaaa");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
