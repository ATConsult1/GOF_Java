package org.andestech.learn2022.gof1.builder;

public interface IBuilder {

	public IBuilder doA();
	public IBuilder doB();
	IProduct doFinal();
	public void reset();
	
	//...
}

