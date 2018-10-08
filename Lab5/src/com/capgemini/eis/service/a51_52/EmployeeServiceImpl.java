package com.capgemini.eis.service.a51_52;

import com.capgemini.eis.bean.a51_52.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void scheme(Employee employee,double salary, String designation) {
		if(salary>5000 && salary<20000 && designation.toLowerCase().equals("system associate"))
		{
			employee.setInsuranceScheme("Scheme C");
			
		}
		else if(salary>=20000 && salary<40000 && designation.toLowerCase().equals("programmer"))
		{
			employee.setInsuranceScheme("Scheme B");
			
		}
		else if(salary>=40000 && designation.toLowerCase().equals("manager"))
		{
			employee.setInsuranceScheme("Scheme A");
			
		}
		else if(salary<5000 && designation.toLowerCase().equals("clerk"))
		{
			employee.setInsuranceScheme("No Scheme");
		}
		else
		{
			employee.setInsuranceScheme("Not in our category");
		}
		
		
	}

}
