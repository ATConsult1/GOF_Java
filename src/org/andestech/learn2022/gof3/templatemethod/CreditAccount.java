package org.andestech.learn2022.gof3.templatemethod;

public class CreditAccount extends AAccount {


	
	public CreditAccount(double balance) {
		super(balance);
		if(balance < -ABSConstants.CREDIT) throw new AccountException("wrong ballance: " + balance);
		
	}

	@Override
	public boolean checkOneOperation(double sum) {
		return sum<ABSConstants.CREDIT_LIMIT_ONE_OPERATION;
	}

	@Override
	public boolean checkBalance(double sum) {
		return getBalance() - sum + ABSConstants.CREDIT > 0 ;
	}

}
