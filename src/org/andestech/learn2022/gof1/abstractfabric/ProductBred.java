package org.andestech.learn2022.gof1.abstractfabric;

public class ProductBred implements IProductB {

	public ProductBred() {
		System.out.println("+++ ctor: " + this);
	}
	
	@Override
	public void plugIn() {
		System.out.println("++ ProdB plugin");
		
	}

}
