package com.capgemini.core.a61;

public class Person {
	private String fname;
	private String lname;
	private char gender;
	
	
	public Person(String fname, String lname, char gender)throws NameException {
		super();
		if(fname.equals("")&&lname.equals(""))
		{
			throw new NameException();
		}
		else
		{
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		}
	}



	

	public String getFname() {
		
		return fname;
	}
	public void setFname(String fname)  {
		
		this.fname = fname;
	}
	public String getLname() {
		
		return lname;
	}
	public void setLname(String lname) {
		
		this.lname = lname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
