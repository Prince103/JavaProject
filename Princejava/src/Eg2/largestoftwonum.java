package Eg2;
import java.util.Scanner;

public class largestoftwonum {
	public static void main(String args[]) {
		int a;
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number a:");
		a=in.nextInt();
		System.out.println("Enter the number b:");
		b=in.nextInt();
		in.close();
		if (a>b) {
			System.out.println("A is largest");
		}
			else
			{
			System.out.println("B is largest");
			}
		}
		
	}
