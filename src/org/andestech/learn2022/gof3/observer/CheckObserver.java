package org.andestech.learn2022.gof3.observer;

public class CheckObserver {

	public static void main(String[] args) {
		
	ISubscriber s1 = new S1();	
	ISubscriber s2 = new S2();	
	ISubscriber s3 = new S3();	
		
	Publisher p = new Publisher();
	p.add(s3).rm(s1);
	
	
	
	
	p.updateSubscribers("New books arrived..");
		
	}
	
}
