package com.cg.lab42;

public class CurrentAccount extends Account{
	private double overdraftLimit;

	public CurrentAccount(double balance) {
		super(balance);
		this.overdraftLimit = 5000;
		
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean withdraw(double amount) {
		if(getBalance()-amount < 0) {
			if(Math.abs(getBalance() - amount) <= overdraftLimit) {
				overdraftLimit-=Math.abs(getBalance()-amount);
				setBalance(0);
				return true;
			}
			else return false;
		}
		else {
			double bal = getBalance();
			bal-=amount;
			setBalance(bal);
		}
		return true;
	}
}