package com.cg.project.client;

import com.cg.project.mathservices.MathServices;
import com.cg.project.mathservices.MathServicesImpl;
import com.cg.project.exceptions.InvalidNumberRangeException;

public class MainClass {

	public static void main(String[] args) {
		try{
		MathServices services = new MathServicesImpl();
		services.multiNums(10, 20);
		services.addNums(10, 20);
		}
		catch(InvalidNumberRangeException e){
			e.printStackTrace();
		}
	}
	
}
