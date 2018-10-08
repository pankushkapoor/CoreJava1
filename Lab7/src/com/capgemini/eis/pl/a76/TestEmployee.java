package com.capgemini.eis.pl.a76;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.eis.bean.a76.Employee;
import com.capgemini.eis.service.a76.EmployeeService;
import com.capgemini.eis.service.a76.EmployeeServiceImpl;

public class TestEmployee
{
	EmployeeService empService;
	public TestEmployee() {
		
		empService=new EmployeeServiceImpl();
		// TODO Auto-generated constructor stub
	}
	public void menu()
	{
		System.out.println("1. Add Employee");
		System.out.println("2. Enter Insurance Scheme to view insurance vise");
		System.out.println("3. Remove Employee");
		System.out.println("4. Sort Employees");
		System.out.println("5. View all employees details");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please choose an option");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter ename");
			String name=sc.next();
			System.out.println("Enter Salary");
			long salary=sc.nextLong();
			System.out.println("Enter designation");
			String designation=sc.next();
			System.out.println("Enter Insurance Scheme");
			String insurance=sc.next();
			
			Employee employee=new Employee();
			employee.setName(name);
			employee.setSalary(salary);
			employee.setDesignation(designation);
			employee.setInsuranceScheme(insurance.toUpperCase());
			empService.addEmployee(employee);
			
			break;
			
		case 2:
			String insuranceScheme=sc.next();
			List<Employee> schemeEmployee=empService.scheme(insuranceScheme);
			Iterator it=schemeEmployee.iterator();
			while(it.hasNext())
			{
				Employee emp=(Employee)it.next();
				System.out.println(emp);
			}
			break;
			
		case 3:
			System.out.println("Enter id to remove an employee");
			int id = sc.nextInt();
			empService.deleteEmloyee(id);
			break;
			
		case 4:
			empService.sort();
			break;
			
		case 5:
			
			HashMap<Integer, Employee> employees;	
				employees = empService.getEmployees();
				Set s=employees.entrySet();
				it=s.iterator();
				while(it.hasNext())
				{
					System.out.println(""+it.next());
				}
				System.out.println();
			
			break;
			
		case 0:
			System.exit(0);
			break;
			
		default:
			break;
				
		}
		
	}
	public static void main(String args[]){
		
		TestEmployee t=new TestEmployee();
		
		while(true)
		{
			t.menu();
		}
	
		
		
		
	}
}
