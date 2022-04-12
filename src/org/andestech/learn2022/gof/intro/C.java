package org.andestech.learn2022.gof.intro;

public class C implements IA {
	private B b;
	
	public C() {
	  b = new B();	
	}

	public B getB() {return b;}
}
