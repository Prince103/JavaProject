package Eg2;
import java.util.Scanner;
public class nestedifelse {

	public static void main(String[] args) {
		int day;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the day of week");
		day=in.nextInt();
		in.close();
		if(day==1)
		{
		System.out.println("The day of the week is MONDAY");
		}
		else if(day==2)
		{
		System.out.println("The day of the week is TUESDAY");
		}
		else if(day==3)
		{
		System.out.println("The day of the week is WEDNESDAY");
		}
		else if(day==4)
		{
		System.out.println("The day of the week is THURSDAY");
		}
		else if(day==5)
		{
		System.out.println("The day of the week is FRIDAY");
		}
		else if(day==6)
		{
		System.out.println("The day of the week is SATURDAY");
		}
		else if(day==7)
		{
		System.out.println("The day of the week is SUNDAY");
		}
		else
		{
		System.out.println("No weeks");
	}
	}
}
