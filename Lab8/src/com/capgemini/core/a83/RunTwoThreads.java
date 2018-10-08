package com.capgemini.core.a83;

public class RunTwoThreads {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			RandomFunction r = new RandomFunction();
			r.start();
			r.join();
			int n = r.getn();
			FactorialFunction f = new FactorialFunction(n);
			f.start();

		}
	}

}
