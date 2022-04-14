package org.andestech.learn2022.gof2.proxy;

public class Proxy implements IService {

private Service s;	
	
public Proxy(Service s)
{this.s = s;}


private boolean checkData() {
	return true;
	
}

@Override
public void op() throws Exception {

if(checkData()) s.op();
else throw new Exception("Wrong data...");
	
}

}
