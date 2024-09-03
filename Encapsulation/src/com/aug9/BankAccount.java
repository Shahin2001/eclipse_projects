package com.aug9;

public class BankAccount {
	private String owner;
	private int deposit;
	private int withdraw;
	private int balance;
	public BankAccount(String bowner, int bdeposit, int bwithdraw, int bbalance) {
		
		owner = bowner;
		deposit = bdeposit;
		withdraw = bwithdraw;
		balance = bbalance;
		
		System.out.println("Owner:"+ owner+" Deposit:"+ deposit+ " Withdraw:"+ withdraw+" Balance:"+balance);
	}
	
	public BankAccount() {
		
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String bowner) {
		owner = bowner;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int bdeposit) {
		deposit = bdeposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int bwithdraw) {
		withdraw = bwithdraw;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int bbalance) {
		balance = bbalance;
	}

	@Override
	public String toString() {
		return "BankAccount [owner=" + owner + ", deposit=" + deposit + ", withdraw=" + withdraw + ", balance="
				+ balance + "]";
	}
	
	
	
	

}
