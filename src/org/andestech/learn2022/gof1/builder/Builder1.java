package org.andestech.learn2022.gof1.builder;

public class Builder1 implements IBuilder {
    
	private IProduct prod;
	
	public Builder1(IProduct p) {prod = p;}
	
	@Override
	public IBuilder doA() {
	System.out.println("++doA " + this);
	prod.addA(10);	
	return this;
	}

	@Override
	public IBuilder doB() {
		System.out.println("++doB " + this);
		prod.addB(5);
		return this;
	}

	
	public IProduct doFinal() {
		return prod;
		
	}

	@Override
	public void reset() {
		prod.reset();
		System.out.println("reset state " + this);
		
	}

}
