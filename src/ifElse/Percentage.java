package ifElse;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		double a;
		double b;
		System.out.println("Enter the a");	
		System.out.println("Enter the b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		double percentage = a/b*100;
		System.out.println("Percentage is: " +percentage +"%");

	}

}
