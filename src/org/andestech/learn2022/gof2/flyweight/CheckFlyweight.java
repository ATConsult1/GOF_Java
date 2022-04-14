package org.andestech.learn2022.gof2.flyweight;

public class CheckFlyweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Data2Cache d2c = new Data2Cache("Hello", "Hi");	
	
	Data2 d2 = new Data2(0, 0, 0, d2c);
	Data2 d3 = new Data2(0, 0, 10, d2c);
	
	
	}

}
