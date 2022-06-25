package com.oops;

public abstract class Bike { //super class or parent class or base class
	//Difference between Abstract class, interface and a normal class is: Abstract class can have unimplemented(abstract) + implmented methods
	// interface has only abstract methods
	// class -> you guys give it a try to form abstract methods in the class and check.

	int a;
	String wheelType="alloy";
	
	abstract void wheels();
	abstract void type();

	//COnstructor. 
	Bike()
	{
		System.out.println("Bike Constructor");	
	}

	// a implemented method
	public void seats()
	{
		System.out.println("leather");
	}

}
