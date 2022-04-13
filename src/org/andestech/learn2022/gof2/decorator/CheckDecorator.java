package org.andestech.learn2022.gof2.decorator;

public class CheckDecorator {

	private static void testComponent(AComponent c)
	{
		c.ops();
		//...
	}
	
	
	public static void main(String[] args) {

	//1
	testComponent(new Component1());
	//2
	System.out.println("----------------------");
	testComponent(new Decorator1(new Component1()));

	}

}
