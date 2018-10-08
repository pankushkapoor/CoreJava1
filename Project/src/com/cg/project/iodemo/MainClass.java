package com.cg.project.iodemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.project.iodemo.IOClassesDemo;

public class MainClass {

	public static void main(String[] args) {
		try{
			File file = new File("D:\\AssociateData.txt");
			SerializationDemo.doSerialization(file);
			SerializationDemo.doDeSerialization(file);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
		/*try{
			File fileFrom = new File("D:\\");
			File fileTo = new File("D:\\" + fileFrom.getName());
			
			IOClassesDemo.charStreamReadWrite(fileFrom, fileTo);
			
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //already encapsulated in scanner
		}catch(IOException e){
			e.printStackTrace();
		}*/
	}

}
