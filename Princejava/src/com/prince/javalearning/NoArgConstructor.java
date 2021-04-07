package com.prince.javalearning;
public class NoArgConstructor {
	int emp_id;
	String emp_name;
	//Defining a No Argument Constructor
	NoArgConstructor(){
		//Initialize value to constructor
		emp_id=103;
		emp_name="Prince";
		System.out.println("No Argument Constructor is Created");
	}
	public static void main(String[] args) {
		NoArgConstructor noargconstructor = new NoArgConstructor();	
	}
}
