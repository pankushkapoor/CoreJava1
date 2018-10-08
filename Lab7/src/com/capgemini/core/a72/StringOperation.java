package com.capgemini.core.a72;

import java.util.ArrayList;

public class StringOperation {
	
	private static ArrayList<String> operation(String s1,String s2){
		ArrayList<String> result=new ArrayList<String>();
		int i=0,j=0;
		StringBuffer news1=new StringBuffer(s1);
		StringBuffer news2=new StringBuffer(s2);
		
		//1
		while(j<s2.length()&&i<s1.length())
		{
		news1.replace(i,i+1 , ""+s2.charAt(j));
		i+=2;
		j+=1;
		}
		result.add(news1.toString());
		news1=new StringBuffer(s1);
		
	
		//2
		i=0;
		int count=0,index=0;
		while(i<s1.length())
		{
			
			if(s1.indexOf(s2,i)!=-1)
			{
			index=s1.indexOf(s2,i);
			i=s1.indexOf(s2,i)+s2.length();
			
			count++;
			
			}
			else
			{
				break;
			}
		}
		if(count>1)
		{
			news1.replace(index, index+s2.length(), news2.reverse().toString());
		}
		else
		{
			news1.append(s2);
		}
		result.add(news1.toString());
		
		news1=new StringBuffer(s1);
		
		//3
		i=0;
		count=0;index=s1.indexOf(s2,i);
		while(i<s1.length())
			
		{
			if(s1.indexOf(s2,i)!=-1)
			{
			i=s1.indexOf(s2,i)+s2.length();
			count++;
			if(count>1)
			{
			news1.delete(index, index+s2.length());
			}
			}
			else
			{
				break;
			}
		}
			result.add(news1.toString());
			news1=new StringBuffer(s1);		
			
			
			//4
			int length=s2.length()-s2.length()/2;
			news1.insert(0,s2.substring(0,length));
			news1.append(s2.substring(length));
			result.add(news1.toString());
			
			
			
			//5
			for(i=0;i<s2.length();i++)
			{
				s1=s1.replace(s2.charAt(i), '*');
				
				
			}
			result.add(s1);
			
			
			return result;
		
	
	}
	
	public static void main(String[] args) {
		
		//ArrayList<String> a=operation("habcdlabcdlo", "abcd");
		ArrayList<String> a=operation("abcdefgh", "abc");
		
		System.out.println(a);
	}

}
