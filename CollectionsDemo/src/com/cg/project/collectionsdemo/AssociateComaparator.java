package com.cg.project.collectionsdemo;

import java.util.Comparator;
import com.cg.project.beans.Associate;

public class AssociateComaparator implements Comparator<Associate>{

	@Override
	public int compare(Associate o1, Associate o2) {
		return o1.getSalary() - o2.getSalary();
	}

	
}
