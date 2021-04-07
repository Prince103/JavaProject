import java.util.Scanner;
public class BillGeneration {
	int pizza;
	int puffs;
	int cooldrinks;
	public static void main(String[] args) {
		int price;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought");
		int pizza =sc.nextInt();
		System.out.println("Enter the no of puffs bought");
		int puffs =sc.nextInt();
		System.out.println("Enter the no of cool drinks bought");
		int cooldrinks =sc.nextInt();
		System.out.println("Bill Details");
		System.out.println("No of pizzas \n" +pizza);
		System.out.println("No of puffs \n" +puffs);
		System.out.println("No of cooldrinks \n" +cooldrinks);
		price =((pizza*100)+(puffs*20)+(cooldrinks*10));
		System.out.println("Total price \n" +price);
		System.out.println("ENJOY THE SHOW!!!");
	}
}
