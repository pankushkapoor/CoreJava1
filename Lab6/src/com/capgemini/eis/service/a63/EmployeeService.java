package com.capgemini.eis.service.a63;

import com.capgemini.eis.bean.a63.Employee;
import com.capgemini.eis.exception.a63.EmployeeException;

public interface EmployeeService {
	
	public void scheme(Employee employee,double salary,String designation) throws EmployeeException;

}
