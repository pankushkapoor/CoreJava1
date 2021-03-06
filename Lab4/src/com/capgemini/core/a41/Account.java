package com.capgemini.core.a41;

public class Account {
	
	private long account_number;
	private double balance;
	private Person account_holder;
	
	
	
	public Account(double balance) {
		super();
		this.account_number = (long)(Math.random()*10000);
		this.balance = balance;
	}
	public long getAccount_number() {
		return account_number;
	}
	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(Person account_holder) {
		this.account_holder = account_holder;
	}

	public void deposit(double amount)
	{
		
		this.balance+=amount;
		
	}
	public void withdraw(double amount)
	{
	
		if(balance-amount<500)
		{
			System.out.println("Cannot withdraw minimum balance should be 500");
		}
		else
		{
			this.balance-=amount;
		}
	}
	@Override
	public String toString() {
		return "Account [account_number=" + account_number + ", balance="
				+ balance + ", account_holder=" + account_holder + "]";
	}
	
}
