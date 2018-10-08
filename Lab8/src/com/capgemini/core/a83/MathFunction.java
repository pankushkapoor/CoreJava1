package com.capgemini.core.a83;

class RandomFunction extends Thread {

	int n;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		n = (int) (Math.random() * 10);
		System.out.println("Number= " + n);

	}

	public int getn() {
		return n;
	}
}

class FactorialFunction extends Thread {

	int n;

	public FactorialFunction(int n) {
		super();
		this.n = n;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int fact = 1;
		for (int i = n; i > 1; i--) {
			fact *= i;
		}
		System.out.println("Factorial= " + fact);
	}

}
