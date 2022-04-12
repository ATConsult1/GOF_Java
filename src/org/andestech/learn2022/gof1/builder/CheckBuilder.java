package org.andestech.learn2022.gof1.builder;

public class CheckBuilder {

	public static void main(String[] args) {

    IBuilder b1 = new Builder1(new Product1());
    Director dir = new Director(b1);
    
    dir.doAll();
    
    IProduct p1 = b1.doFinal();
    System.out.println(p1);
		
	}

}
