package com.cg.payroll.client;

/*import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;*/

import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {
	public static void main(String[] args) {

		PayrollServices payrollServices = new PayrollServicesImpl(); //Main layer connecting to the service layer
		try {
			payrollServices.acceptAssociateDetails(20000, "Pankush", "Kapoor", "ADM", "SA", "FDJ24919", "pk@gmail.com", 12000, 1000, 2200, 76834654l, "HDFC", "HDFC00031");
		} catch (PayrollServicesDownException e) {
			e.printStackTrace();
			System.out.println("Payroll Services has down");
		}
		try {
			System.out.println("Net Salary : " + payrollServices.calculateNetSalary(101));
		} catch (AssociateDetailNotFoundException | PayrollServicesDownException e) {
			e.printStackTrace();
			System.out.println("Associate Detail Not Found");

		}

		try {
			payrollServices.getAssociateDetails(101);
		} catch (PayrollServicesDownException e) {
			System.out.println("Payroll Services has down");
			e.printStackTrace();
		} catch (AssociateDetailNotFoundException e) {
			System.out.println("Associate Detail Not Found");
			e.printStackTrace();
		}

		try {
			payrollServices.getAllAssociateDetails();
		} catch (PayrollServicesDownException e) {
			System.out.println("Payroll Services has down");
			e.printStackTrace();
		}

		//---------------------------Some other problem---------------------------
		//int num = 100;

		//Objects of Associate Class
		/*Associate associate1=new Associate("1a","1000","ab","cd","tech","sa","1a2b","abc1@gmail.com");
		Associate associate2=new Associate("2a","2000","ab","cd","tech","sa","1a2b","abc2@gmail.com"); //pointing to the object
		Associate associate3=new Associate("3a","3000","ab","cd","tech","sa","1a2b","abc3@gmail.com");
		associate1.setFirstName("Rahul");
		associate2.setFirstName("Keshav");
		System.out.println("firstName:-"+associate1.getFirstName()+" "+associate1.getLastName());
		System.out.println(Associate.getASSOCIATE_COUNTER());

		//Objects of BankDetails Class
		BankDetails bankdetails1 = new BankDetails("582635026","hdfc","hdfc0000067");
		BankDetails bankdetails2 = new BankDetails("582636","hdfc","hdfc0000007");
		BankDetails bankdetails3 = new BankDetails("58263600","hdfc","hdfc00000057");

		//Objects of Salary Class
		Salary salary1 = new Salary("520","1002",522,222,52,782,727,452,782,625,982);
		Salary salary2 = new Salary("507","1070",752,272,57,778,777,475,787,675,987);
		Salary salary3 = new Salary("504","1004",524,242,54,748,747,445,784,465,984);*/

		/*Associate associate1 = new Associate("1a",1000,"ab","cd","tech","sa","1a2b","abc1@gmail.com", 
							   new BankDetails("582635026","hdfc","hdfc0000067"), 
							   new Salary(10000, 4000, 3000, 3000, 10000));
		System.out.println(associate1.getSalary().getBasicSalary());
		associate1.getSalary().setOtherAllowance((20*associate1.getSalary().getBasicSalary()/100));
		System.out.println(associate1.getSalary().getOtherAllowance());*/
	}
	
}
