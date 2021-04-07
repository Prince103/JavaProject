import java.util.Scanner;
public class HighestPlacement {
	int CSE;
	int ECE;
	int MECH;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE");
		int CSE =sc.nextInt();
		System.out.println("Enter the no of students placed in ECE");
		int ECE =sc.nextInt();
		System.out.println("Enter the no of students placed in MECH");
		int MECH =sc.nextInt();
		if(CSE<0||ECE<0||MECH<0) {
			System.out.println("Input Invalid");
		}
		else if((CSE==ECE)&& (ECE==MECH)) {
			System.out.println("None of the department has got the highest placement");
		}else {
			System.out.println("Highest placement");
			if((CSE>ECE)&&(CSE>MECH)){
				if(CSE==ECE) {
					System.out.println("CSE" +"\nECE");
				}else if (CSE==MECH) {
					System.out.println("CSE" +"\nMECH");
				} else
					System.out.println("CSE");
			} else if (ECE>=MECH) {
				if(ECE==MECH) {
					System.out.println("ECE" + "\nMECH");
				}else 
					System.out.println("ECE");}
				else
					System.out.println("MECH");
			}
		}
		}

