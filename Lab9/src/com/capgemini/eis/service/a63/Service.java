package com.capgemini.eis.service.a63;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.eis.bean.a63.Employee;
import com.capgemini.eis.exception.a63.EmployeeException;

public class Service implements EmployeeService {

	Employee[] emp=new Employee[4];
	int i=0;
	@Override
	public void scheme(Employee employee,double salary, String designation) throws EmployeeException {	
	}
	
	public void writeObject(Employee employee)
	{
		
		emp[i]=employee;
		i++;
		try(ObjectOutputStream objectOutput=new ObjectOutputStream(new FileOutputStream("employee")))
		{
			
			objectOutput.writeObject(emp);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readObject() throws Exception {
	
		Employee[] employee;
		FileInputStream fis=new FileInputStream("employee");
		ObjectInputStream objectInputStream=new ObjectInputStream(fis);
		employee=(Employee[]) objectInputStream.readObject();
		System.out.println("Reading from file");
		for(int j=0;j<employee.length;j++)
		{
			System.out.println(""+employee[j]);
		}
		

	}

}
