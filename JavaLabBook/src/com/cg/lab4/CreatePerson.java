package com.cg.lab4;

public class CreatePerson {

	public static void main(String[] args) {
		Person smith = new Person("Smith", 25);
		Person kathy = new Person("Kathy", 25);
		
		Account accSmith = new Account(2000);
		accSmith.setAccHolder(smith);
		Account accKathy = new Account(3000);
		accKathy.setAccHolder(kathy);
		
		accSmith.deposit(2000);
		accKathy.withraw(2000);
		
		System.out.println("Updated Deaitls:");
		System.out.println("Balance of "+ accSmith.getAccHolder().getName() + " is "+ accSmith.getBalance());
		System.out.println("Balance of "+ accKathy.getAccHolder().getName() + " is "+ accKathy.getBalance());
		
		System.out.println(accSmith);
		System.out.println(accKathy);
	}

}
