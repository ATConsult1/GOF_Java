package org.andestech.learn2022.gof3.observer;

public class S2 implements ISubscriber{

@Override
public void update() {
System.out.println("S2 subscriber update. New message:");	
}

@Override
public void update(String message) {
	System.out.println("++ S2 subscriber update. New message: " + message);	
	
}

}
