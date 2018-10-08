package com.cg.payroll.daoservices;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.util.ConnectionProvider;
public class AssociateDAOImpl implements AssociateDAO{
	private Connection conn = ConnectionProvider.getDBConnection();
	@Override
	public Associate save(Associate associate) throws SQLException {
		try{
			conn.setAutoCommit(false);
			PreparedStatement pstmt1 = conn.prepareStatement("INSERT INTO Associate(yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailid) values(?,?,?,?,?,?,?)");
			pstmt1.setInt(1, associate.getYearlyInvestmentUnder80C());
			pstmt1.setString(2, associate.getFirstName());
			pstmt1.setString(3, associate.getLastName());
			pstmt1.setString(4, associate.getDepartment());
			pstmt1.setString(5, associate.getDesignation());
			pstmt1.setString(6, associate.getPancard());
			pstmt1.setString(7, associate.getEmailId());
			pstmt1.executeUpdate();

			PreparedStatement pstmt2 = conn.prepareStatement("SELECT MAX(associateId) FROM Associate");

			ResultSet rs = pstmt2.executeQuery();
			rs.next();
			int associateId = rs.getInt(1); // as there will be only one column\

			PreparedStatement pstmt3 = conn.prepareStatement("INSERT INTO BankDetails VALUES(?,?,?,?)");
			pstmt3.setInt(1,associateId);
			pstmt3.setInt(2,associate.getBankdetails().getAccountNumber());
			pstmt3.setString(3, associate.getBankdetails().getBankName());
			pstmt3.setString(4, associate.getBankdetails().getIfscCode());

			pstmt3.executeUpdate();

			PreparedStatement pstmt4 = conn.prepareStatement("INSERT INTO Salary(associateId, basicSalary, epf, companypf) values(?,?,?,?)");
			pstmt4.setInt(1, associateId);
			pstmt4.setInt(2,associate.getSalary().getBasicSalary());
			pstmt4.setInt(3,associate.getSalary().getEpf());
			pstmt4.setInt(4,associate.getSalary().getCompanyPf());

			pstmt4.executeUpdate();
			conn.commit(); // should write at the end of try block to commit all the statements
			associate.setAssociateID(associateId);
			return associate;

		}catch(SQLException e){
			e.printStackTrace();
			conn.rollback();
			throw e;
		}
		finally{
			conn.setAutoCommit(true);
		}
	}
	@Override
	public Associate findOne(int associateId) throws SQLException{
		PreparedStatement pstmt1 = conn.prepareStatement("SELECT * FROM Associate WHERE associateId="+associateId);
		ResultSet associateRS = pstmt1.executeQuery();
		if(associateRS.next()){
			String firstName = associateRS.getString("firstName");
			String lastName = associateRS.getString("lastName");
			String department = associateRS.getString("department");
			String designation = associateRS.getString("designation");
			String pancard = associateRS.getString("pancard");
			String emailId = associateRS.getString("emailId");
			int yearlyInvestmentUnder80C = associateRS.getInt("yearlyInvestmentUnder80C");
			Associate associate = new Associate(associateId, yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, null, null);
			
			PreparedStatement pstmt2 = conn.prepareStatement("SELECT * FROM BankDetails WHERE associateId="+associateId);
			ResultSet bankDetailsRS = pstmt2.executeQuery();
			bankDetailsRS.next();
			
			int accountNumber=bankDetailsRS.getInt("accountNumber");
			String bankName = bankDetailsRS.getString("bankName");
			String ifscCode = bankDetailsRS.getString("ifscCode");
			associate.setBankdetails(new BankDetails(accountNumber, bankName, ifscCode));
			
			PreparedStatement pstmt3 = conn.prepareStatement("SELECT * FROM Salary WHERE associateId="+associateId);
			ResultSet salaryRS = pstmt3.executeQuery();
			salaryRS.next();
			
			associate.setSalary(new Salary(salaryRS.getInt("basicSalary"),salaryRS.getInt("hra"),salaryRS.getInt("conveyenceAllowance"),salaryRS.getInt("otherAllowance"),salaryRS.getInt("personalAllowance"),salaryRS.getInt("monthlyTax"),salaryRS.getInt("epf"),salaryRS.getInt("companyPf"),salaryRS.getInt("gratuity"),salaryRS.getInt("grossSalary"),salaryRS.getInt("netSalary")));
			return associate;
		}
		return null;
	}
	@Override
	public ArrayList<Associate> findAll() throws SQLException{
		PreparedStatement pstmt1 = conn.prepareStatement("SELECT * FROM Associate");
		ResultSet associateRS = pstmt1.executeQuery();
		
		ArrayList<Associate> associates = new ArrayList<>();
		while(associateRS.next()){
			int associateId = associateRS.getInt("associateId");
			String firstName = associateRS.getString("firstName");
			String lastName = associateRS.getString("lastName");
			String department = associateRS.getString("department");
			String designation = associateRS.getString("designation");
			String pancard = associateRS.getString("pancard");
			String emailId = associateRS.getString("emailId");
			int yearlyInvestmentUnder80C = associateRS.getInt("yearlyInvestmentUnder80C");
			Associate associate = new Associate(associateId, yearlyInvestmentUnder80C, firstName, lastName, department, designation, pancard, emailId, null, null);
			
			PreparedStatement pstmt2 = conn.prepareStatement("Select * from BankDetails where associateId="+associateId);
			ResultSet bankdetailsRs=pstmt2.executeQuery();
			bankdetailsRs.next();
			
			int accountNumber = bankdetailsRs.getInt("accountNumber");
			String bankName = bankdetailsRs.getString("bankName");
			String ifscCode = bankdetailsRs.getString("ifscCode");
			associate.setBankdetails(new BankDetails(accountNumber, bankName, ifscCode));
			PreparedStatement pstmt3 = conn.prepareStatement("select * from Salary where associateId="+associateId);
			ResultSet salaryRS = pstmt3.executeQuery();
			salaryRS.next();
			associate.setSalary(new Salary(salaryRS.getInt("basicSalary"),salaryRS.getInt("hra"),salaryRS.getInt("conveyenceAllowance"),salaryRS.getInt("otherAllowance"),salaryRS.getInt("personalAllowance"),salaryRS.getInt("monthlyTax"),salaryRS.getInt("epf"),salaryRS.getInt("companyPf"),salaryRS.getInt("gratuity"),salaryRS.getInt("grossSalary"),salaryRS.getInt("netSalary")));
			associates.add(associate);
		}
		return associates;
	}
	@Override
	public boolean update(Associate associate) {
	
		return false;
	}
}


















