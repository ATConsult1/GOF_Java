package org.andestech.learn2022.gof1.abstractfabric;

public class GreenProductFactory implements AbstractFactory {

	@Override
	public IProductA produceA() {

		return new ProductAgreen();
	}

	@Override
	public IProductB produceB() {

		return new ProductBgreen();
	}


	
}
