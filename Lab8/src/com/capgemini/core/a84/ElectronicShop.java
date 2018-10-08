package com.capgemini.core.a84;

public class ElectronicShop {

	boolean isProductReady=false;
	public synchronized void billing() throws InterruptedException {
		// TODO Auto-generated method stub
		if(isProductReady==false)
			wait();
		
		System.out.println("Products Price is="+(int)(Math.random()*1000));
		isProductReady=false;
		
		notify();

	}
	
	public synchronized void products(int i) throws InterruptedException
	{
		if(isProductReady==true)
			wait();
		
		System.out.println("Products for billing "+i);
		isProductReady=true;
		
		notify();
		
		
	}
}

