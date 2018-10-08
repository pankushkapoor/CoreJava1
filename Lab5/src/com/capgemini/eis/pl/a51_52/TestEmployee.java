package com.capgemini.eis.pl.a51_52;

import java.util.Scanner;

import com.capgemini.eis.bean.a51_52.Employee;
import com.capgemini.eis.service.a51_52.EmployeeService;
import com.capgemini.eis.service.a51_52.EmployeeServiceImpl;

public class TestEmployee
{

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter name of Employee");
		String name=sc.next();
		System.out.println("Enter id of Employee");
		Long id=sc.nextLong();
		System.out.println("Enter salary of Employee");
		Long salary=sc.nextLong();
		System.out.println("Enter designation of Employee");
		String designation=sc.next();
		designation+=sc.nextLine();
		
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setDesignation(designation);
		employee.setSalary(salary);
		
		EmployeeService service =new EmployeeServiceImpl();
		service.scheme(employee, salary, designation);
		
		System.out.println("Name of Employee: "+employee.getName());
		System.out.println("Id of Employee: "+employee.getId());
		System.out.println("Designation of Employee: "+employee.getDesignation());
		System.out.println("Salary of Employee: "+employee.getSalary());
		System.out.println("Insurance Scheme of Employee: "+employee.getInsuranceScheme());
		
		sc.close();
		
		
	}
}
