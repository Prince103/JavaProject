package com.prince.javalearning;
public class StringBuffer {
public StringBuffer(String string) {
}
public static void main(String[] args){
	System.out.println("String is Immutable");//Immutable
	String name = "Prince";
	System.out.println("Appending a name to Original: " +name.concat("Kirubakaran"));
	System.out.println("Original Name: " +name); 
	System.out.println("*******************************************");
	System.out.println("String is Mutalbe"); //Mutable
	StringBuffer name1 =new StringBuffer("Prince");
	System.out.println("Appending a name to Original: " +name1.concat("Kirubakaran"));
	System.out.println("Original Name" +name1);
}

}}



