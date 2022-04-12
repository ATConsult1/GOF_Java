package org.andestech.learn2022.gof1.singleton;

public class testSingleton {

	public static void main(String[] args) {
	
	Singleton s1 = Singleton.generateInstance();
	Singleton s2 = Singleton.generateInstance();
	
	System.out.println(""+ s1 + "\n" + s2);
		
	}

}
