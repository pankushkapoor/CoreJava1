package com.capgemini.core.a41;

public class CreatePerson {

	public static void main(String[] args) {
		
		Person smith=new Person("Smith",25);
		Person kathy=new Person("Kathy",26);
		
		
		Account acc_smith=new Account(2000);
		acc_smith.setAccount_holder(smith);
		
		Account acc_kathy=new Account(3000);
		acc_kathy.setAccount_holder(kathy);
		
		acc_smith.deposit(2000);
		acc_kathy.withdraw(2000);
		
		System.out.println(acc_smith.getAccount_holder().getName()+" acc balance is "+acc_smith.getBalance());
		System.out.println(acc_kathy.getAccount_holder().getName()+" acc balance is "+acc_kathy.getBalance());
	}

}
