package com.savacc;

public class SavingAccount {
	int accno;
	String accname;
	public double accbal;
	public SavingAccount(int accno, String accname, double accbal) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.accbal = accbal;
	}
	public synchronized void deposit(int amt) {
		accbal=accbal+amt;
		//System.out.println(accbal);
	}
	
	public synchronized void withdraw(int amt) {
		accbal=accbal-amt;
		//System.out.println(accbal);
	}
	
//thread inbuilt function 
	

}
