package org.andestech.learn2022.gof3.strategy;

public class CheckStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	IStrategy s = new S1();
	s.op(1, 10);
	s = new S2();
	s.op(10, -10);
		
	}

}
