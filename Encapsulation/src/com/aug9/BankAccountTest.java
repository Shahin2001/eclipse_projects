package com.aug9;

public class BankAccountTest {
public static void main(String[] args) {
	BankAccount b=new BankAccount("Shaina", 500, 200, 300);
	
	System.out.println("Initial value:"+b.getOwner());
	b.setOwner("abc");
	System.out.println("Updated value:"+b.getOwner());
	
	System.out.println("Initial value:"+b.getDeposit());
	b.setDeposit(1000);
	System.out.println("Updated value:"+b.getDeposit());
	
	System.out.println("Initial value:"+b.getWithdraw());
	b.setWithdraw(500);
	System.out.println("Updated value:"+b.getWithdraw());
	
	System.out.println("Initial value:"+b.getBalance());
	b.setBalance(700);
	System.out.println("Updated value:"+b.getBalance());
	
	System.out.println(b);
}
}
