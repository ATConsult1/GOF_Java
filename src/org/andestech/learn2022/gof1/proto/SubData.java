package org.andestech.learn2022.gof1.proto;

public class SubData implements Cloneable{

	public int b = 100;
//...
  
   public SubData clone() throws CloneNotSupportedException {
	   return (SubData) super.clone();
}

}
