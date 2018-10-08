package com.capgemini.core.a53;

public class TestAccount extends Account{

	public TestAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(getBalance()-amount<500)
		{
			System.out.println("Cannot withdraw minimum balance should be 500");
		}
		else
		{
			double bal=getBalance();
			bal=bal-amount;
			setBalance(bal);
		}
	}

}
