package com.cg.project.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cg.payroll.beans.Associate;
import com.cg.project.beans.Address;

public class SerializationDemo {

	public static void doSerialization(File file) throws FileNotFoundException, IOException{
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))){
			Associate associate = new Associate();//112,15999,"Pankush",new Address("Pune","Maha", "ble", 2));
			writer.writeObject(associate);
			System.out.println("Object transferred to: " +file);
		}
	}
	public static void doDeSerialization(File file)throws FileNotFoundException, IOException, ClassNotFoundException{
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			Associate associate = (Associate) reader.readObject();
			System.out.println(associate);
		}
	}
}