package com.cg.inheritance.client;

import com.cg.inheritance.beans.CEmployee;
import com.cg.inheritance.beans.Employee;
import com.cg.inheritance.beans.PEmployee;

public class MainClass {

	public static void main(String[] args) {
		/*//Dynamic binding
		Employee emp;
		emp = new PEmployee(102, "Nilesh", "Kumar", 15000, 60000);
		emp.calculateTotalSalary();
		System.out.println("Total Salary: " +emp.getTotalSalary());
		
		Employee emp = new Employee(101, "Pank", "Kapoor", 14500, 60000);
		emp.calculateTotalSalary();
		
		PEmployee pemp = new PEmployee(102, "Nilesh", "Kumar", 15000, 60000);
		System.out.println("Employee Id: " +pemp.getEmployeeId());
		pemp.calculateTotalSalary();
		System.out.println("Total Salary: " +pemp.getTotalSalary());
		
		CEmployee cemp = new CEmployee(103, "Akash", "Rao", 500, 1000);
		cemp.calculateTotalSalary();
		System.out.println("Total Salary cemp: " +cemp.getTotalSalary());
		
		System.out.println(emp.toString()); //calling employee's toString method
		
		//System.out.println(pemp.toString()); //calling pemployee's toString method
*/		
		Employee emp;
		emp = new PEmployee(102, "Nilesh", "Kumar", 15000, 60000);
		emp.calculateTotalSalary();
		
		System.out.println(emp);
		emp = new CEmployee(103,"Akash","Rao",500, 1000);
		
		CEmployee cemp = (CEmployee)emp;
		cemp.calculateTotalSalary();
		System.out.println(emp);

	}

}
