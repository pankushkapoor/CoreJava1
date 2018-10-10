package com.capgemin.core.a11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {

	EmployeeRepository employeeRepository = new EmployeeRepository();
	List<Employee> employees;

	public EmployeeService() {
		employees = employeeRepository.getEmployees();
		// TODO Auto-generated constructor stub
	}

	public void sumOfSalary() {
		System.out.println("Sum of salary of Employees");
		double sum = employees.stream().mapToDouble((e) -> e.getSalary()).reduce(0, (x, y) -> x + y);
		System.out.println("" + sum);
	}

	public void listDepartmentAndCountEmp() {
		System.out.println();
		System.out.println("department names and count of employees in each department");
		Map<Object, List<Employee>> departments = employees.stream()
				.collect(Collectors.groupingBy((e) -> e.getDepartment().getDepartmentName()));

		for (Object department : departments.keySet()) {
			if(!department.equals(""))
			System.out.println(department + ":" + departments.get(department).size() + " employees");
		}
	}

	public void employeesWithoutDepartment()
	{
 
		System.out.println();
		System.out.println("Employees without department");
		employees.stream().filter((e)->e.getDepartment().getDepartmentName().equals("")).forEach((e)->System.out.println(e.getFirstName()));
	}
}
