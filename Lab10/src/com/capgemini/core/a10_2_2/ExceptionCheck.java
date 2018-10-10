package com.capgemini.core.a10_2_2;

public class ExceptionCheck {

	
	public void checksalary(int salary) throws EmployeeException 
	{
		if(salary<3000)
			throw new EmployeeException();
		
	
		
	}
}
