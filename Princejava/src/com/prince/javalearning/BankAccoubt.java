package com.prince.javalearning;

public class BankAccoubt {
	
	Long accountnumber= (long) 12345678; //Wrapper Class for Long
	String accountholderName= "Prince";
	Integer accountBalance=7800; //Wrapper Class for Integer
	
public void getBalance() {
	System.out.println("Balance is:" +accountBalance);
}

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		  BankAccoubt account = new BankAccoubt();
		  account.getBalance();

	}

}
