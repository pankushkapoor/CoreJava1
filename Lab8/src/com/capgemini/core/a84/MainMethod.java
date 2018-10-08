package com.capgemini.core.a84;

public class MainMethod {
	public static void main(String[] args) {
		ElectronicShop shop=new ElectronicShop();
		ProductList p=new ProductList(shop);
		BillingProduct b=new BillingProduct(shop);
		p.start();
		b.start();
		
		
	}
}
