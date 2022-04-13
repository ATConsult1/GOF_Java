package org.andestech.learn2022.gof2.adapter;

public class CheckAdapter {

	public static void main(String[] args) {

	IClientSalute c1 = new Client();
	System.out.println(c1.sayHello());
	
	c1 = new Client2CusomerAdapter(new Customer());
	System.out.println(c1.sayHello());
	
	c1 = new Client2CusomerAdapter(new Customer2());
	System.out.println(c1.sayHello());

	}

}
