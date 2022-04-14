package org.andestech.learn2022.gof3.templatemethod;

public class DebitAccount extends AAccount {

	
	
	public DebitAccount(double balance) {
		super(balance);
		if(balance < ABSConstants.DEBIT_FIXED_BALANCE) throw new AccountException("wrong ballance: " + balance);
		
	
	}

	@Override
	public boolean checkOneOperation(double sum) {

		return sum<ABSConstants.DEBIT_LIMIT_ONE_OPERATION;
	}
	
	@Override
	public boolean checkBalance(double sum) {
		return getBalance() - sum > ABSConstants.DEBIT_FIXED_BALANCE ;
	}

}
