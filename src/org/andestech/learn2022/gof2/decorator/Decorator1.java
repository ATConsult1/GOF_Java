package org.andestech.learn2022.gof2.decorator;

public class Decorator1 extends ADecorator {
   
	public Decorator1(AComponent c)
	{super(c);}
	
	@Override
	public void ops() {
	System.out.println("pre call..");
	getComponent().ops();
	System.out.println("post call..");
	}

	
}
