package com.capgemin.core.a11;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	private List<Employee> employees=new ArrayList<Employee>();
	{
		employees.add(new Employee(101,"anish","garg","anish.garg","",null,"",5000,201,new Department(301,201,"cs")));
		employees.add(new Employee(102,"manish","kumar","","",null,"",2000,201,new Department(301,201,"cs")));
		employees.add(new Employee(103,"aaksh","garg","","",null,"",6000,201,new Department(302,202,"me")));
		employees.add(new Employee(104,"ritvik","jain","","",null,"",7000,201,new Department(301,201,"cs")));
		employees.add(new Employee(105,"yash","geel","","",null,"",5000,201,new Department(302,202,"me")));
		employees.add(new Employee(106,"todi","shubham","","",null,"",4000,201,new Department(301,201,"cs")));
		employees.add(new Employee(107,"aish","geel","","",null,"",5000,201,new Department(0,0,"")));
		employees.add(new Employee(108,"shubham","gaur","","",null,"",4000,201,new Department(0,0,"")));
		
		
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
