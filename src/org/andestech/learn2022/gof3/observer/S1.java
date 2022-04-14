package org.andestech.learn2022.gof3.observer;

public class S1 implements ISubscriber{

@Override
public void update() {
System.out.println("S1 subscriber update. New message:");	
}

@Override
public void update(String message) {
	System.out.println("++S1 subscriber update. New message: " + message);	
	
}

}
