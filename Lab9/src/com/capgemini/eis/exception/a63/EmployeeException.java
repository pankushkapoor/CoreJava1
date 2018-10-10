package com.capgemini.eis.exception.a63;

@SuppressWarnings("serial")
public class EmployeeException extends Exception
{

	@Override
	public String toString() {
		return "salary cannot be less than 3000";
	}
	

}
