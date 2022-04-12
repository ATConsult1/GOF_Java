package org.andestech.learn2022.gof1.builder;

public class Builder2 implements IBuilder {
    
	private IProduct prod;
	
	public Builder2(IProduct p) {prod = p;}
	
	@Override
	public IBuilder doA() {
	System.out.println("++doA " + this);
	prod.addA(-1);	
	return this;
	}

	@Override
	public IBuilder doB() {
		System.out.println("++doB " + this);
		prod.addB(-2);
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
