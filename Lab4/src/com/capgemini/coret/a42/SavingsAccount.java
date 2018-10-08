package com.capgemini.coret.a42;

public class SavingsAccount extends Account{
	
	private final double minimum_balance=500;

	public SavingsAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	public boolean withdraw(double amount)
	{
		if(getBalance()-amount>=minimum_balance)
		{
			double bal=getBalance();
			bal-=amount;
			setBalance(bal);
			return true;
		}
		return false;
		
	}
	
	

}
