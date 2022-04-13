package org.andestech.learn2022.gof1.fabric;

public class ProductA implements IProduct {

	public ProductA() {
		System.out.println("+++ ctor: " + this);
	}
	
	@Override
	public void plugIn() {
		System.out.println("++ ProdA plugin");
		
	}

}
