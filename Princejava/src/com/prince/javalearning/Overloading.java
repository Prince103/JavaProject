package com.prince.javalearning;
public class Overloading {
	int add (int a1,int a2) //Creating with same method name but passing different arguments
	{
		return a1+a2;
	}
	int add (int a1,int a2, int a3)
	{
		return a1+a2+a3;
	}
	public static void main(String[] args) {
		Overloading add1 = new Overloading();
		System.out.println("Sum of two numbers: " +add1.add(100, 200));
		System.out.println("Sum of three numbers: " +add1.add(300, 200, 10));
	}
}
