package ifElse;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
	
		int marks;
		System.out.println("Enter Marks : ");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		
		// if it is > 90 lets put him in S grade, if it is between 80 and 90 A, 70-80 B, 60-70 C, 50-60 D, 50 F
		
		if (marks < 50)
		{
			System.out.println("F");
		}
		else if (marks >=50 && marks <60 )
		{
			System.out.println("D");
		}
		else if (marks >=60 && marks <70 )
		{
			System.out.println("C");
		}
		else if (marks >=70 && marks <80 )
		{
			System.out.println("B");
		}
		else if (marks >=80 && marks <90 )
		{
			System.out.println("A");
		}
		else if (marks >=90 && marks <=100 )
		{
			System.out.println("S");
		}
		else
		{
			System.out.println("Entered Invalid marks!");
		}

	}

}
