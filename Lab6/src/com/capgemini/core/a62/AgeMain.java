package com.capgemini.core.a62;

import java.util.Scanner;

public class AgeMain {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		Employee e=new Employee(name,age);
		
		try {
			//e.getAge();
			System.out.println("Age="+e.getAge());
		} catch (AgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sc.close();
		
	}

}
