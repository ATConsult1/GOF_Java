package org.andestech.learn2022.gof1.abstractfabric;

public class RedProductFactory implements AbstractFactory {

	@Override
	public IProductA produceA() {
		// TODO Auto-generated method stub
		return new ProductAred();
	}

	@Override
	public IProductB produceB() {
		// TODO Auto-generated method stub
		return new ProductBred();
	}

	
	
}
