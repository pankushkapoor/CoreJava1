package com.cg.project.collectionsdemo;

import java.util.HashMap;
import java.util.TreeMap;

import com.cg.project.beans.Associate;

public class MapClassDemo {
	public static void hashMapDemo(){
		HashMap<Integer, Associate>associates = new HashMap<>();

		associates.put(103,new Associate(103, 15000, "Pankush")); 
		associates.put(101,new Associate(101, 25000, "Harshit"));
		associates.put(102,new Associate(102, 35000, "Aman"));

		System.out.println(associates.get(102));

		TreeMap<Integer, Associate>treeSet = new TreeMap<>();
		treeSet.putAll(associates); //putting hashmap values in treeset
		System.out.println(treeSet); // tree already sorted.
	}
	public static void main (String[] args) {
		//MapClassDemo ob = new MapClassDemo();
		hashMapDemo();
	}
}
