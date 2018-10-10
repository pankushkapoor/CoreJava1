package com.capgemini.core.a11_3;

public class MainClass {

	public static void main(String[] args) {
		
		UserPassw p=(user,pass)->{
			
			if(user.equalsIgnoreCase("admin")&&pass.equals("admin123"))
				return true;
			
			return false;
		};
		
		System.out.println(""+p.check("admin", "admin123"));
		}

}
