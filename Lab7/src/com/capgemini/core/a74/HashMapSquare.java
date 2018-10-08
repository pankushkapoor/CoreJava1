package com.capgemini.core.a74;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapSquare {

	public static void main(String[] args) {
	
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(6);
		
	
		
		HashMap<Integer,Integer> hm=getSquares(l1);
		
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			//Map.Entry<Integer, Integer> me=(Map.Entry<Integer, Integer>)it.next();
			System.out.println(""+it.next());
			
		}
		

	}

	private static HashMap<Integer, Integer> getSquares(List<Integer> l1) {
		
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
	
	
		Iterator it=l1.iterator();
		
		while(it.hasNext())
		{
			Integer i1=(Integer)it.next();
			hm.put(i1,i1*i1 );
			
		}
		
		return hm;
	}

}
