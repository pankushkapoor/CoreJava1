package com.capgemini.core.a73;

import java.util.ArrayList;
import java.util.List;

public class ListRemove 
{
	
	public static void main(String[] args) {
	
		List<String> l1=new ArrayList<String>();
		List<String> l2=new ArrayList<String>();
		l1.add("abc");
		l1.add("abcd");
		l1.add("abce");
		l1.add("abcf");
		l1.add("abcg");
		l2.add("abc");
		l2.add("abcf");
		l2.add("abcg");
		l2.add("abce");
		
		removeElements(l1,l2);
		
		System.out.println(l1);
	}

	private static void removeElements(List<String> l1, List<String> l2) {
		
		l1.removeAll(l2);
		
	}

}
