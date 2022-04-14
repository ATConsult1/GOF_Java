package org.andestech.learn2022.gof3.templatemethod;

public class CheckTMethod {

	public static void main(String[] args) {

		AAccount da = new DebitAccount(1000);
		System.out.println(da);
		da.withdraw(50);
		System.out.println(da);
		da.withdraw(39.9);
		System.out.println(da);
		System.out.println("---------------------------");
		
		da = new CreditAccount(-100);
		System.out.println(da);
		da.withdraw(50);
		System.out.println(da);
		da.withdraw(39.9);
		System.out.println(da);
		
		
		
	}

}
