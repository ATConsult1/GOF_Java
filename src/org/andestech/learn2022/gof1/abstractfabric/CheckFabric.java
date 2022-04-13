package org.andestech.learn2022.gof1.abstractfabric;

public class CheckFabric {

	private static  IProductA a;
	private static  IProductB b;
	
	private static void produce(AbstractFactory af)
	{
		a = af.produceA();
		b = af.produceB();
	}
	
	public static void main(String[] args) {
	
 //
		AbstractFactory af = new GreenProductFactory();
		a = af.produceA();
		b = af.produceB();
//
		af = new RedProductFactory();
		a = af.produceA();
		b = af.produceB();
//
		System.out.println("------------------------------------------------");
		produce(new GreenProductFactory());
		produce(new RedProductFactory());
		
		
	
	}

}
