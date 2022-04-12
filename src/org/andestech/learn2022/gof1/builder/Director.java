package org.andestech.learn2022.gof1.builder;

public class Director {
 private IBuilder builder;
 
 public Director(IBuilder b) {builder = b;}
 
 public void changeBld(IBuilder b) {builder = b;}
 
 
// public IProduct doAll() {
//	return builder.doA().doB().doFinal();
// }
 
 public void doAll() {
	 builder.doA().doA().doB().doB();
 }
	
}
