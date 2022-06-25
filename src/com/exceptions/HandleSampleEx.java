package com.exceptions;

public class HandleSampleEx {
public static void main(String[] args) {
	//For exceptions we have Throwable class as a Parent class.
	try {
	int i =0;
	int j = 1/i;
	System.out.println(j);
	}
	catch (ArithmeticException e)
	{
		System.out.println("you should not divide by 0");
	}
	
	// Exceptions -> I/O ; SQL ; ClassNotfound; RunTimeExceptions
	// RunTime -> Arithmetic, NumberFormat, Indexout of bound, Nullpoint
	//Indexoutofbound -> ArrayIndexoutofBound, StringIndexOutofBound
}
}
