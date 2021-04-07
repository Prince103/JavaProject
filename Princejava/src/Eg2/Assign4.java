package Eg2;

public class Assign4 {

	public static void main(String[] args) {
		int count=0,num=458968;
		while (num !=0) {
			num /=10;
			++count;
		}
     System.out.println("Number of digits:" +count);
	}

}
