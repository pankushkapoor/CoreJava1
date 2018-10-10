package com.capgemini.eis.pl.a63;
import com.capgemini.eis.bean.a63.Employee;
import com.capgemini.eis.service.a63.Service;

public class TestEmployeeService
{

	public static void main(String args[]){
		
		
		Employee employee1=new Employee(101,"anish",1000,"manager","schemeA");
		Employee employee2=new Employee(102,"aakash",1100,"manager","schemeB");
		Employee employee3=new Employee(104,"alisha",1800,"manager","schemeD");
		Employee employee4=new Employee(103,"abhi",1500,"manager","schemeC");

		Service service =new Service();
//		service.writeObject(employee1);
//		service.writeObject(employee2);
//		service.writeObject(employee3);
//		service.writeObject(employee4);
		try {
			service.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
		

		
		
	}
}
