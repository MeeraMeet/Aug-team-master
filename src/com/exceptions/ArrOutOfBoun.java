package com.exceptions;

public class ArrOutOfBoun {
public static void main(String[] args) {
	try {
		int a[]= new int[2];
		// a[0], a[1]
		a[3] = 1;
		System.out.println("I am in try block");
		}
	
	catch (ArithmeticException e)
	{
		System.out.println("This is Arith exception");
		
	}
	
	catch (ArrayIndexOutOfBoundsException e)
	{
	
		e.printStackTrace();
	}
	catch (Exception e)
	{
		System.out.println("Other unhandled exception");
	}
	
	finally {
		// this piece of code is definitely executed before breaking
		int a=10;
		int b=20;
		int c = a+b;
		System.out.println(c);
	}
System.out.println("done with exception handling");			
}

}
