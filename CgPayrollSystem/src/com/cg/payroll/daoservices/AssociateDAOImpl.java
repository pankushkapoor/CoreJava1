package com.cg.payroll.daoservices;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.payroll.beans.Associate;

public class AssociateDAOImpl implements AssociateDAO{

	private static HashMap<Integer, Associate> associates = new HashMap<>(); //Created a hashmap instead of taking an array of associates
	private static int ASSOCIATE_COUNTER = 101;
	//private static int ASSOCIATE_INDEX = 0;
	//private static Associate[] associates = new Associate[10];

	@Override
	public Associate save(Associate associate) {
		associate.setAssociateID(ASSOCIATE_COUNTER++);
		//associates[ASSOCIATE_INDEX++] = associate;    //Don't have to define index as dynamic array we're using
		associates.put(associate.getAssociateID(), associate);
		return associate;
	}

	@Override
	public Associate findOne(int associateId) {
		/*for(int i = 0; i < associates.length; i++)
			if(associates[i]!= null && associateId == associates[i].getAssociateID()) //in associate details array, details got finished and we did not find the id we were looking for, so to check null
				return associates[i];
		return null;*/
		return associates.get(associateId);
	}

	@Override
	/*public Associate[] findAll() {
		return associates;
	}*/
	public ArrayList<Associate>findAll(){
		return new ArrayList<>(associates.values());
	}
}
