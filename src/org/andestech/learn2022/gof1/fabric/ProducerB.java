package org.andestech.learn2022.gof1.fabric;

public class ProducerB extends AFabrica {

	@Override
	public IProduct produce() {
		return new ProductB();
	}
}
