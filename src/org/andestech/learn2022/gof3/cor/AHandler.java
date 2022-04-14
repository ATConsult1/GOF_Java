package org.andestech.learn2022.gof3.cor;

public abstract class AHandler {

protected AHandler nextHandler;	
public abstract boolean handle(String data);


public AHandler addNext(AHandler h)
{
  nextHandler = h;
  return h;
}
	
}
