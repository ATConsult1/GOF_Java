package org.andestech.learn2022.gof2.bridge;

public class Data implements IData {
	private int a;

	@Override
	public void setPeriod(int a) {
	this.a = a;
		
	}

	@Override
	public int getPeriod() {
		return a;
	}
	

}
