package org.andestech.learn2022.gof3.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
	
	private List<ISubscriber> subscribers;
	
	public Publisher() {
		subscribers = new ArrayList<>();
	}
	
	//...
	public void updateSubscribers() {
		for(ISubscriber s: subscribers)
		{
			s.update();
		}
	}
	
	public void updateSubscribers(String message) {
		for(ISubscriber s: subscribers)
		{
			s.update(message);
		}
	}
	
	public Publisher add(ISubscriber s) {subscribers.add(s); return this;}
	public Publisher rm(ISubscriber s) {subscribers.remove(s); return this;}
	

}
