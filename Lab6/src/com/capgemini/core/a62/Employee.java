package com.capgemini.core.a62;

public class Employee {
	
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() throws AgeException {
		if(age<=15)
		{
		throw new AgeException(age);	
		}
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
