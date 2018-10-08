package com.capgemini.core.a62;

@SuppressWarnings("serial")
public class AgeException extends Exception {

	private int age;
	
	AgeException(int age)
	{
		this.age=age;
	}

	@Override
	public String toString() {
		return ""+age+" is invalid age";
	}
	
}
