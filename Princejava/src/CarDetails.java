import java.util.Scanner;
public class CarDetails {
	String Car;
	int CarNo;
	double price;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name:");
		String Car = sc.nextLine();
		System.out.println("Enter the car no:");
		int Carno = sc.nextInt();
		System.out.println("Enter the price:");
		double price =sc.nextDouble();
		System.out.println("Car name:" +Car);
		System.out.println("Car no:" +Carno);
		System.out.println("Price:" +String.format("%.2f rs only",price));
	}
}
