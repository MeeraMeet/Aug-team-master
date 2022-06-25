package ifElse;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
	// Donate Blood and Conditions are You being > 18 years of age and >60 KGs.
		System.out.println("Enter the age");	
		System.out.println("Enter the weight");
		Scanner sc = new Scanner(System.in);
	   //1)
		int age = sc.nextInt();
	   //2)
		int weight = sc.nextInt();
	   
	   if (age >= 18) {
		   if (weight >= 65)
		   {
			   System.out.println("Eligible to donate the blood");
		   }
	   }
	   else
	   {
		   System.out.println("not eligible");
	   }
	}

}
