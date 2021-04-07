package com.prince.javalearning;
public class StaticVariables {
	static int accountbalance =100;
	String depositedby;
	public static void main(String[] args) {
		StaticVariables object1 = new StaticVariables();
		object1.accountbalance =1000;
		object1.depositedby ="Prince";
		StaticVariables object2 =new StaticVariables();
		object2.accountbalance =2000; //Value 2000 is shared among other instances
		object2.depositedby ="Shino";
		System.out.println("Object1 Integer : " +object1.accountbalance);
		System.out.println("Object1 String :" +object1.depositedby);
		System.out.println("Object2 Integer :" +object2.accountbalance);
		System.out.println("Object2 String :" +object2.depositedby);
	}
}
