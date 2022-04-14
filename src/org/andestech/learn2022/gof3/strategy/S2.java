package org.andestech.learn2022.gof3.strategy;

public class S2 implements IStrategy {

	//....
	
	@Override
	public void op(int a1, int a2) {
		System.out.printf("S2: a1: %d, a2: %d ---\n",a1,a2);
	}

}
