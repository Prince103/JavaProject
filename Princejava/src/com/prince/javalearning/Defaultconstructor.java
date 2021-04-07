package com.prince.javalearning;
public class Defaultconstructor {
	String student_name;//Returns Null (Class default value is null)
	int student_id;//Returns 0
	// Default Constructor
    // Compiler creates a default one with a class file which we wont be able to see
	public static void main(String[] args) {
	Defaultconstructor student = new Defaultconstructor();
	System.out.println(student.student_name);
	System.out.println(student.student_id);
	}
}
