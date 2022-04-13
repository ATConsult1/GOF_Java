package org.andestech.learn2022.gof1.fabric;

public class ProductB implements IProduct {

	public ProductB() {
		System.out.println("+++ ctor: " + this);
	}
	
	@Override
	public void plugIn() {
		System.out.println("++ ProdB plugin");
		
	}

}
