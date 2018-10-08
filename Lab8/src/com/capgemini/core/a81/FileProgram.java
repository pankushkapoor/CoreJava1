package com.capgemini.core.a81;

public class FileProgram {

	public static void main(String[] args) {
		
		CopyThread copy=new CopyThread();
		copy.start();
	}
}
