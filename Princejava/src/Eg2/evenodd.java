package Eg2;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		num=in.nextInt();
		in.close();
		if(num % 2 ==0){
			System.out.println("The entered number is Even number");
		}
			else
			System.out.println("The entered number is Odd number");	
			
		}

	}


