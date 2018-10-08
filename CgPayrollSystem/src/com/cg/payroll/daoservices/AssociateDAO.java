package com.cg.payroll.daoservices;

import java.util.ArrayList;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO {
	Associate save(Associate associate);
	Associate findOne(int associateId);
	//Associate[] findAll();
	ArrayList<Associate> findAll(); //we can use arraylist in place of taking an array
}
