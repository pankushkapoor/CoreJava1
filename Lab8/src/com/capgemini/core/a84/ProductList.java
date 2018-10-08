package com.capgemini.core.a84;

public class ProductList extends Thread{

	ElectronicShop shop;
	

	/**
	 * 
	 */
	public ProductList(ElectronicShop shop) {
		super();
		this.shop=shop;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
		try {
			shop.products(i);
			Thread.sleep(1000);
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
