package com.cg.lab42;

import com.cg.lab4.Person;

public class CreatePerson {

	public static void main(String[] args) {
		Person smith = new Person("Smith", 25);
		Person kathy = new Person("Kathy", 25);

		SavingsAccount accSmith = new SavingsAccount(2000);
		accSmith.setAccHolder(smith);
		CurrentAccount accKathy = new CurrentAccount(3000);
		accKathy.setAccHolder(kathy);

		if(accSmith.withdraw(1550)){
			System.out.println("Smith account balance is "+accSmith.getBalance());
		}
		else{
			System.out.println("Smith there should be minimum balance left in your savings account");
		}
		if(accKathy.withdraw(1000)){
			System.out.println("Kathy account balance is "+accKathy.getBalance());
		}
		else{
			System.out.println("Kathy overdraft limit is reached for your current account");
		}
	}
}
