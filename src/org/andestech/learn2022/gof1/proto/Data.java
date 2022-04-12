package org.andestech.learn2022.gof1.proto;


public class Data implements Cloneable {
	
	public int a =1;
	public SubData sd;
	
	public Data() {
		sd = new SubData();
		System.out.println("++ ctor" + this);
	}
	
	public Data clone() throws CloneNotSupportedException {
		Data d2 = (Data) super.clone();
		//d2.sd = new SubData();
		d2.sd = this.sd.clone();
		
		//return (Data) super.clone();
		return d2;
	}

}
