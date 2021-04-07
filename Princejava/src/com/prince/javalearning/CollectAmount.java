package com.prince.javalearning;
public class CollectAmount {
	public Integer collectedAmount=3000; //Wrapper Class
	public Integer collectAmountAndGiveItToMe() //Return Statement Integer is Declared
	{
		System.out.println("Daddy i have collected Rupees " +collectedAmount);
		return collectedAmount;
	}
	public static void main(String[] args) {
		//Return Types
		CollectAmount mySon = new CollectAmount();
		Integer Amount=mySon.collectAmountAndGiveItToMe();//Storing it in Integer
		System.out.println("Got the amount son:" +Amount);
	}
}