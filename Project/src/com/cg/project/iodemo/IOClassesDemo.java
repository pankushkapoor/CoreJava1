package com.cg.project.iodemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class IOClassesDemo {
	public static void fileClassDemo() throws IOException {
		File file = new File("D:\\DataFile.txt");
		System.out.println(file.exists());
		if(!file.exists()) file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.length());
		System.out.println(file.getPath());
		System.out.println(file.getName());
	}
	public static void byteStreamReadWrite(File fileFrom, File fileTo) throws IOException{
		try(BufferedInputStream srcStream = new BufferedInputStream(new FileInputStream(fileFrom))){
			try(BufferedOutputStream destStream = new BufferedOutputStream(new FileOutputStream(fileTo))){
				/*//First method 
				 int a = 0;
				while((a=srcStream.read())!=-1){
					destStream.write(a) ;
				}
				//Second Method
				byte[] dataBuffer = new byte[1024];
				while(srcStream.read(dataBuffer)!=-1){
					destStream.write(dataBuffer);
				} //third method
*/				byte[] dataBuffer = new byte[(int) fileFrom.length()];
				srcStream.read(dataBuffer);
				destStream.write(dataBuffer);
			}
		}
		System.out.println("File has been Transferred");
	}

public static void charStreamReadWrite(File fileFrom, File fileTo) throws IOException{
	try(BufferedReader srcStream = new BufferedReader (new FileReader(fileFrom))){
		try(BufferedWriter destStream = new BufferedWriter(new FileWriter(fileTo))){
			String dataBuffer = "";
			dataBuffer = srcStream.readLine();
			destStream.write(dataBuffer);
		}
	}
	System.out.println("File has been Transferred");
}
}