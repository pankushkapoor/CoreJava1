package com.cg.project.collectionsdemo;

import java.util.LinkedList;
import java.util.Collections;

public class LinklistClassDemo {

	public static void main(String[] args) {
		LinkedList<String>strList = new LinkedList<String>();
		strList.add("Satish");
		strList.add("Pankush");
		strList.add("Aman");
		strList.add("Harshit");
		strList.add("Nikhil");

		//searching
		System.out.println(strList.contains("Pankush"));
		System.out.println(strList.indexOf("Aman"));

		//sorting
		Collections.sort(strList);
		System.out.println(strList);

		//traversal
		for(int i = 0; i<strList.size(); i++){
			System.out.println(strList.get(i));
		}

		//enhanced for loop
		for (String name : strList) {
			System.out.println(name);
		}

	}

}
