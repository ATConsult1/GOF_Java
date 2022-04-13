package org.andestech.learn2022.gof1.fabric;

public class CheckFabric {

	public static void main(String[] args) {
	
	//------------
	//1	
		
	IProduct p = Fabrica.produce("A");
	Fabrica.produce("A");
	Fabrica.produce("B");
	
	//-----------------------------
	//2
	
	AFabrica af = new ProducerA(); af.produce();
	af = new ProducerB(); af.produce();
	
	}

}
