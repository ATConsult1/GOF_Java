package org.andestech.learn2022.gof2.facade;

public class Facade {
	
	public Facade(F1 f1, F2 f2) {
		this.f1 = f1;
		this.f2 = f2;
	}
	
	private F1 f1;
	private F2 f2;
	
	public void do1() {
		f1.doSmth();
		f1.doSmth();
		f2.doSmthGood();
	}
	
	public void do2() {
	
		f2.doSmthGood();
		f1.doSmth();
	}
	
	//.....
	

}
