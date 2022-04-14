package org.andestech.learn2022.gof3.cor;

public class Handler2 extends AHandler{ //implements IHandler {

//private IHandler nextHandler;	
//	
//public IHandler addNext(IHandler h)
//{
//  nextHandler = h;
//  return h;
//}

private boolean isReadyToHandle(String data)
{
	return data.startsWith("ftp");
}

@Override
public boolean handle(String data) {
	if(isReadyToHandle(data))
		{System.out.println("+++ FTP Request to: " + data);
		return true;
		}
	else {
		System.out.println("try next handler...");
		if (nextHandler == null || nextHandler == this )
			return false;
		else nextHandler.handle(data);
	} 
	
	
	return false;
}




}
