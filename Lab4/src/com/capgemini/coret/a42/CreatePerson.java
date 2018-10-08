package com.capgemini.coret.a42;

public class CreatePerson {

	public static void main(String[] args) {
		
		Person smith=new Person("Smith",25);
		Person kathy=new Person("Kathy",26);
		
		
		Account acc_smith=new SavingsAccount(2000);
		acc_smith.setAccount_holder(smith);
		Account acc_kathy=new CurrentAccount(3000);
		acc_kathy.setAccount_holder(kathy);
		
		SavingsAccount sa=(SavingsAccount)acc_smith;
		CurrentAccount ca=(CurrentAccount)acc_kathy;
		
		if(sa.withdraw(2000))
		{
			System.out.println("Smith account balance is "+acc_smith.getBalance());
		}
		else
		{
			System.out.println("Smith there should be minimum balance left in your savings account");
		}
		if(ca.withdraw(10000))
		{
			System.out.println("Kathy account balance is "+acc_smith.getBalance());
			
		}
		else
		{
			System.out.println("Kathy overdraft limit is reached for your current account");
		}
		
		/*System.out.println(acc_smith.getAccount_holder().getName()+" acc balance is "+acc_smith.getBalance());
		System.out.println(acc_kathy.getAccount_holder().getName()+" acc balance is "+acc_kathy.getBalance());*/
	}

}
