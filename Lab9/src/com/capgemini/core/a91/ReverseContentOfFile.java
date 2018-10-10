package com.capgemini.core.a91;


import java.io.FileReader;
import java.io.FileWriter;

public class ReverseContentOfFile {
	
	public static void main(String[] args) {
		
		
		String s=null;
		try {
			s = read();
			write(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void write(String s) throws Exception {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter("D:/anish/target.txt");
		writer.write(s);
		writer.close();
		System.out.println("output  is written");
		
	}

	private static String read() throws Exception {
		// TODO Auto-generated method stub
		
		FileReader reader=new FileReader("D:/anish/source.txt");
		byte i;
		StringBuffer s=new StringBuffer();
		while((i=(byte) reader.read())!=-1) 
		{
			char c=(char)i;
			s.append(c);
		}		
		reader.close();
		return s.reverse().toString();
		
		

}
}
