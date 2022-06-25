package com.oops;

// We defined Bike as abstract class and we are implementing it using the Ducati class. So bike is parent for me and ducati is child that is impl
//the bike

public class Ducati extends Bike { //ducati is child class or subclass or derived class
	@Override
	void wheels() {
		System.out.println("Ducati Alloy of 17 inch");
		System.out.println(super.wheelType);
		System.out.println(super.a);
		
	}
	@Override
	void type() {
		System.out.println("Ducati engine is of Petrol type");	
	}
	Ducati(){
		super();
		System.out.println("Ducati Constructor");
	}
	public static void main(String[] args) {
		Bike b = new Ducati();
		
		
		
	}
}
