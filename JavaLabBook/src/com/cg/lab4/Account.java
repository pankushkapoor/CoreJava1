package com.cg.lab4;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	public Account() {
		super();
	}
	public Account(double balance) {
		super();
		this.accNum = (long)(Math.random()*1000);
		this.balance = balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public void withraw(double amount) {
		if(balance-amount < 500) System.out.println("Cannot withraw money");
		else this.balance-=amount;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	
}
