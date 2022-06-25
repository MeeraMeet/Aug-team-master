package com.oops;

public class OperatorsInJava {

	//arithmetic
	//assignment int a =10;
	//relational
	//logical
	//unary
	//ternary
	
	public static void main(String[] args) {
		int a = 25;
		int b = 20;
		int c= 30;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("a++ is: " + ++a); //it got incremented by 1
		System.out.println("a-- is: " + --a);
		
		//"condition ? if true: if false"
		
		if (a<b || a<c)
		{
			System.out.println("a is smaller");
		}
		
	}

}
