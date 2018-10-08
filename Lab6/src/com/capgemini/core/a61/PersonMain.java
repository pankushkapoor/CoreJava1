package com.capgemini.core.a61;

import java.util.Scanner;


public class PersonMain {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String fname=sc.nextLine();
		System.out.println("Enter Last Name");
		String lname=sc.nextLine();
		
		//Person p=null;
		try {
			Person p=new Person(fname,lname,'M');
			System.out.println("First Name= "+p.getFname());
			System.out.println("Last Name= "+p.getLname());
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();
		

	}

}
