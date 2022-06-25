package ifElse;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter the number");
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
	    number = sc.nextInt();
		
		
		if (number % 2 == 0) //.equals() of strings
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}

	}
}
