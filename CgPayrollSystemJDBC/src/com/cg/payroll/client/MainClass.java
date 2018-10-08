package com.cg.payroll.client;

/*import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;*/


import java.sql.SQLException;

import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;

public class MainClass {
	public static void main(String[] args) throws SQLException {

		PayrollServices payrollServices = new PayrollServicesImpl(); //Main layer connecting to the service layer
		try {
			payrollServices.acceptAssociateDetails(20000, "Pankush", "Kapoor", "ADM", "SA", "FDJ24919", "pk@gmail.com", 12000, 1000, 2200, 7854, "HDFC", "HDFC00031");
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
	}
}
