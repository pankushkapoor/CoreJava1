package com.capgemini.core.a11_4;
interface Message
{
	 public void setMessage(String name);
	
}
class Person implements Message{
	String name;

	public Person(String name) {
		this.name=name;
		System.out.println(""+this.name);
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	
	@Override
	public void setMessage(String name) {
		// TODO Auto-generated method stub
	}
}




public class MainClassInstanceCheck {
	
	public static void main(String[] args) {
		
		Message p=Person::new;
		p.setMessage("admin");
	}

}
