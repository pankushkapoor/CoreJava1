package com.capgemini.core.a92;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerRead {
	
	public static void main(String[] args) {
		
		File file=new File("D:/anish/number.txt");
		try {
			Scanner sc =new Scanner(file);
			
			while(sc.hasNext())
			{
				String[] s=sc.next().split(",");
				printEven(s);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void printEven(String[] s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++)
		{
			int num=Integer.parseInt(s[i]);
			if(num%2==0)
			{
				System.out.println(""+num);
			}
			
		}
	}

}
