package org.andestech.learn2022.gof1.singleton;

public class Singleton {
	  private static Singleton st = null;
	
      private Singleton() {}
      
      public static Singleton generateInstance() {
    	 if (st == null) st = new Singleton();
    	 return st;
      }
}
