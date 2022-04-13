package org.andestech.learn2022.gof2.facade;

public class CheckFacade {

	public static void main(String[] args) {

		Facade facade = new Facade(new F1(), new F2());
		facade.do1();
		System.out.println("------------------------");
		facade.do2();
		
	}

}
