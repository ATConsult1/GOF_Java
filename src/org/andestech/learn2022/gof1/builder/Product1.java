package org.andestech.learn2022.gof1.builder;

public class Product1 implements IProduct {

	private int a=0,b=0;

	@Override
	public void addA(int a) {
		this.a += a;
	}

	@Override
	public void addB(int b) {
		this.b += b;
		
	}

	@Override
	public void reset() {
	a=b=0;
		
	}
	
	@Override
	public String toString() {return "Prod: a=" + a + ", b=" + b;}
	
	
}
