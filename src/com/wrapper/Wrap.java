package com.wrapper;

public class Wrap {
	public static void main(String[] args) {



		//int - Integer ; char Character, byte Byte, short Short
System.out.println("******* BOX ********");
		int a =10;
		Integer i =a;//autoboxing
		System.out.println(i.toOctalString(a));
		Integer i1 = new Integer(a); // manually boxing it.
		
		System.out.println("******* UNBOX ********");
		int b = i.intValue();//manual unboxing
		//autounboxing 
		int c =i;
		System.out.println("Manually unboxed b is: " +b);
		System.out.println("Autounboxed c is: " +c);
		
		System.out.println("******** TYPE CASTING ***********");
		int d =1;
		byte e = 5;
		float f = 20;
		double g = 25;
		

		
		
		
	}
	

}
