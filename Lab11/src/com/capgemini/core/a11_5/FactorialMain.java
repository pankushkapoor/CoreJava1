package com.capgemini.core.a11_5;

interface Factorial {

	public void calculate(int num);
}


class FactorialImpl implements Factorial{
	
	public FactorialImpl(int num) {
		// TODO Auto-generated constructor stub
		int fact=1;
		for(int i=num;i>=2;i--)
		{
			fact*=i;
		}
		
		System.out.println(fact);
	}

	@Override
	public void calculate(int num) {
		// TODO Auto-generated method stub
		
	}
	
}



public class FactorialMain{
	
	public static void main(String[] args) {
		
		Factorial f=FactorialImpl::new;
		f.calculate(5);
		
	}
}