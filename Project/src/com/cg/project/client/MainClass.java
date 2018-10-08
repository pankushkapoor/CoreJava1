package com.cg.project.client;

import com.cg.project.beans.Address;
import com.cg.project.beans.Customer;
	
	public class MainClass {
		public static void main(String[] args) {
			Address address = new Address("Patiala","Punjab","India",147002); //this address is different from address in Address class
			Customer customer1 = new Customer(101, "Pankush", "Kapoor", address); //giving the whole object as an input 
			//System.out.println(address.getCity());
			
			/*Address address2 = customer1.getAddress(); //way of getting city
			System.out.println(address2.getCity());*/
			
			//System.out.println(customer1.getAddress().getCity()); // another way of getting city
			
			/*customer1.getAddress().setCountry("US");
			customer1.getAddress().setCity("New York");  //way of setting values
			System.out.println(customer1.getAddress().getCity());
			System.out.println(customer1.getAddress().getCountry());*/
			
			customer1.setAddress(new Address("Pune", "Maharashtra", "India", 411057)); //another way of setting values
			System.out.println(customer1.getAddress().getCity());
			System.out.println(customer1.getAddress().getCountry());
		}

}
