package com.capgemin.core.a11;
import java.util.Date;

public class Employee {

	
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private Date hireDate;
	private String designation;
	private double salary;
	private int managerId;
	private Department department;
	/**
	 * @param empId
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNum
	 * @param hireDate
	 * @param designation
	 * @param salary
	 * @param managerId
	 * @param department
	 */
	
	public Employee(int empId, String firstName, String lastName, String email, String phoneNum, Date hireDate,
			String designation, double salary, int managerId, Department department) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.hireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	/**
	 * @param empId
	 * @param salary
	 */
	public Employee(int empId, double salary) {
		super();
		this.empId = empId;
		this.salary = salary;
	}
	
}
