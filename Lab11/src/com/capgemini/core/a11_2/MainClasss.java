package com.capgemini.core.a11_2;

public class MainClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FormatString f=(str)->{
			int i=0;
			String s="";
			while(i<str.length()-1)
			{
				s+=str.charAt(i)+" ";
				i++;
			}
			s+=str.charAt(i);
			return s;
		};
		
		
		System.out.println("After Format: "+f.applyformatting("anish"));
	}

}
