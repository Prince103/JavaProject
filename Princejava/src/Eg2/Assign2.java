package Eg2;
import java.util.Scanner;

public class Assign2 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number a:");
		a=in.nextInt();
		System.out.println("Enter the number b:");
		b=in.nextInt();
		System.out.println("Enter the number c:");
		c=in.nextInt();	
		in.close();
		if (a>b && a>c) {
			System.out.println("A is largest");
		}
		else if(b>c && b>a) {
			System.out.println("B is largest");
		} else if(c>a && c>b) {
			System.out.println("C is largest");
		}
	}

}
