package com.capgemini.core.a10_2_2;

@SuppressWarnings("serial")
public class EmployeeException extends Exception
{

	@Override
	public String toString() {
		return "salary cannot be less than 3000";
	}
	

}
