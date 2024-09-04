package com.test;

import com.job1.JobA;
import com.job2.B;
import com.savacc.SavingAccount;

public class Test {
	public static void main(String[] args) {
		SavingAccount s=new SavingAccount(2,"Shaina",500);
		
		
		JobA a=new JobA(s);
		
		a.start();
		
		B b=new B(s);
		Thread t=new Thread(b);
		t.start();
		
		try {
            a.join();
            t.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println(e);
        }
		
		
		System.out.println(s.accbal);
		
	}

}
