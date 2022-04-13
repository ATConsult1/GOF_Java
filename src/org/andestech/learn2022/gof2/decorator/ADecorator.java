package org.andestech.learn2022.gof2.decorator;

public abstract class ADecorator extends AComponent {
	
	private AComponent c;
	public ADecorator(AComponent c)
	{this.c = c;}
	
	public AComponent getComponent() {return c;}
	
//	public abstract void ops();

}
