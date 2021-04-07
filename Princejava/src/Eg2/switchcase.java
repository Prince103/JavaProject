package Eg2;
import java.util.Scanner;

public class switchcase {
	public static void main(String args[]) {
		int day;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the day:");
		day=in.nextInt();
		in.close();
		switch(day)
		{
		case 1:System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		default:System.out.println("Invalid Entry");
		}
	}
}
