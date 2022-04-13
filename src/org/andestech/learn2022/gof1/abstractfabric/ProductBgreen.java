package org.andestech.learn2022.gof1.abstractfabric;

public class ProductBgreen implements IProductB {

	public ProductBgreen() {
		System.out.println("+++ ctor: " + this);
	}
	
	@Override
	public void plugIn() {
		System.out.println("++ ProdB plugin");
		
	}

}
