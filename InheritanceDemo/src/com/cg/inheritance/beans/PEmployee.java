package com.cg.inheritance.beans;

public class PEmployee extends Employee{
	private int hra, ta, da;
	public PEmployee() {
		super();
	}
	
	public PEmployee(int employeeId, String firstName, String lastName,
			int basicSalary, int totalSalary) {
		super(employeeId, firstName, lastName, basicSalary, totalSalary);
	}

	public int getHra() {
		return hra;
	}
	public void setHra(int hra) {
		this.hra = hra;
	}
	public int getTa() {
		return ta;
	}
	public void setTa(int ta) {
		this.ta = ta;
	}
	public int getDa() {
		return da;
	}
	public void setDa(int da) {
		this.da = da;
	}
	public void calculateTotalSalary(){
		hra = (this.getBasicSalary()*10)/100;
		da = (this.getBasicSalary()*10)/100;
		ta = (this.getBasicSalary()*10)/100;
		this.setTotalSalary(this.getBasicSalary() + hra + da + ta); //agar yeh method nahi likhenge toh super class ka method call
	}												// hoga

	@Override
	public String toString() {
		return super.toString()+" hra=" + hra + ", ta=" + ta + ", da=" + da; //accessing method of parent class to get/return rest of the details about employee
	}
	
	
}
