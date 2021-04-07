import java.util.*;
public class Main
{
    int item1;
	int item2;
	int item3;
	int total;
    public static void main(String[] args)
    {
        int total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the shipping cost of Item 1");
		int item1=sc.nextInt();
		System.out.println("Enter the shipping cost of Item 2");
		int item2=sc.nextInt();
		System.out.println("Enter the shipping cost of Item 3");
		int item3=sc.nextInt();
		total =(item1+item2+item3);
		System.out.println("Total shipping cost of items is " +total);
    }
}