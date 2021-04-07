package Eg1;

public class Operators {

	public static void main(String[] args) {
		
		int a=120;
		int b=120;
		
	//Arithmetic Operators
		System.out.println("----------Arithmetic Operators----------");
		System.out.println("Sum of a and b is:" + (a+b));
		System.out.println("Diff of a and b is:" + (a-b));
		System.out.println("Mul of a and b is:" + (a*b));
		System.out.println("Div of a and b is:" + (a/b));
		System.out.println("Mod Div of a and b is:" + (a%b));
		
	//Relational Operators
    //Returns Boolean values
		System.out.println("----------Relational Operators----------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
	//Logical Operators
	//Works between two boolean values
		System.out.println("----------Logical Operators----------");
		boolean x=true;
		boolean y=false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
	//Increment or Decrement Operators
		a=10;
	    a++;
		System.out.println("----------Increment/Decrement Operators----------");
		System.out.println("The increment value of a is :" + (a));
		
		b=58;
		b--;
		System.out.println("The Decrement value of b is :" + (b));

	}

}
