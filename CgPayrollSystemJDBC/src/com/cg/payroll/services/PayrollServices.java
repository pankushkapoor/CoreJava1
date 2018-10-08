package com.cg.payroll.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
/*import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;*/
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public interface PayrollServices {
	int acceptAssociateDetails(int yearlyInvestmentUnder80C,
			String firstName, String lastName, String department,
			String designation, String pancard, String emailId,int basicSalary,int epf,int companyPf,
			int accountNumber, String bankName, String ifscCode) throws PayrollServicesDownException, SQLException;
	
	int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException,PayrollServicesDownException, SQLException;
	
	Associate getAssociateDetails(int associateId) throws PayrollServicesDownException,AssociateDetailNotFoundException, SQLException;

	ArrayList<Associate> getAllAssociateDetails() throws PayrollServicesDownException, SQLException;
	//ArrayList<Associate> getAllAssociateDetails() throws PayrollServicesDownException;

}
