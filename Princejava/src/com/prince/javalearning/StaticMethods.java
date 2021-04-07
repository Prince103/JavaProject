package com.prince.javalearning;
public class StaticMethods {
	public static void method1() { //Static Method is created
		System.out.println("Static Method");
	}
	public void nonstaticmethod() {
		method1(); //Static Method can be called from Non-Static Method
		System.out.println("Non-Static Method");
	}
	public static void main(String[] args) {	
	}
}
