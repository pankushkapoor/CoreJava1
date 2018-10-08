package com.capgemini.core.a81;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	
			
			try {
				FileReader input = new FileReader("D:/anish/source.txt");
				FileWriter output=new FileWriter("D:/anish/target.txt");
				int i;
				int count=0;
				while((i=input.read())!=-1)
				{
					output.write(i);
					//System.out.println(""+i);
					count++;
					if(count==10)
					{
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
						count=0;
					}
					i++;
					
				}
				
		
				input.close();
				output.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
	
	

}
}
