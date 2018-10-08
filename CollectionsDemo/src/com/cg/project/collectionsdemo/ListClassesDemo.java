package com.cg.project.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;
import com.cg.project.beans.Associate;

public class ListClassesDemo {

	public static void main(String[] args) {

		/////-----using associate class------------

		ArrayList<Associate> associateList = new ArrayList<>();
		associateList.add(new Associate(103, 15000, "Pankush")); //accepts object inside add, so giving new objects everytime
		associateList.add(new Associate(101, 25000, "Harshit"));
		associateList.add(new Associate(102, 35000, "Aman"));

		Associate associateToBeSearched = new Associate(103, 15000, "Pankush");
		System.out.println(associateList.contains(associateToBeSearched)); //if we had not override'd equals method, then it would not have given the required result. try karke dekhiye.
		System.out.println(associateList.indexOf(associateToBeSearched));

		Collections.sort(associateList); //simple sorting
		System.out.println("Id-wise");
		for (Associate associate : associateList) {
			System.out.println(associate);
		}
		System.out.println("Salary-wise");
		Collections.sort(associateList, new AssociateComaparator()); //artificial sorting
		for (Associate associate : associateList) {
			System.out.println(associate);
		}

		for (Associate associate : associateList) {
			if(associate.getAssociateId() == 103 && associate.getName().equals("Pankush")) //return type of getAssociateId is integer so use ==
				System.out.println("true");
		}



		//-----------using string collection class---------
		/*ArrayList<String>strList = new ArrayList<String>();
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
		}*/
	}

}
