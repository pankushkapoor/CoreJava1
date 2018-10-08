package com.cg.lab42;

public class SavingsAccount extends Account {
	private final double minimumBalance = 500;
	
	public SavingsAccount(double balance) {
		super(balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if(getBalance() - amount >= minimumBalance) {
			double bal = getBalance();
			bal-=amount;
			setBalance(bal);
			return true;
		}
		return false;
	}
	
}
