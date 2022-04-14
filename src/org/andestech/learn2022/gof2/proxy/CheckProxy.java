package org.andestech.learn2022.gof2.proxy;

public class CheckProxy {

	public static void main(String[] args) throws Exception {

	IService s = new Proxy(new Service());
	s.op();
		
		
	}

}
