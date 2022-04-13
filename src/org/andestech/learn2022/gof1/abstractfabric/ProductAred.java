package org.andestech.learn2022.gof1.abstractfabric;

public class ProductAred implements IProductA {

	public ProductAred() {
		System.out.println("+++ ctor: " + this);
	}
	
	@Override
	public void plugIn() {
		System.out.println("++ ProdA red plugin");
		
	}

}
