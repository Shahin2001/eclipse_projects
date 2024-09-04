package com.job2;

import com.savacc.SavingAccount;

public class B implements Runnable{
	
	SavingAccount ss;
	

	public B(SavingAccount ss) {
		super();
		this.ss = ss;
	}

@Override
	public void run() {
		for(int i=1;i<=1000;i++) {
			ss.deposit(10);
		}
		
		// TODO Auto-generated method stub
		
	}
	

}
