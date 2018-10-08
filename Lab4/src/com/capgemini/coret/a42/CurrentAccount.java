package com.capgemini.coret.a42;

public class CurrentAccount extends Account
{

	private double overdraft_limit;
	
	public CurrentAccount(double balance) {
		super(balance);
		this.overdraft_limit=5000;
		// TODO Auto-generated constructor stub
	}

	
	public double getOverdraft_limit() {
		return overdraft_limit;
	}
	
	public void setOverdraft_limit(double overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}
	
	public boolean withdraw (double amount)
	{
		double bal=getBalance();
		if(bal-amount<0)
		{
			if(Math.abs(bal-amount)<=overdraft_limit)
			{
				overdraft_limit-=Math.abs(bal-amount);
				setBalance(0);
				return true;
			}
			else
			{
				return false;
				
			}
		}
		else
		{
			bal-=amount;
			setBalance(bal);
			
		}
		
		return true;
	}
}
