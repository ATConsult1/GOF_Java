package org.andestech.learn2022.gof1.abstractfabric;

public class ProductAgreen implements IProductA {

	public ProductAgreen() {
		System.out.println("+++ ctor: " + this);
	}
	
	@Override
	public void plugIn() {
		System.out.println("++ ProdA plugin");
		
	}

}
