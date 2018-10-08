package com.cg.inheritance.beans;

public class CEmployee extends Employee{
	private int totalHrs, variablePay;
	
	public CEmployee(int employeeId, String firstName, String lastName,
			int basicSalary, int totalSalary) {
		super(employeeId, firstName, lastName, basicSalary, totalSalary);
	}

	public CEmployee(int totalHrs, int variablePay) {
		super();
		this.totalHrs = totalHrs;
		this.variablePay = variablePay;
	}
	
	public int getTotalHrs() {
		return totalHrs;
	}
	public void setTotalHrs(int totalHrs) {
		this.totalHrs = totalHrs;
	}
	public int getVariablePay() {
		return variablePay;
	}
	public void setVariablePay(int variablePay) {
		this.variablePay = variablePay;
	}

	@Override
	public void calculateTotalSalary() {
		this.setTotalSalary(this.getBasicSalary()); 
	}
	
	
}
