package org.andestech.learn2022.gof3.cor;

public class CheckCOR {

	public static void main(String[] args) {

//		IHandler h1 = new Handler();
//		IHandler h2 = new Handler2();
//		h1.addNext(h2);
		
		AHandler h1 = new Handler();
		AHandler h2 = new Handler2();
		h1.addNext(h2);
		
		h1.handle("ftp://www.ru");
		
	}

}
