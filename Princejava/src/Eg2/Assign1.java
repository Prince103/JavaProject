package Eg2;
import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		a=in.nextInt();
		in.close();
		if (a>0) {
			System.out.println("The entered number " +a+ " is Positive");
		} else {
			System.out.println("The entered numnber " +a+ " is Negative");
		}
	}

}
