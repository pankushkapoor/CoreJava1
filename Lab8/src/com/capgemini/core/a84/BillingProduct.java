package com.capgemini.core.a84;

public class BillingProduct extends Thread{

	ElectronicShop shop;
	public BillingProduct(ElectronicShop shop) {
		// TODO Auto-generated constructor stub
		this.shop=shop;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i=0;i<5;i++)
		{
		try {
			shop.billing();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	
	

}
