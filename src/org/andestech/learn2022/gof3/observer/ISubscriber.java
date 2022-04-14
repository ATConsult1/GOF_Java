package org.andestech.learn2022.gof3.observer;

public interface ISubscriber {

	public void update();
	public void update(String message);
}
