package com.capgemini.core.a75;

import java.util.ArrayList;
import java.util.Collections;

public class SortProduct {
	
	public static void main(String[] args) {
		
		ArrayList<String> products=new ArrayList<String>();
		
		products.add("television");
		products.add("machine");
		products.add("mobile");
		products.add("computer");
		products.add("laptop");
		products.add("bike");
		 getSortedProducts(products);
		 
		 
		for(String i:products){
			System.out.println(""+i); 
		 }
	}

	private static void getSortedProducts(ArrayList<String> products) {
		
		Collections.sort(products);
		
		
	}

}
