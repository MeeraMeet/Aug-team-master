package com.oops;

public class OverloadClass {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	public double sum(double a, double b)
	{
		return a+b;

	}
	public void sum()
	{
		int a = 1;
		int b =2;
		int c = a+b;
		System.out.println("Without Overloading here, I am printing this. Sum is: " +c);
	}
	public static void main(String[] args) {
		OverloadClass o = new OverloadClass();
		o.sum();
		System.out.println("Overloaded with 2 args. Data Type is int. Sum is: " +o.sum(1, 11)); // 12
		System.out.println("Overloaded with 3 args. Data Type is int. Sum is: " +o.sum(1, 11, 22)); // 34
		System.out.println("Overloaded with 2 args. Data Type is Double. Sum is: " +o.sum(1, 2.5));//4
	}
}
