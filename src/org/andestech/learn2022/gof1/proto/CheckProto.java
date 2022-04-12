package org.andestech.learn2022.gof1.proto;

public class CheckProto {

	public static void main(String[] args) throws CloneNotSupportedException {

	Data d1 = new Data();
	d1.sd.b = 0;
	Data d2 = d1.clone();
	
	System.out.println("" + d1 + ", " + d2);
	System.out.println("d1.a=" + d1.a + ", d2.a= " + d2.a);
	System.out.println("d1.sd.b=" + d1.sd.b + ", d2.sd.b= " + d2.sd.b);
	
	System.out.println("" + d1.sd + ", " + d2.sd);
	
	d1.a = 10; d1.sd.b = -100;
	//System.out.println("d1.a=" + d1.a + ", d2.a= " + d2.a);
	System.out.println("d1.sd.b=" + d1.sd.b + ", d2.sd.b= " + d2.sd.b);
		
	}

}
