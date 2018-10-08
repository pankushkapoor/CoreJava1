package com.cg.payroll.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.daoservices.AssociateDAO;
import com.cg.payroll.daoservices.AssociateDAOImpl;
import com.cg.payroll.exceptions.AssociateDetailNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;

public class PayrollServicesImpl implements PayrollServices{

	private AssociateDAO associateDAO = new AssociateDAOImpl();

	@Override
	public int acceptAssociateDetails(int yearlyInvestmentUnder80C, String firstName, String lastName, String department,
			String designation, String pancard, String emailId, int basicSalary, int epf, int companyPf, int accountNumber,
			String bankName, String ifscCode) throws PayrollServicesDownException, SQLException {

		Associate associate = new Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, new BankDetails(accountNumber, bankName, ifscCode), new Salary(basicSalary, epf, companyPf));
		associate = associateDAO.save(associate);
		return associate.getAssociateID();
	}

	@Override
	public int calculateNetSalary(int associateId) throws AssociateDetailNotFoundException, PayrollServicesDownException, SQLException {
		Associate associate=getAssociateDetails(associateId);

		//calculating all the values
		associate.getSalary().setHra((30 * associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setOtherAllowance((20 * associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setPersonalAllowance((25 * associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setConveyenceAllowance((15 * associate.getSalary().getBasicSalary())/100);
		associate.getSalary().setGrossSalary((associate.getSalary().getBasicSalary())+(associate.getSalary().getHra())+(associate.getSalary().getConveyenceAllowance()) + (associate.getSalary().getPersonalAllowance()) + (associate.getSalary().getOtherAllowance()));

		System.out.println("Basic Salary : " + associate.getSalary().getBasicSalary());
		System.out.println("Personal Allowance : " + associate.getSalary().getPersonalAllowance());
		System.out.println("HRA : " + associate.getSalary().getHra());
		System.out.println("OtherAllowance : " + associate.getSalary().getOtherAllowance());
		System.out.println("Conveyence Allowance : " + associate.getSalary().getConveyenceAllowance());
		System.out.println("Gross Salary : " + associate.getSalary().getGrossSalary());

		int salaryPerAnnum = (associate.getSalary().getGrossSalary() * 12);
		if(salaryPerAnnum <= 250000){
			associate.getSalary().setMonthlyTax(0); //tax 0 for 0 to 250000
		}
		else if(salaryPerAnnum > 250000 && salaryPerAnnum <= 500000)
			associate.getSalary().setMonthlyTax((10 * ((associate.getSalary().getGrossSalary()*12) - 250000))/(100 * 12));
		else if(salaryPerAnnum > 500000 && salaryPerAnnum <= 1000000){
			int for5to10 = (20 * (1000000 - associate.getSalary().getBasicSalary()))/100;
			associate.getSalary().setMonthlyTax((25000 + for5to10)/12);   //Added 250000 to 500000 ka tax differently
		}

		associate.getSalary().setNetSalary((associate.getSalary().getBasicSalary()) - (associate.getSalary().getMonthlyTax()));
		return associate.getSalary().getNetSalary();
	}

	@Override
	public Associate getAssociateDetails(int associateId) throws PayrollServicesDownException, AssociateDetailNotFoundException, SQLException {
		Associate associate = associateDAO.findOne(associateId);
		if(associate == null) throw new AssociateDetailNotFoundException("Associate Details not found");
		return associate;
	}

	@Override
	//public Associate[] getAllAssociateDetails() throws PayrollServicesDownException {
	public ArrayList<Associate> getAllAssociateDetails() throws PayrollServicesDownException, SQLException {
		return associateDAO.findAll();
	}
}
