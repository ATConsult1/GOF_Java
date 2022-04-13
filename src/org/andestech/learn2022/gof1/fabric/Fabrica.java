package org.andestech.learn2022.gof1.fabric;

public class Fabrica {
     //....
	
	 public static IProduct produce(String t)
	 { 
		 IProduct prod = null; 
		 switch(t)
		 {
		 case("A"): prod = new ProductA(); break; 
		 case("B"): prod = new ProductB(); break;
		 default: prod = new ProductB();
		 }
		 
		 return prod;
	 }
	//..
	
//	{	}
	
}
