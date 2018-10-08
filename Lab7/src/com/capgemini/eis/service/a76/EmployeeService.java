package com.capgemini.eis.service.a76;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.capgemini.eis.bean.a76.Employee;

public interface EmployeeService {
	
	public  List<Employee> scheme(String scheme);
	public void addEmployee(Employee employee);
	public void deleteEmloyee(int id);
	public HashMap<Integer, Employee> getEmployees() ;
	public void sort();

}
