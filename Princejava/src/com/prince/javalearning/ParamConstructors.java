package com.prince.javalearning;
public class ParamConstructors {
	String animal_name;
	String animal_type;
	ParamConstructors(String name,String type){ //Declaring Parameterized constructor and storing the values
		animal_name=name;
		animal_type=type;
	}
	public void Animalcharacteristics() { //Method
		System.out.println("Animal Name is " +animal_name+" and type is " +animal_type);
	}
	public static void main(String[] args) {
		ParamConstructors animal1 = new ParamConstructors("Tiger", "Carnivorous");
		animal1.Animalcharacteristics();
	}
}
