package com.prince.javalearning;
public class Overriding_C extends Overriding_P {
	@Override //Overriding the method with different Implementation
	public void shows() {
		System.out.println("No..!! I would like to watch Naruto");
	}
	public static void main(String[] args) {
		Overriding_P P = new Overriding_C(); //Base Class reference = Child class object
		P.properties();
		P.shows();
	}
}