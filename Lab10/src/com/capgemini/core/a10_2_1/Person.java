package com.capgemini.core.a10_2_1;

public class Person {
	
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private double weight;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Person(String fname, String lname, String gender, int age,
			double weight) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	public void printprofile()
	{
		System.out.println("First Name: "+fname);
		System.out.println("Last Name: "+lname);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Weight: "+weight);
	}
	

}
class CreateProfile{
	
	public static void main(String args[])
	{
		Person p=new Person("Divya","Bharathi","F",20,85.55);
		p.printprofile();
		
	}
}
