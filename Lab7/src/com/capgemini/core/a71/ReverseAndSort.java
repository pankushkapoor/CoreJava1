package com.capgemini.core.a71;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAndSort {
	
	public static void main (String args[]) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(23);
		a.add(96);
		a.add(45);
		a=getSorted(a);
		for(int i=0;i<a.size();i++)
		{
		System.out.print(" "+a.get(i));	
		}
	}

	private static ArrayList<Integer> getSorted(ArrayList<Integer> a) {
		
		String s=null;
		for(int i=0;i<a.size();i++)
		{
			s=""+a.get(i);
			StringBuilder s1=new StringBuilder(s);
			s1.reverse();
			a.remove(i);
			a.add(Integer.parseInt(s1.toString()));

		}
		//Arrays.sort(a);
		Collections.sort(a);
		return a;
	
		
	}

}
