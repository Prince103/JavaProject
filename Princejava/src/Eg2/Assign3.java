package Eg2;
import java.util.Scanner;

public class Assign3 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number to print the multiplication table");
		a=in.nextInt();
		in.close();
		System.out.println("Multiplication Table of :" +a);
		
		for(b=0;b<=10;b++) {
			System.out.println(a+ "*" +b+ "=" +(a*b));
		}
	}
}
