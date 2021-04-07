package sba;

import java.util.Scanner;

public class MegaMartDiscount {
	int Customer_ID;
	String Customer_type;

	public static void main(String[] args) {
		int c;
		int b;
		int d;
		int dis = 0;
		int amount;
		Scanner Cus_ID=new Scanner(System.in);
		System.out.println("Enter the Customer ID: ");
		c=Cus_ID.nextInt();	
		
		
		if(c<0)
		{
			System.out.println(+c+ "is not a valid customer id" );
		}
		Scanner Bill_Amount=new Scanner(System.in);
		System.out.println("Enter the Bill Amount: ");
		b=Bill_Amount.nextInt();	
		if(b<0)
		{
			System.out.println(+b+ "is not a valid customer id" );
		}
		for (int i =1;i<=c;i++)
		{
		if(i<100)
		{
			d=100-dis;
			amount = (d*b)/100;
		}
		}
		

	}

}
