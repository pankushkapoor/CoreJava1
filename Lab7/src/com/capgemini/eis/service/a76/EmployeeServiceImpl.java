package com.capgemini.eis.service.a76;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.capgemini.eis.bean.a76.Employee;

import java.util.Set;
import java.util.TreeMap;

public class EmployeeServiceImpl implements EmployeeService {
	
	private HashMap<Integer,Employee> employees=new HashMap();
	private int employeeId=1000;


	public int getEmpId()
	{
		return ++employeeId;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		int id=getEmpId();
		System.out.println();
		employees.put(id,employee);
		
	}

	@Override
	public void deleteEmloyee(int id) {
		// TODO Auto-generated method stub
		
		employees.remove(id);
		
	}
	@Override
	public HashMap<Integer, Employee> getEmployees() {
		// TODO Auto-generated method stub
		if(employees.isEmpty())
		{
			System.out.println("No Employee is found");
		}
		return employees;
	}

	@Override
	public List<Employee> scheme(String scheme) {
		// TODO Auto-generated method stub
		//List<Employee> schemelist=new
		List<Employee> result=new ArrayList<Employee>();
		Set s=employees.entrySet();
		Iterator i=s.iterator();
		int flag=0;
		while(i.hasNext())
		{
			Map.Entry m=(Map.Entry)i.next();
			Employee e=(Employee)m.getValue();
			if(e.getInsuranceScheme().equalsIgnoreCase(scheme))
			{
				result.add(e);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("No record found");
		}
		return result;
	}

	@Override
	public  void sort() {
		// TODO Auto-generated method stub
		Comparator<Entry<Integer, Employee>> comparator=new Comparator<Entry<Integer, Employee>>(){

			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
				// TODO Auto-generated method stub
				Employee e2=o2.getValue();
				Employee e1=o1.getValue();
				return e1.getName().compareTo(e2.getName());
			}};
		Set<Entry<Integer, Employee>> set=employees.entrySet();
		List<Entry<Integer, Employee>> sortbyvalueslist=new LinkedList<Entry<Integer,Employee>>(set);
		Collections.sort(sortbyvalueslist,comparator);
		LinkedHashMap<Integer, Employee> finalresult=new LinkedHashMap<Integer, Employee>(sortbyvalueslist.size());
		
		for(Entry<Integer, Employee> entry:sortbyvalueslist)
		{
			finalresult.put(entry.getKey(), entry.getValue());
		//System.out.println(""+entry.getKey()+" "+entry.getValue());
		}
		//	Collections.sort(employees,comparator);
		employees=finalresult;
		
	}

}
