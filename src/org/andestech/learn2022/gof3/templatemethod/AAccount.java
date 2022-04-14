package org.andestech.learn2022.gof3.templatemethod;

public abstract class AAccount {

private double balance;
	
public double getBalance() {
	return balance;
}

@Override
public String toString() {
	return "Account: " + balance;}


public abstract boolean checkOneOperation(double sum);
public abstract boolean checkBalance(double sum);
	
public AAccount(double balance) {
	this.balance = balance;
}

public final void withdraw(double sum) {
	if( sum>0 && checkOneOperation(sum) && checkBalance(sum))
	{
		balance -= sum;
	}
	else 
		throw 
		new OPerationException("Error withdrawal ops: sum=" + 
		sum + ", balance:" + balance);
	
}	
	
}
