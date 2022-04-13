package org.andestech.learn2022.gof2.adapter;

public class Client2CusomerAdapter implements IClientSalute {

	private ICustomerSalute c;
	
	public Client2CusomerAdapter(ICustomerSalute c)
	{this.c = c;}
	
	//...
	@Override
	public String sayHello() {
		return c.sayPrivet();
	}

}
