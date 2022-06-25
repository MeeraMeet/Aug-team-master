package com.oops;

public class InterfaceInherit implements DemoInterface, DemoInterface2 {

	

	@Override
	public void sub() {
		System.out.println("we are in sub method");
		
	}

	@Override
	public void mul() {
		System.out.println("we are in mul method");
		
	}
	
	public static void main(String[] args) {
		DemoInterface d = new InterfaceInherit();
		d.sub();
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	
}
